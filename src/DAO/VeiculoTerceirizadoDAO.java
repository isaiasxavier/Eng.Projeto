/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ClassesConsulta.Veiculo;
import Controller.ControlarVeiculo;
import Utilitarios.DataCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PPW
 */
public class VeiculoTerceirizadoDAO {

    private boolean finalizar;
    public static Integer cod;

    public void inserirVeiculoTerceirizado(Veiculo veiculo) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        finalizar = false;
        ControlarVeiculo c = new ControlarVeiculo();

        if (c.ControlarVeiculo(veiculo)) {

            finalizar = true;
            if (conn != null) {
                try {
                    Statement estado = conn.createStatement();
                    String insereVeiculoTerceirizado = "INSERT INTO veiculo_motorista_terceirizado (cod_motorista, veiculo, carreta, marca, modelo, cor, placacavalo, placacarreta, ano, datacadastro) VALUES (?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(insereVeiculoTerceirizado);
                    ps.setInt(1, veiculo.getCod_motorista());
                    ps.setString(2, veiculo.getVeiculo());
                    ps.setString(3, veiculo.getCarreta());
                    ps.setString(4, veiculo.getMarca());
                    ps.setString(5, veiculo.getModelo());
                    ps.setString(6, veiculo.getCor());
                    ps.setString(7, veiculo.getPlacaCavalo());
                    ps.setString(8, veiculo.getPlacaCarreta());
                    ps.setString(9, veiculo.getAno());
                    ps.setDate(10, data.DataAtual());
                    ps.executeUpdate();
                    ps.close();

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
            JOptionPane.showMessageDialog(null, "REGISTRO SALVO COM SUCESSO!");
        } else if (finalizar == false) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR REGISTRO! VERIFIQUE SE TODOS OS CAMPOS ESTÂO CORRETAMENTE PREENCHIDOS!");
        }
    }

    public void updateVeiculoTerceirizado(Veiculo veiculo) {
        Connection conn = new ConexaoBanco().conectaAgora();
        finalizar = false;
        ControlarVeiculo c = new ControlarVeiculo();


        if (c.ControlarVeiculo(veiculo)) {
            finalizar = true;
            try {
                Statement estado = conn.createStatement();
                String updateMotorista = "UPDATE veiculo_motorista_terceirizado set veiculo ='" + veiculo.getVeiculo() + "'"
                        + ", carreta            ='" + veiculo.getCarreta() + "'"
                        + ", marca              ='" + veiculo.getMarca() + "'"
                        + ", modelo             ='" + veiculo.getModelo() + "'"
                        + ", cor                ='" + veiculo.getCor() + "'"
                        + ", placacavalo        ='" + veiculo.getPlacaCavalo() + "'"
                        + ", placacarreta       ='" + veiculo.getPlacaCarreta() + "'"
                        + ", ano                ='" + veiculo.getAno() + "'"
                        + " WHERE cod_motorista = " + cod + " ";
                PreparedStatement ps = conn.prepareStatement(updateMotorista);
                ps.executeUpdate();
                ps.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
                finalizar = false;
            }
            try {
                Statement estado = conn.createStatement();
                String updateMotoristaTerceirizado = "UPDATE motorista_terceirizado set nome  ='" + veiculo.getNomeMotorista() + "' WHERE cod = " + cod + " ";
                PreparedStatement ps = conn.prepareStatement(updateMotoristaTerceirizado);
                ps.executeUpdate();
                ps.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
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
                String deletaVeiculo = "DELETE FROM veiculo_motorista_terceirizado WHERE cod_motorista =" + cod + " ";
                estado1.executeUpdate(deletaVeiculo);
                JOptionPane.showMessageDialog(null, "O REGISTRO FOI EXCLUÍDO COM SUCESSO");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O REGISTRO NÂO FOI EXCLUÍDO COM SUCESSO!");
        }
    }
}
