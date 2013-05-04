/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import ClassesConsulta.MotoristaConsulta;
import DAO.ConexaoBanco;
import java.sql.Connection;
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
public class SalarioMotoristaProprioTableModel extends AbstractTableModel {
    private static List <MotoristaConsulta> motorista;

    public SalarioMotoristaProprioTableModel() {
        motorista = new ArrayList <MotoristaConsulta>();
    }

    public SalarioMotoristaProprioTableModel(List<MotoristaConsulta> lista) {
        this();
        motorista.addAll(lista);

    }

    @Override
    public int getRowCount() {
        //quantidade de linhas
        return motorista.size(); 
    }

    @Override
    public int getColumnCount() {
        
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        //qual o nome da coluna
        if (column == 0) {
            return "COD";
        } else if (column == 1) {
            return "NOME";
        } else if (column == 2) {
            return "SALARIO";
        
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
            return Double.class;
        }
        return String.class;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pega o motorista da linha
        MotoristaConsulta m = motorista.get(rowIndex);

        //verifica qual valor deve ser retornado
        if (columnIndex == 0) {
            return m.getCod();
        } else if (columnIndex == 1) {
            return m.getNome();
        }  else if (columnIndex == 2) {
            return m.getSalario();
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
        MotoristaConsulta m = motorista.get(rowIndex);

        //verifica qual valor vai ser alterado
        if (columnIndex == 0) {
            m.setCod(Integer.parseInt(aValue.toString()));
        } else if (columnIndex == 1) {
            m.setNome(aValue.toString());
        } else if (columnIndex == 2) {
            m.setSalario(Double.parseDouble(aValue.toString()));
        } 
        fireTableDataChanged();
    }
    
    public List ConsultaBancoSalarioMotoristaProprio() {
        Connection conn = new ConexaoBanco().conectaAgora();

        if (conn != null) {
            try {
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod, nome, salario "
                        + "FROM motorista_proprio a, salario_motorista_proprio b "
                        + "WHERE cod = cod_motorista_proprio_sal");

                while (rs.next()) {
                    MotoristaConsulta obj = new MotoristaConsulta(Integer.parseInt(rs.getString("cod")), (rs.getString("nome")), (rs.getDouble("salario")));


                    motorista.add(obj);
                    fireTableDataChanged();
                }
                rs.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return motorista;
    }
    
}
