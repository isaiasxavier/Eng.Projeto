/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import ClassesConsulta.Veiculo;
import DAO.ConexaoBanco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PPW
 */
public class VeiculoTableModel extends AbstractTableModel{
    private static List <Veiculo> veiculo;

    public VeiculoTableModel() {
        veiculo = new ArrayList <Veiculo>();
    }

    public VeiculoTableModel(List<Veiculo> lista) {
        this();
        veiculo.addAll(lista);

    }

    @Override
    public int getRowCount() {
        //quantidade de linhas
        return veiculo.size(); 
    }

    @Override
    public int getColumnCount() {
        
        return 10;
    }

    @Override
    public String getColumnName(int column) {
        //qual o nome da coluna
        if (column == 0) {
            return "COD/MOTORISTA";
        } else if (column == 1) {
            return "PROPRIETÁRIO";
        } else if (column == 2) {
            return "VEÍCULO";
        }  else if (column == 3) {
            return "CARRETA";
        } else if (column == 4) {
            return "MARCA";
        } else if (column == 5) {
            return "MODELO";
        } else if (column == 6) {
            return "PLACA CAVALO";
        } else if (column == 7) {
            return "PLACA CARRETA";
        } else if (column == 8) {
            return "ANO";
        } else if (column == 9) {
            return "CADASTRO";
        } 
        return "";
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        //retorna a classe que representa a coluna
        if (columnIndex == 0) {
            return Integer.class;
        } else if (columnIndex == 1) {
            return String.class;    
        } else if (columnIndex == 2) {
            return String.class;
        } else if (columnIndex == 3) {
            return String.class;
        } else if (columnIndex == 4) {
            return String.class;
        } else if (columnIndex == 5) {
            return String.class;
        } else if (columnIndex == 6) {
            return String.class;
        } else if (columnIndex == 7) {
            return String.class;
        } else if (columnIndex == 8) {
            return String.class;
        } else if (columnIndex == 9) {
            return Date.class;
        }
        return String.class;
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pega o motorista da linha
        Veiculo v = veiculo.get(rowIndex);

        //verifica qual valor deve ser retornado
        if (columnIndex == 0) {
            return v.getCod_motorista();
        } else if (columnIndex == 1) {
            return v.getNomeMotorista();    
        } else if (columnIndex == 2) {
            return v.getVeiculo();
        } else if (columnIndex == 3) {
            return v.getCarreta();
        } else if (columnIndex == 4) {
            return v.getMarca();
        } else if (columnIndex == 5) {
            return v.getModelo();
        } else if (columnIndex == 6) {
            return v.getPlacaCavalo();
        } else if (columnIndex == 7) {
            return v.getPlacaCarreta();
        } else if (columnIndex == 8) {
            return v.getAno();
        } else if (columnIndex == 9) {
            return v.getDataCadastro();
        }
        return "";
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //a célula vai ser editável?
        //no nosso caso todas vão ser editáveis, entao retorna true pra td
        return false;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //pega o produto da linha
        Veiculo v = veiculo.get(rowIndex);

        //verifica qual valor vai ser alterado
        if (columnIndex == 0) {
            v.setCod_motorista(Integer.parseInt(aValue.toString()));
        } else if (columnIndex == 1) {
            v.setNomeMotorista(aValue.toString());
        } else if (columnIndex == 2) {
            v.setVeiculo(aValue.toString());
        } else if (columnIndex == 3) {
            v.setCarreta(aValue.toString());
        } else if (columnIndex == 4) {
            v.setMarca(aValue.toString());
        } else if (columnIndex == 5) {
            v.setModelo(aValue.toString());
        } else if (columnIndex == 6) {
            v.setPlacaCavalo(aValue.toString());
        } else if (columnIndex == 7) {
            v.setPlacaCarreta(aValue.toString());
        } else if (columnIndex == 8) {
            v.setAno(aValue.toString());
        } else if (columnIndex == 9) {
            v.setDataCadastro(Date.valueOf(aValue.toString()));
        } 
        fireTableDataChanged();
    
    }  
    public List ConsultaVeiculoTerceirizado() {
        Connection conn = new ConexaoBanco().conectaAgora();
        
        if (conn != null) {
            try {
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod_motorista, nome, veiculo, carreta, marca, modelo, placacavalo, placacarreta, ano, datacadastro "
                        + "FROM veiculo_motorista_terceirizado a, motorista_terceirizado b  "
                        + "WHERE cod_motorista = cod");

                while (rs.next()) {
                    Veiculo obj = new Veiculo(Integer.parseInt(rs.getString("cod_motorista")), (rs.getString("nome")), (rs.getString("veiculo")),
                            (rs.getString("carreta")), (rs.getString("marca")), (rs.getString("modelo")),
                            (rs.getString("placacavalo")), (rs.getString("placacarreta")), (rs.getString("ano")), (rs.getDate("datacadastro")));


                    veiculo.add(obj);
                    fireTableDataChanged();
                }
                rs.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return veiculo;
    }
    
    public List ConsultaVeiculoProprio() {
        Connection conn = new ConexaoBanco().conectaAgora();
        
        if (conn != null) {
            try {
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod_motorista_p, nome, veiculo, carreta, marca, modelo, placacavalo, placacarreta, ano, datacadastro "
                        + "FROM veiculo_proprio a, motorista_proprio b  "
                        + "WHERE cod_motorista_p = cod");

                while (rs.next()) {
                     Veiculo obj = new Veiculo(Integer.parseInt(rs.getString("cod_motorista_p")), (rs.getString("nome")), (rs.getString("veiculo")),
                            (rs.getString("carreta")), (rs.getString("marca")), (rs.getString("modelo")),
                            (rs.getString("placacavalo")), (rs.getString("placacarreta")), (rs.getString("ano")), (rs.getDate("datacadastro")));


                    veiculo.add(obj);
                    fireTableDataChanged();
                }
                rs.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return veiculo;
    }
    
}
