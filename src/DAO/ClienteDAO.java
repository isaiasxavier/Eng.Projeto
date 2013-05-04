package DAO;

import Controller.ControlarCliente;
import SuperClasses.ClienteJuridico;
import SuperClasses.Cliente;
import Utilitarios.DataCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ClienteDAO {
    private boolean finalizar;
    public static Integer cod;

    public void inserirCliente(Cliente cliente) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        finalizar = false;
        ControlarCliente c = new ControlarCliente();

        if (c.controlarCadastroCliente(cliente)) {
            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String insereMotorista = "INSERT INTO cliente(nome, sexo, cpf, rg, data) VALUES (?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(insereMotorista);
                    ps.setString(1, cliente.getNome());
                    ps.setString(2, cliente.getSituacaoSexo());
                    ps.setString(3, cliente.getCpf());
                    ps.setString(4, cliente.getRg());
                    ps.setDate  (5, data.DataAtual());
                    ps.executeUpdate();
                    
                    String insereEndereco = "INSERT INTO endereco_cliente(endereco, numero, uf, cidade, bairro, cep) values (?,?,?,?,?,?)";
                    PreparedStatement ps1 = conn.prepareStatement(insereEndereco);
                    ps1.setString(1, cliente.getEndereco().getEndereco());
                    ps1.setString(2, cliente.getEndereco().getNumero());
                    ps1.setString(3, cliente.getEndereco().getSituacaoUF());
                    ps1.setString(4, cliente.getEndereco().getCidade());
                    ps1.setString(5, cliente.getEndereco().getBairro());
                    ps1.setString(6, cliente.getEndereco().getCep());
                    ps1.executeUpdate();
                    
                    String insereContato = "INSERT INTO contato_cliente(telefone_residencial, telefone_celular, email) values (?,?,?)";
                    PreparedStatement ps2 = conn.prepareStatement(insereContato);
                    ps2.setString(1, cliente.getContato().getTelefone_residencial());
                    ps2.setString(2, cliente.getContato().getTelefone_celular());
                    ps2.setString(3, cliente.getContato().getEmail());
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
    
    public void inserirClienteJuridico(ClienteJuridico cliente) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        finalizar = false;
        ControlarCliente c = new ControlarCliente();

            
            if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String insereMotorista = "INSERT INTO cliente_juridico(razaosocial, cnpj, data) VALUES (?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(insereMotorista);
                    ps.setString(1, cliente.getNome());
                    ps.setString(2, cliente.getCnpj());
                    ps.setDate  (3, data.DataAtual());
                    ps.executeUpdate();
                    
                    String insereEndereco = "INSERT INTO endereco_cliente_juridico(endereco, numero, uf, cidade, bairro, cep) values (?,?,?,?,?,?)";
                    PreparedStatement ps1 = conn.prepareStatement(insereEndereco);
                    ps1.setString(1, cliente.getEndereco().getEndereco());
                    ps1.setString(2, cliente.getEndereco().getNumero());
                    ps1.setString(3, cliente.getEndereco().getSituacaoUF());
                    ps1.setString(4, cliente.getEndereco().getCidade());
                    ps1.setString(5, cliente.getEndereco().getBairro());
                    ps1.setString(6, cliente.getEndereco().getCep());
                    ps1.executeUpdate();
                    
                    String insereContato = "INSERT INTO contato_cliente_juridico(telefone_comercial, telefone_celular, email) values (?,?,?)";
                    PreparedStatement ps2 = conn.prepareStatement(insereContato);
                    ps2.setString(1, cliente.getContato().getTelefone_residencial());
                    ps2.setString(2, cliente.getContato().getTelefone_celular());
                    ps2.setString(3, cliente.getContato().getEmail());
                    ps2.executeUpdate();
                    ps.close();
                    ps1.close();
                    ps2.close();
                    
                    finalizar = true;

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + " ERRO NO BANCO DE DADOS! ");
                    finalizar = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, " Algo deu errado com a conexão com o banco de dados (ERROR TABELA: motorista_terceirzado)! ");
                finalizar = false;
            }

        
        if (finalizar == true) {
            JOptionPane.showMessageDialog(null, " CADASTRO SALVO COM SUCESSO! ");

        } else if (finalizar == false) {
            JOptionPane.showMessageDialog(null, " ERRO AO CADASTRAR! VEJA SE TODOS OS CAMPOS ESTÂO PREENCHIDOS CORRETAMENTE ");
        }
    }

    public void updateCliente(Cliente cliente) {
        Connection conn = new ConexaoBanco().conectaAgora();
        ControlarCliente c = new ControlarCliente();
        finalizar = false;

        if (c.controlarCadastroCliente(cliente)) {
            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado1 = conn.createStatement();
                    String updateCliente = "UPDATE cliente set nome ='" + cliente.getNome() + "'"
                            + ", cpf   ='" + cliente.getCpf() + "'"
                            + ", rg    ='" + cliente.getRg() + "'"
                            + ", sexo  ='" + cliente.getSituacaoSexo() + "'"
                            + " WHERE  cod = " + cod + " ";
                    PreparedStatement ps = conn.prepareStatement(updateCliente);
                    ps.executeUpdate();
                    ps.close();

                    Statement estado2 = conn.createStatement();
                    String updateCliente1 = "UPDATE endereco_cliente set endereco ='" + cliente.getEndereco().getEndereco() + "'"
                            + ", numero = '" + cliente.getEndereco().getNumero() + "'"
                            + ", cidade = '" + cliente.getEndereco().getCidade() + "'"
                            + ", bairro = '" + cliente.getEndereco().getBairro() + "'"
                            + ", cep    = '" + cliente.getEndereco().getCep() + "'"
                            + ", uf     = '" + cliente.getEndereco().getSituacaoUF() + "'"
                            + " WHERE cod_cliente_c = " + cod + " ";
                    PreparedStatement ps1 = conn.prepareStatement(updateCliente1);
                    ps1.executeUpdate();
                    ps1.close();

                    Statement estado3 = conn.createStatement();
                    String updateCliente2 = "UPDATE contato_cliente "
                            + "set telefone_residencial ='" + cliente.getContato().getTelefone_residencial() + "'"
                            + ",telefone_celular ='"        + cliente.getContato().getTelefone_celular() + "'"
                            + ",email = '"                  + cliente.getContato().getEmail() + "'"
                            + " WHERE cod_cliente = " + cod + " ";
                    PreparedStatement ps2 = conn.prepareStatement(updateCliente2);
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
    
    public void updateClienteJuridico(ClienteJuridico cliente){
        Connection conn = new ConexaoBanco().conectaAgora();
        ControlarCliente c = new ControlarCliente();
        finalizar = false;

            if (conn != null) {
                try {
                    Statement estado1 = conn.createStatement();
                    String updateCliente = "UPDATE cliente_juridico set razaosocial ='" + cliente.getNome() + "'"
                            + ", cnpj   ='" + cliente.getCnpj() + "'"
                            + " WHERE  cod = " + cod + " ";
                    PreparedStatement ps = conn.prepareStatement(updateCliente);
                    ps.executeUpdate();
                    ps.close();

                    Statement estado2 = conn.createStatement();
                    String updateCliente1 = "UPDATE endereco_cliente_juridico set endereco ='" + cliente.getEndereco().getEndereco() + "'"
                            + ", numero = '" + cliente.getEndereco().getNumero() + "'"
                            + ", cidade = '" + cliente.getEndereco().getCidade() + "'"
                            + ", bairro = '" + cliente.getEndereco().getBairro() + "'"
                            + ", cep    = '" + cliente.getEndereco().getCep() + "'"
                            + ", uf     = '" + cliente.getEndereco().getSituacaoUF() + "'"
                            + " WHERE cod_cliente_j = " + cod + " ";
                    PreparedStatement ps1 = conn.prepareStatement(updateCliente1);
                    ps1.executeUpdate();
                    ps1.close();

                    Statement estado3 = conn.createStatement();
                    String updateCliente2 = "UPDATE contato_cliente_juridico "
                            + "set telefone_residencial ='" + cliente.getContato().getTelefone_residencial() + "'"
                            + ",telefone_celular ='"        + cliente.getContato().getTelefone_celular() + "'"
                            + ",email = '"                  + cliente.getContato().getEmail() + "'"
                            + " WHERE cod_cliente_juridico = " + cod + " ";
                    PreparedStatement ps2 = conn.prepareStatement(updateCliente2);
                    ps2.executeUpdate();
                    ps2.close();
                    finalizar = true;
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
                String deletaContato = "DELETE FROM contato_cliente WHERE cod_cliente = " + cod + " ";
                estado1.executeUpdate(deletaContato);
                String deletaEndereco = "DELETE FROM endereco_cliente WHERE cod_cliente_c = " + cod + " ";
                estado1.executeUpdate(deletaEndereco);
                String deletaMotorista = "DELETE FROM cliente WHERE cod = " + cod + " ";
                estado1.executeUpdate(deletaMotorista);
                JOptionPane.showMessageDialog(null, "O REGISTRO FOI EXCLUÍDO COM SUCESSO");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O REGISTRO NÂO FOI EXCLUÍDO COM SUCESSO!");
        }

    }
    
    public void deletarRegistroJuridico() {
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
            try {
                Statement estado1 = conn.createStatement();
                String deletaContato = "DELETE FROM contato_cliente_juridico WHERE cod_cliente_juridico = " + cod + " ";
                estado1.executeUpdate(deletaContato);
                String deletaEndereco = "DELETE FROM endereco_cliente_juridico WHERE cod_cliente_j = " + cod + " ";
                estado1.executeUpdate(deletaEndereco);
                String deletaMotorista = "DELETE FROM cliente_juridico WHERE cod = " + cod + " ";
                estado1.executeUpdate(deletaMotorista);
                JOptionPane.showMessageDialog(null, "O REGISTRO FOI EXCLUÍDO COM SUCESSO");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O REGISTRO NÂO FOI EXCLUÍDO COM SUCESSO!");
        }

    }
    
}
