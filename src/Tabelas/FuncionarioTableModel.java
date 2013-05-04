/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import ClassesConsulta.FuncionarioConsulta;
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
public class FuncionarioTableModel extends AbstractTableModel{
     private static List <FuncionarioConsulta> funcionario;

    public FuncionarioTableModel() {
        funcionario = new ArrayList <FuncionarioConsulta>();
    }

    public FuncionarioTableModel(List<FuncionarioConsulta> lista) {
        this();
        funcionario.addAll(lista);

    }

    @Override
    public int getRowCount() {
        //quantidade de linhas
        return funcionario.size(); 
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
            return "CPF";
        }  else if(column == 3) {
            return "RG";
        } else if (column == 4) {
            return "DEPARTAMENTO";
        } else if (column == 5) {
            return "COD/DEP";
        } else if (column == 6) {
            return "CARGO";
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
            return Integer.class;
        } else if (columnIndex == 6) {
            return String.class;
        } else if (columnIndex == 7) {
            return String.class;
        } else if (columnIndex == 8) {
            return Date.class;
        }
        return String.class;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pega o motorista da linha
        FuncionarioConsulta m = funcionario.get(rowIndex);

        //verifica qual valor deve ser retornado
        if (columnIndex == 0) {
            return m.getCod();
        } else if (columnIndex == 1) {
            return m.getNome();
        }  else if (columnIndex == 2) {
            return m.getCpf();
        } else if (columnIndex == 3) {
            return m.getRg();
        } else if (columnIndex == 4) {
            return m.getDepartamento();
        } else if (columnIndex == 5) {
            return m.getCodDepartamento();
        } else if (columnIndex == 6) {
            return m.getCargo();
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
        FuncionarioConsulta m = funcionario.get(rowIndex);

        //verifica qual valor vai ser alterado
        if (columnIndex == 0) {
            m.setCod(Integer.parseInt(aValue.toString()));
        } else if (columnIndex == 1) {
            m.setNome(aValue.toString());
        } else if (columnIndex == 2) {
            m.setCpf(aValue.toString());
        } else if (columnIndex == 3) {
            m.setRg(aValue.toString());
        } else if (columnIndex == 4) {
            m.setDepartamento(aValue.toString());
        } else if (columnIndex == 5) {
            m.setCodDepartamento(Integer.parseInt(aValue.toString()));
        } else if (columnIndex == 6) {
            m.setCargo(aValue.toString());
        } else if (columnIndex == 7) {
            m.setCelular(aValue.toString());
        } else if (columnIndex == 8) {
            m.setData(Date.valueOf(aValue.toString()));
        } 
        fireTableDataChanged();
    }
    
    public List ConsultaBancoFuncionario() {
    Connection conn = new ConexaoBanco().conectaAgora();
        
        if (conn != null) {
            try {
        
                Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod, nome, cpf, rg, nome_departamento, cod_departamento, nome_cargo, telefone_celular, datacadastro "
                        + "FROM funcionario a, contato_funcionario b, departamento  "
                        + "WHERE (cod = cod_funcionario) AND (cod = cod_func)");            

                while (rs.next()) {
                    FuncionarioConsulta obj = new FuncionarioConsulta(Integer.parseInt(rs.getString("cod")), (rs.getString("nome")),
                            (rs.getString("cpf")), (rs.getString("rg")), (rs.getString("nome_departamento")),
                            (Integer.parseInt(rs.getString("cod_departamento"))),
                            (rs.getString("nome_cargo")), (rs.getString("telefone_celular")), (rs.getDate("datacadastro")));


                    funcionario.add(obj);
                    fireTableDataChanged();
                }
                rs.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return funcionario;
    }
    
}
