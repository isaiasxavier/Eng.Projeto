/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import ClassesConsulta.FornecedorConsulta;
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
public class FornecedorTableModel extends AbstractTableModel {
    private static List <FornecedorConsulta> fornecedor;

    public FornecedorTableModel() {
        fornecedor = new ArrayList <FornecedorConsulta>();
    }

    public FornecedorTableModel(List<FornecedorConsulta> lista) {
        this();
        fornecedor.addAll(lista);

    }

    @Override
    public int getRowCount() {
        //quantidade de linhas
        return fornecedor.size(); 
    }

    @Override
    public int getColumnCount() {
        
        return 8;
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
        }  else if(column == 3) {
            return "LOGRADOURO";
        } else if (column == 4) {
            return "TELEFONE COMERCIAL";
        } else if (column == 5) {
            return "CIDADE";
        } else if (column == 6) {
            return "BAIRRO";
        } else if (column == 7) {
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
            return Date.class;
        }
        return String.class;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pega o motorista da linha
        FornecedorConsulta m = fornecedor.get(rowIndex);

        //verifica qual valor deve ser retornado
        if (columnIndex == 0) {
            return m.getCod();
        } else if (columnIndex == 1) {
            return m.getNome();
        }  else if (columnIndex== 2) {
            return m.getCnpj();
        } else if (columnIndex == 3) {
            return m.getEndereco();
        } else if (columnIndex == 4) {
            return m.getTelefoneComercial();
        } else if (columnIndex == 5) {
            return m.getCidade();
        } else if (columnIndex == 6) {
            return m.getBairro();
        } else if (columnIndex == 7) {
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
        FornecedorConsulta m = fornecedor.get(rowIndex);

        //verifica qual valor vai ser alterado
        if (columnIndex == 0) {
            m.setCod(Integer.parseInt(aValue.toString()));
        } else if (columnIndex == 1) {
            m.setNome(aValue.toString());
        } else if (columnIndex == 2) {
            m.setCnpj(aValue.toString());
        } else if (columnIndex == 3) {
            m.setEndereco(aValue.toString());
        } else if (columnIndex == 4) {
            m.setTelefoneComercial(aValue.toString());
        } else if (columnIndex == 5) {
            m.setCidade(aValue.toString());
        } else if (columnIndex == 6) {
            m.setBairro(aValue.toString());
        } else if (columnIndex == 7) {
            m.setData(Date.valueOf(aValue.toString()));
        } 
        fireTableDataChanged();
    }
    
    public List ConsultaBancoFornecedor() {
        Connection conn = new ConexaoBanco().conectaAgora();

        if (conn != null) {
            try {
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod, nome, cnpj, endereco, telefone_residencial, cidade, bairro, datacadastro "
                        + "FROM fornecedor a, endereco_fornecedor b, contato_fornecedor "
                        + "WHERE (cod = cod_fornecedor) AND (cod = cod_fornecedor_f)");

                while (rs.next()) {
                    FornecedorConsulta obj = new FornecedorConsulta(Integer.parseInt(rs.getString("cod")), 
                            (rs.getString("nome")),
                            (rs.getString("cnpj")), (rs.getString("endereco")),
                            (rs.getString("telefone_residencial")),
                            (rs.getString("cidade")), (rs.getString("bairro")),
                            (rs.getDate("datacadastro")));


                    fornecedor.add(obj);
                    fireTableDataChanged();
                }
                rs.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return fornecedor;
    }
    
}
