/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import ClassesConsulta.FuncionarioConsulta;
import DAO.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PPW
 */
public class SalarioFuncionarioTableModel extends AbstractTableModel{
    private static List <FuncionarioConsulta> funcionario;

    public SalarioFuncionarioTableModel() {
        funcionario = new ArrayList <FuncionarioConsulta>();
    }

    public SalarioFuncionarioTableModel(List<FuncionarioConsulta> lista) {
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
        
        return 6;
    }

    @Override
    public String getColumnName(int column) {
        //qual o nome da coluna
        if (column == 0) {
            return "COD";
        } else if (column == 1) {
            return "NOME";
        } else if (column == 2) {
            return "SALÁRIO";        
        } else if (column == 3) {
            return "DEPARTAMENTO";
        } else if (column == 4) {
            return "COD/DEPT";    
        } else if (column == 5) {
            return "CARGO";
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
        } else if (columnIndex == 3) {
            return String.class;
        } else if (columnIndex == 4) {
            return Integer.class;
        } else if (columnIndex == 5) {
            return String.class;
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
            return m.getSalario();
        } else if (columnIndex == 3) {
            return m.getDepartamento();
        } else if (columnIndex == 4) {
            return m.getCodDepartamento();
        } else if (columnIndex == 5) {
            return m.getCargo();
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
            m.setSalario(Double.parseDouble(aValue.toString()));
        } else if (columnIndex == 3) {
            m.setDepartamento(aValue.toString());
        } else if (columnIndex == 4) {
            m.setCodDepartamento(Integer.parseInt(aValue.toString())); 
        } else if (columnIndex == 5) {
            m.setCargo(aValue.toString());
        } 
        fireTableDataChanged();
    }
    
    public List ConsultaBancoSalarioFuncionario() {
        Connection conn = new ConexaoBanco().conectaAgora();

        if (conn != null) {
            try {
                java.sql.Statement estado = conn.createStatement(); 
                ResultSet rs = estado.executeQuery("SELECT cod_func_salario, nome, salario, nome_departamento, cod_departamento, nome_cargo from salario_func, funcionario, departamento Where cod_func_salario = cod AND cod_func = cod");            

                while (rs.next()) {
                    FuncionarioConsulta obj = new FuncionarioConsulta(Integer.parseInt(rs.getString("cod_func_salario")), (rs.getString("nome")), (rs.getDouble("salario")), (rs.getString("nome_departamento")), (Integer.parseInt(rs.getString("cod_departamento"))), (rs.getString("nome_cargo")));


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
    

