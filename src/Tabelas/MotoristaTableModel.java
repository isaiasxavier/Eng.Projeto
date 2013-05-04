/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import ClassesConsulta.MotoristaConsulta;
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
public class MotoristaTableModel extends AbstractTableModel {
    private static List <MotoristaConsulta> motorista;

    public MotoristaTableModel() {
        motorista = new ArrayList <MotoristaConsulta>();
    }

    public MotoristaTableModel(List<MotoristaConsulta> lista) {
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
        
        return 11;
    }

    @Override
    public String getColumnName(int column) {
        //qual o nome da coluna
        if (column == 0) {
            return "COD";
        } else if (column == 1) {
            return "NOME";
        } else if (column == 2) {
            return "SEXO";
        }  else if (column == 3) {
            return "CPF";
        } else if (column == 4) {
            return "RG";
        } else if (column == 5) {
            return "CNH";
        } else if (column == 6) {
            return "RNTCR";
        } else if (column == 7) {
            return "CIDADE";
        } else if (column == 8) {
            return "UF";
        } else if (column == 9) {
            return "CELULAR";
        } else if (column == 10) {
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
            return String.class;
        } else if (columnIndex == 10) {
            return Date.class;
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
            return m.getSexo();
        } else if (columnIndex == 3) {
            return m.getCpf();
        } else if (columnIndex == 4) {
            return m.getRg();
        } else if (columnIndex == 5) {
            return m.getCnh();
        } else if (columnIndex == 6) {
            return m.getRntcr();
        } else if (columnIndex == 7) {
            return m.getCidade();
        } else if (columnIndex == 8) {
            return m.getUf();
        } else if (columnIndex == 9) {
            return m.getCelular();
        } else if (columnIndex == 10) {
            return m.getData();
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
            m.setSexo(aValue.toString());
        } else if (columnIndex == 3) {
            m.setCpf(aValue.toString());
        } else if (columnIndex == 4) {
            m.setRg(aValue.toString());
        } else if (columnIndex == 5) {
            m.setCnh(aValue.toString());
        } else if (columnIndex == 6) {
            m.setRntcr(aValue.toString());
        } else if (columnIndex == 7) {
            m.setCidade(aValue.toString());
        } else if (columnIndex == 8) {
            m.setUf(aValue.toString());
        } else if (columnIndex == 9) {
            m.setCelular(aValue.toString());
        } else if (columnIndex == 10) {
            m.setData(Date.valueOf(aValue.toString()));
        } 
        fireTableDataChanged();
    }
    
    public List ConsultaBancoTerceirizado() {
        Connection conn = new ConexaoBanco().conectaAgora();

        if (conn != null) {
            try {
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod, nome, sexo, cpf, rg, cnh, rntcr, cidade, uf, telefone_celular, data "
                        + "FROM motorista_terceirizado a, endereco_motorista_terceirizado b, contato_motorista_terceirizado "
                        + "WHERE cod = cod_motorista_terceirizado AND cod = cod_motorista_t");

                while (rs.next()) {
                    MotoristaConsulta obj = new MotoristaConsulta(Integer.parseInt(rs.getString("cod")), (rs.getString("nome")), (rs.getString("sexo")), (rs.getString("cpf")),
                            (rs.getString("rg")), (rs.getString("cnh")), (rs.getString("rntcr")),
                            (rs.getString("cidade")), (rs.getString("uf")), (rs.getString("telefone_celular")), (rs.getDate("data")));


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
    
    public List ConsultaBancoProprio() {
        Connection conn = new ConexaoBanco().conectaAgora();

        if (conn != null) {
            try {
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod, nome, sexo, cpf, rg, cnh, rntcr, cidade, uf, telefone_celular, data "
                        + "FROM motorista_proprio a, endereco_motorista_proprio b, contato_motorista_proprio "
                        + "WHERE cod = cod_motorista_proprio AND cod = cod_motorista_p");

                while (rs.next()) {
                    MotoristaConsulta obj = new MotoristaConsulta(Integer.parseInt(rs.getString("cod")), (rs.getString("nome")), (rs.getString("sexo")), (rs.getString("cpf")),
                            (rs.getString("rg")), (rs.getString("cnh")), (rs.getString("rntcr")),
                            (rs.getString("cidade")), (rs.getString("uf")), (rs.getString("telefone_celular")), (rs.getDate("data")));


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
