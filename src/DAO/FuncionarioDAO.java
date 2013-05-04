/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controller.ControlarFuncionario;
import SuperClasses.Funcionario;
import Utilitarios.DataCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import SuperClasses.Salario;

/**
 *
 * @author PPW
 */
public class FuncionarioDAO {
    private boolean finalizar;
    public static Integer cod;

    public void inserirFuncionario(Funcionario funcionario) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        finalizar = false;
        ControlarFuncionario c = new ControlarFuncionario();

       if (c.controlarCadastroFuncionario(funcionario)) {
            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String insereMotorista = "INSERT INTO funcionario(nome, sexo, cpf, rg, datacadastro) VALUES (?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(insereMotorista);
                    ps.setString(1, funcionario.getNome());
                    ps.setString(2, funcionario.getSituacaoSexo());
                    ps.setString(3, funcionario.getCpf());
                    ps.setString(4, funcionario.getRg());
                    ps.setDate  (5, data.DataAtual());
                    ps.executeUpdate();
                    
                    String insereEndereco = "INSERT INTO endereco_funcionario(endereco, numero, uf, cidade, bairro, cep) values (?,?,?,?,?,?)";
                    PreparedStatement ps1 = conn.prepareStatement(insereEndereco);
                    ps1.setString(1, funcionario.getEndereco().getEndereco());
                    ps1.setString(2, funcionario.getEndereco().getNumero());
                    ps1.setString(3, funcionario.getEndereco().getSituacaoUF());
                    ps1.setString(4, funcionario.getEndereco().getCidade());
                    ps1.setString(5, funcionario.getEndereco().getBairro());
                    ps1.setString(6, funcionario.getEndereco().getCep());
                    ps1.executeUpdate();
                    
                    String insereContato = "INSERT INTO contato_funcionario(telefone_residencial, telefone_celular, email) values (?,?,?)";
                    PreparedStatement ps2 = conn.prepareStatement(insereContato);
                    ps2.setString(1, funcionario.getContato().getTelefone_residencial());
                    ps2.setString(2, funcionario.getContato().getTelefone_celular());
                    ps2.setString(3, funcionario.getContato().getEmail());
                    ps2.executeUpdate();
                    
                    String insereDepartamento = "INSERT INTO departamento(nome_departamento,cod_departamento, nome_cargo, dataentrada) VALUES (?,?,?,?)";
                    PreparedStatement ps3 = conn.prepareStatement(insereDepartamento);
                    ps3.setString(1, funcionario.getDepartamento());
                    ps3.setInt   (2, funcionario.getCod());
                    ps3.setString(3, funcionario.getCargo());
                    ps3.setDate  (4, data.DataAtual());
                    ps3.executeUpdate();
                    
                    ps.close();
                    ps1.close();
                    ps2.close();
                    ps3.close();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + " ERRO NO BANCO DE DADOS! ");
                    finalizar = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, " Algo deu errado com a conexão com o banco de dados (ERROR TABELA: motorista_terceirzado)! ");
                finalizar = false;
            }

        }
        if (finalizar == true) {
            JOptionPane.showMessageDialog(null, " CADASTRO SALVO COM SUCESSO! ");

        } else if (finalizar == false) {
            JOptionPane.showMessageDialog(null, " ERRO AO CADASTRAR! VEJA SE TODOS OS CAMPOS ESTÂO PREENCHIDOS CORRETAMENTE ");
        }
    }

    public void updateFuncionario(Funcionario funcinonario) {
        Connection conn = new ConexaoBanco().conectaAgora();
        ControlarFuncionario c = new ControlarFuncionario();
        finalizar = false;

        if (c.controlarCadastroFuncionario(funcinonario)) {
            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado1 = conn.createStatement();
                    String updateCliente = "UPDATE funcionario set nome ='" + funcinonario.getNome() + "'"
                            + ", cpf   ='" + funcinonario.getCpf() + "'"
                            + ", rg    ='" + funcinonario.getRg() + "'"
                            + ", sexo  ='" + funcinonario.getSituacaoSexo() + "'"
                            + " WHERE  cod = " + cod + " ";
                    PreparedStatement ps = conn.prepareStatement(updateCliente);
                    ps.executeUpdate();
                    ps.close();

                    Statement estado2 = conn.createStatement();
                    String updateCliente1 = "UPDATE endereco_funcionario set endereco ='" + funcinonario.getEndereco().getEndereco() + "'"
                            + ", numero = '" + funcinonario.getEndereco().getNumero() + "'"
                            + ", cidade = '" + funcinonario.getEndereco().getCidade() + "'"
                            + ", bairro = '" + funcinonario.getEndereco().getBairro() + "'"
                            + ", cep    = '" + funcinonario.getEndereco().getCep() + "'"
                            + ", uf     = '" + funcinonario.getEndereco().getSituacaoUF() + "'"
                            + " WHERE cod_funcionario_f = " + cod + " ";
                    PreparedStatement ps1 = conn.prepareStatement(updateCliente1);
                    ps1.executeUpdate();
                    ps1.close();

                    Statement estado3 = conn.createStatement();
                    String updateCliente2 = "UPDATE contato_funcionario "
                            + "set telefone_residencial ='" + funcinonario.getContato().getTelefone_residencial() + "'"
                            + ",telefone_celular ='"        + funcinonario.getContato().getTelefone_celular() + "'"
                            + ",email = '"                  + funcinonario.getContato().getEmail() + "'"
                            + " WHERE cod_funcionario = " + cod + " ";
                    PreparedStatement ps2 = conn.prepareStatement(updateCliente2);
                    ps2.executeUpdate();
                    ps2.close();
                    
                    Statement estado4 = conn.createStatement();
                    String updateFuncionario4 = "UPDATE departamento "
                            + "set nome_departamento    ='" + funcinonario.getDepartamento() + "'"
                            + ", nome_cargo      ='"        + funcinonario.getCargo() + "'"
                            + " WHERE cod_func = " + cod + " ";
                    PreparedStatement ps3 = conn.prepareStatement(updateFuncionario4);
                    ps3.executeUpdate();
                    ps3.close();
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    finalizar = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Algo deu errado na conexão com o banco de dados!");
                finalizar = false;
            }
        }
        if (finalizar == true) {
            JOptionPane.showMessageDialog(null, "REGISTRO ALTERADO COM SUCESSO");
        } else if (finalizar == false) {
            JOptionPane.showMessageDialog(null, "ERRO! VEJA SE TODOS OS CAMPOS ESTÃO PREENCHIDOS CORRETAMENTE!");
        }
    }
   
    public void inserirSalarioFuncionario(Salario salario){
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String insereSalario = "INSERT INTO salario_func(cod_func_salario, cod_dept, salario) VALUES (?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(insereSalario);
                    ps.setInt   (1, salario.getCod_func());
                    ps.setInt   (2, salario.getCod_dept());
                    ps.setDouble(3, salario.getSalario());
                 
                    ps.executeUpdate();
                    
    
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
    }
    }
    
    public void updateSalarioFuncionario(Salario salario){
        Connection conn = new ConexaoBanco().conectaAgora();
        
        finalizar = false;

            if (conn != null) {
                try {
                    Statement estado1 = conn.createStatement();
                    String updateFuncionario = "UPDATE funcionario set nome ='" + salario.getNome() + "'"
                            + " WHERE  cod = " + cod + " ";
                    PreparedStatement ps = conn.prepareStatement(updateFuncionario);
                    ps.executeUpdate();
                    ps.close();

                    Statement estado2 = conn.createStatement();
                    String updateSalario = "UPDATE salario_func set salario ='" + salario.getSalario() + "'"            
                            + " WHERE cod_func_salario = " + cod + " ";
                    PreparedStatement ps1 = conn.prepareStatement(updateSalario);
                    ps1.executeUpdate();
                    ps1.close();

                    Statement estado3 = conn.createStatement();
                    String updateCargo = "UPDATE departamento "
                            + " set nome_cargo ='" + salario.getNome_cargo() + "'"
                            + " WHERE cod_func = " + cod + " ";
                    PreparedStatement ps2 = conn.prepareStatement(updateCargo);
                    ps2.executeUpdate();
                    ps2.close();
                    
                    String updateDepartamento = "UPDATE departamento "
                            + " set nome_departamento ='" + salario.getNome_departamento() + "'"
                            + " WHERE cod_func = " + cod + " ";
                    PreparedStatement ps3 = conn.prepareStatement(updateDepartamento);
                    ps3.executeUpdate();
                    ps3.close();
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    finalizar = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Algo deu errado na conexão com o banco de dados!");
                finalizar = false;
            }
        
        if (finalizar == true) {
            JOptionPane.showMessageDialog(null, "REGISTRO ALTERADO COM SUCESSO");
        } else if (finalizar == false) {
            JOptionPane.showMessageDialog(null, "ERRO! VEJA SE TODOS OS CAMPOS ESTÃO PREENCHIDOS CORRETAMENTE!");
        }     
    }
    
    public void deletarRegistro() {
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
            try {
                Statement estado1 = conn.createStatement();
                String deletaContato = "DELETE FROM contato_funcionario WHERE cod_funcionario = " + cod + " ";
                estado1.executeUpdate(deletaContato);
                String deletaEndereco = "DELETE FROM endereco_funcionario WHERE cod_funcionario_f = " + cod + " ";
                estado1.executeUpdate(deletaEndereco);
                String deletaDepartamento = "DELETE FROM departamento WHERE cod_func = " + cod + " ";
                estado1.executeUpdate(deletaDepartamento);
                String deletaFuncionario = "DELETE FROM funcionario WHERE cod = " + cod + " ";
                estado1.executeUpdate(deletaFuncionario);
                JOptionPane.showMessageDialog(null, "O REGISTRO FOI EXCLUÍDO COM SUCESSO");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O REGISTRO NÂO FOI EXCLUÍDO COM SUCESSO!");
        }

    }
    
    public void deletarSalarioFuncionario() {
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
            try {
                Statement estado1 = conn.createStatement();
                String deletaContato = "DELETE FROM contato_funcionario WHERE cod_funcionario = " + cod + " ";
                estado1.executeUpdate(deletaContato);
                String deletaSalario = "DELETE FROM salario_func WHERE cod_func_salario = " + cod + " ";
                estado1.executeUpdate(deletaSalario);
                String deletaEndereco = "DELETE FROM endereco_funcionario WHERE cod_funcionario_f = " + cod + " ";
                estado1.executeUpdate(deletaEndereco);
                String deletaDepartamento = "DELETE FROM departamento WHERE cod_func = " + cod + " ";
                estado1.executeUpdate(deletaDepartamento);
                String deletaFuncionario = "DELETE FROM funcionario WHERE cod = " + cod + " ";
                estado1.executeUpdate(deletaFuncionario);
                
                JOptionPane.showMessageDialog(null, "O REGISTRO FOI EXCLUÍDO COM SUCESSO");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O REGISTRO NÂO FOI EXCLUÍDO COM SUCESSO!");
        }
    }
    
}
