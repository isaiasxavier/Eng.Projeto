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
public class ClienteJuridicoTableModel extends AbstractTableModel{
    private static List <ClienteConsulta> cliente;

    public ClienteJuridicoTableModel() {
        cliente = new ArrayList <ClienteConsulta>();
    }

    public ClienteJuridicoTableModel(List<ClienteConsulta> lista) {
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
        
        return 7;
    }

    @Override
    public String getColumnName(int column) {
        //qual o nome da coluna
        if (column == 0) {
            return "COD";
        } else if (column == 1) {
            return "RAZÂO SOCIAL";
        } else if (column == 2) {
            return "CNPJ";
        } else if (column == 3) {
            return "CIDADE";
        } else if (column == 4) {
            return "UF";
        } else if (column == 5) {
            return "CELULAR";
        } else if (column == 6) {
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
            return m.getCnpj();
        } else if (columnIndex == 3) {
            return m.getCidade();
        } else if (columnIndex == 4) {
            return m.getUf();
        } else if (columnIndex == 5) {
            return m.getTelefone_comercial();
        } else if (columnIndex == 6) {
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
            m.setCnpj(aValue.toString());
        } else if (columnIndex == 3) {
            m.setCidade(aValue.toString());
        } else if (columnIndex == 4) {
            m.setUf(aValue.toString());
        } else if (columnIndex == 5) {
            m.setTelefone_comercial(aValue.toString());
        } else if (columnIndex == 6) {
            m.setData(Date.valueOf(aValue.toString()));
        } 
        fireTableDataChanged();
    }
    
    
    public List ConsultaBancoClienteJuridico() {
        Connection conn = new ConexaoBanco().conectaAgora();

        if (conn != null) {
            try {
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod, razaosocial, cnpj, cidade, uf, telefone_comercial, data "
                        + "FROM cliente_juridico a, endereco_cliente_juridico b, contato_cliente_juridico "
                        + "WHERE cod = cod_cliente_juridico AND cod = cod_cliente_j");

                while (rs.next()) {
                    ClienteConsulta obj = new ClienteConsulta(Integer.parseInt(rs.getString("cod")), (rs.getString("razaosocial")),
                            (rs.getString("cnpj")), (rs.getString("cidade")),(rs.getString("uf")), 
                            (rs.getString("telefone_comercial")), (rs.getDate("data")));


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
