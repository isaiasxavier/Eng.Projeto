/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controller.ControlarMotorista;
import SuperClasses.Motorista;
import SuperClasses.Salario;
import Utilitarios.DataCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PPW
 */
public class MotoristaProprioDAO {

    private boolean finalizar;
    public static Integer cod;

    public void inserirMotoristaProprio(Motorista motorista) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        finalizar = false;
        ControlarMotorista c = new ControlarMotorista();

        if (c.controlarCadastroMotorista(motorista)) {
            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String insereMotorista = "INSERT INTO motorista_proprio(nome, sexo, cpf, rg, cnh, rntcr, inss, data) VALUES (?,?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(insereMotorista);

                    ps.setString(1, motorista.getNome());
                    ps.setString(2, motorista.getSituacaoSexo());
                    ps.setString(3, motorista.getCpf());
                    ps.setString(4, motorista.getRg());
                    ps.setString(5, motorista.getCnh());
                    ps.setString(6, motorista.getRntcr());
                    ps.setString(7, motorista.getInss());
                    ps.setDate(8, data.DataAtual());
                    ps.executeUpdate();
                    String insereEndereco = "INSERT INTO endereco_motorista_proprio(endereco, numero, uf, cidade, bairro, cep) values (?,?,?,?,?,?)";
                    PreparedStatement ps1 = conn.prepareStatement(insereEndereco);
                    ps1.setString(1, motorista.getEndereco().getEndereco());
                    ps1.setString(2, motorista.getEndereco().getNumero());
                    ps1.setString(3, motorista.getEndereco().getSituacaoUF());
                    ps1.setString(4, motorista.getEndereco().getCidade());
                    ps1.setString(5, motorista.getEndereco().getBairro());
                    ps1.setString(6, motorista.getEndereco().getCep());
                    ps1.executeUpdate();
                    String insereContato = "INSERT INTO contato_motorista_proprio(telefone_residencial, telefone_celular, email) values (?,?,?)";
                    PreparedStatement ps2 = conn.prepareStatement(insereContato);
                    ps2.setString(1, motorista.getContato().getTelefone_residencial());
                    ps2.setString(2, motorista.getContato().getTelefone_celular());
                    ps2.setString(3, motorista.getContato().getEmail());
                    ps2.executeUpdate();
                    ps.close();
                    ps1.close();
                    ps2.close();

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

    public void updateMotoristaProprio(Motorista motorista) {
        Connection conn = new ConexaoBanco().conectaAgora();
        ControlarMotorista c = new ControlarMotorista();
        finalizar = false;
        if (c.controlarCadastroMotorista(motorista)) {
            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String updateMotorista = "UPDATE motorista_proprio set nome ='" + motorista.getNome() + "'"
                            + ", cpf   ='" + motorista.getCpf() + "'"
                            + ", rg    ='" + motorista.getRg() + "'"
                            + ", cnh   ='" + motorista.getCnh() + "'"
                            + ", rntcr ='" + motorista.getRntcr() + "'"
                            + ", inss  ='" + motorista.getInss() + "'"
                            + ", sexo ='" + motorista.getSituacaoSexo() + "'"
                            + " WHERE cod = " + cod + " ";
                    PreparedStatement ps = conn.prepareStatement(updateMotorista);
                    ps.executeUpdate();
                    ps.close();

                    Statement estado1 = conn.createStatement();
                    String updateMotorista1 = "UPDATE endereco_motorista_proprio set endereco ='" + motorista.getEndereco().getEndereco() + "'"
                            + ", numero = '" + motorista.getEndereco().getNumero() + "'"
                            + ", cidade = '" + motorista.getEndereco().getCidade() + "'"
                            + ", bairro = '" + motorista.getEndereco().getBairro() + "'"
                            + ", cep    = '" + motorista.getEndereco().getCep() + "'"
                            + ", uf     = '" + motorista.getEndereco().getSituacaoUF() + "'"
                            + " WHERE cod_motorista_p = " + cod + " ";
                    PreparedStatement ps1 = conn.prepareStatement(updateMotorista1);
                    ps1.executeUpdate();
                    ps1.close();

                    Statement estado2 = conn.createStatement();
                    String updateMotorista2 = "UPDATE contato_motorista_proprio "
                            + "set telefone_residencial ='" + motorista.getContato().getTelefone_residencial() + "'"
                            + ",telefone_celular ='" + motorista.getContato().getTelefone_celular() + "'"
                            + ",email = '" + motorista.getContato().getEmail() + "'"
                            + " WHERE cod_motorista_proprio = " + cod + " ";
                    PreparedStatement ps2 = conn.prepareStatement(updateMotorista2);
                    ps2.executeUpdate();
                    ps2.close();
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

    public void inserirSalarioFuncionario(Salario salario) {
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String insereSalario = "INSERT INTO salario_motorista_proprio(cod_motorista_proprio_sal, salario) VALUES (?,?)";
                    PreparedStatement ps = conn.prepareStatement(insereSalario);
                    ps.setInt   (1, salario.getCod_func());
                    ps.setDouble(2, salario.getSalario());
                 
                    ps.executeUpdate();
                    
    
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
    }
    }
}
