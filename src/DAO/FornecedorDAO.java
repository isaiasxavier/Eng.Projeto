/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controller.ControlarFornecedor;
import SuperClasses.Fornecedor;
import Utilitarios.DataCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PPW
 */
public class FornecedorDAO {
    private boolean finalizar;
    public static Integer cod;

    public void inserirFornecedor(Fornecedor fornecedor) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        finalizar = false;
        ControlarFornecedor c = new ControlarFornecedor();

       if (c.controlarCadastroFornecedor(fornecedor)) {
            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String insereMotorista = "INSERT INTO fornecedor(nome, cnpj, datacadastro) VALUES (?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(insereMotorista);
                    ps.setString(1, fornecedor.getNome());
                    ps.setString(2, fornecedor.getCnpj());
                    ps.setDate  (3, data.DataAtual());
                    ps.executeUpdate();
                    
                    String insereEndereco = "INSERT INTO endereco_fornecedor(endereco, numero, uf, cidade, bairro, cep) values (?,?,?,?,?,?)";
                    PreparedStatement ps1 = conn.prepareStatement(insereEndereco);
                    ps1.setString(1, fornecedor.getEndereco().getEndereco());
                    ps1.setString(2, fornecedor.getEndereco().getNumero());
                    ps1.setString(3, fornecedor.getEndereco().getSituacaoUF());
                    ps1.setString(4, fornecedor.getEndereco().getCidade());
                    ps1.setString(5, fornecedor.getEndereco().getBairro());
                    ps1.setString(6, fornecedor.getEndereco().getCep());
                    ps1.executeUpdate();
                    
                    String insereContato = "INSERT INTO contato_fornecedor(telefone_residencial, telefone_celular, email) values (?,?,?)";
                    PreparedStatement ps2 = conn.prepareStatement(insereContato);
                    ps2.setString(1, fornecedor.getContato().getTelefone_residencial());
                    ps2.setString(2, fornecedor.getContato().getTelefone_celular());
                    ps2.setString(3, fornecedor.getContato().getEmail());
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

    public void updateFornecedor(Fornecedor fornecedor) {
        Connection conn = new ConexaoBanco().conectaAgora();
        ControlarFornecedor c = new ControlarFornecedor();
        finalizar = false;

        if (c.controlarCadastroFornecedor(fornecedor)) {
            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado1 = conn.createStatement();
                    String updateCliente = "UPDATE fornecedor set nome ='" + fornecedor.getNome() + "'"
                            + ", cnpj      ='" + fornecedor.getCnpj() + "'"
                            + " WHERE  cod = " + cod + " ";
                    PreparedStatement ps = conn.prepareStatement(updateCliente);
                    ps.executeUpdate();
                    ps.close();

                    Statement estado2 = conn.createStatement();
                    String updateCliente1 = "UPDATE endereco_fornecedor set endereco ='" + fornecedor.getEndereco().getEndereco() + "'"
                            + ", numero = '" + fornecedor.getEndereco().getNumero() + "'"
                            + ", cidade = '" + fornecedor.getEndereco().getCidade() + "'"
                            + ", bairro = '" + fornecedor.getEndereco().getBairro() + "'"
                            + ", cep    = '" + fornecedor.getEndereco().getCep() + "'"
                            + ", uf     = '" + fornecedor.getEndereco().getSituacaoUF() + "'"
                            + " WHERE cod_fornecedor_f = " + cod + " ";
                    PreparedStatement ps1 = conn.prepareStatement(updateCliente1);
                    ps1.executeUpdate();
                    ps1.close();

                    Statement estado3 = conn.createStatement();
                    String updateCliente2 = "UPDATE contato_fornecedor "
                            + "set telefone_residencial ='" + fornecedor.getContato().getTelefone_residencial() + "'"
                            + ",telefone_celular ='"        + fornecedor.getContato().getTelefone_celular() + "'"
                            + ",email = '"                  + fornecedor.getContato().getEmail() + "'"
                            + " WHERE cod_fornecedor = " + cod + " ";
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

    public void deletarRegistro() {
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
            try {
                Statement estado1 = conn.createStatement();
                String deletaContato = "DELETE FROM contato_fornecedor WHERE cod_fornecedor = " + cod + " ";
                estado1.executeUpdate(deletaContato);
                String deletaEndereco = "DELETE FROM endereco_fornecedor WHERE cod_fornecedor_f = " + cod + " ";
                estado1.executeUpdate(deletaEndereco);
                String deletaFuncionario = "DELETE FROM fornecedor WHERE cod = " + cod + " ";
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
