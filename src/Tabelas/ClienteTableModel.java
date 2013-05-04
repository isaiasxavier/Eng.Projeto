/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import ClassesConsulta.ClienteConsulta;
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
public class ClienteTableModel extends AbstractTableModel{
     private static List <ClienteConsulta> cliente;

    public ClienteTableModel() {
        cliente = new ArrayList <ClienteConsulta>();
    }

    public ClienteTableModel(List<ClienteConsulta> lista) {
        this();
        cliente.addAll(lista);

    }

    @Override
    public int getRowCount() {
        //quantidade de linhas
        return cliente.size(); 
    }

    @Override
    public int getColumnCount() {
        
        return 9;
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
        }  else if(column == 3) {
            return "CPF";
        } else if (column == 4) {
            return "RG";
        } else if (column == 5) {
            return "CIDADE";
        } else if (column == 6) {
            return "UF";
        } else if (column == 7) {
            return "CELULAR";
        } else if (column == 8) {
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
         } else if(columnIndex == 7) {
            return String.class;    
        } else if (columnIndex == 8) {
            return Date.class;
        }
        return String.class;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pega o motorista da linha
        ClienteConsulta m = cliente.get(rowIndex);

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
            return m.getCidade();
        } else if (columnIndex == 6) {
            return m.getUf();
        } else if (columnIndex == 7) {
            return m.getCelular();
        } else if (columnIndex == 8) {
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
        ClienteConsulta m = cliente.get(rowIndex);

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
            m.setCidade(aValue.toString());
        } else if (columnIndex == 6) {
            m.setUf(aValue.toString());
        } else if (columnIndex == 7) {
            m.setCelular(aValue.toString());
        } else if (columnIndex == 8) {
            m.setData(Date.valueOf(aValue.toString()));
        } 
        fireTableDataChanged();
    }
    
    
    public List ConsultaBancoCliente() {
        Connection conn = new ConexaoBanco().conectaAgora();

        if (conn != null) {
            try {
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod, nome, sexo, cpf, rg, cidade, uf, telefone_celular, data "
                        + "FROM cliente a, endereco_cliente b, contato_cliente "
                        + "WHERE cod = cod_cliente AND cod = cod_cliente_c");

                while (rs.next()) {
                    ClienteConsulta obj = new ClienteConsulta(Integer.parseInt(rs.getString("cod")), (rs.getString("nome")), (rs.getString("sexo")), (rs.getString("cpf")),
                            (rs.getString("rg")), (rs.getString("cidade")),
                            (rs.getString("uf")), (rs.getString("telefone_celular")), (rs.getDate("data")));


                    cliente.add(obj);
                    fireTableDataChanged();
                }
                rs.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return cliente;
    }
    
    
}
