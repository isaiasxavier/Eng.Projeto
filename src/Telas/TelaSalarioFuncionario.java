/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.ClienteDAO;
import DAO.ConexaoBanco;
import DAO.FornecedorDAO;
import DAO.FuncionarioDAO;
import SuperClasses.Salario;
import Tabelas.SalarioFuncionarioTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PPW
 */
public class TelaSalarioFuncionario extends javax.swing.JFrame {
    private String departamento;
    private Object dept;
    private TelaPrincipal telaAnterior;
    private SalarioFuncionarioTableModel model;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Object getDept() {
        return dept;
    }

    public void setDept(Object dept) {
        this.dept = dept;
    }
    
    
    /**
     * Creates new form TelaSalarioFuncionario
     */
    public TelaSalarioFuncionario() {
        initComponents();
    }

    public TelaSalarioFuncionario(TelaPrincipal telaAnterior) {
        this();
        this.telaAnterior = telaAnterior;

        SalarioFuncionarioTableModel obj = new SalarioFuncionarioTableModel();
        model = new SalarioFuncionarioTableModel(obj.ConsultaBancoSalarioFuncionario());
        jt_salario.setModel(model);
        
        jt_salario.setAutoResizeMode(jt_salario.AUTO_RESIZE_OFF);  
        jt_salario.getColumnModel().getColumn(0).setPreferredWidth(35);  
        jt_salario.getColumnModel().getColumn(1).setPreferredWidth(250);  
        jt_salario.getColumnModel().getColumn(2).setPreferredWidth(80);  
        jt_salario.getColumnModel().getColumn(3).setPreferredWidth(115);  
        jt_salario.getColumnModel().getColumn(4).setPreferredWidth(80);  
        jt_salario.getColumnModel().getColumn(5).setPreferredWidth(160);  
         


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_cod = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_salario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_cargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_departamento = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btn_consultar_salario_funcionario = new javax.swing.JButton();
        btn_salvar_salario_funcionario = new javax.swing.JButton();
        btn_excluir_salario_funcionario = new javax.swing.JButton();
        btn_limpar_salario_funcionario = new javax.swing.JButton();
        btn_alterar_salario_funcionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_salario = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cb_cod_dept = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO SALÁRIO FUNCIONÁRIO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("PESQUISAR POR CÓDIGO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("SALÁRIO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CARGO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DEPARTAMENTO:");

        cb_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_departamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_departamento, 0, 186, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(tf_salario)
                            .addComponent(tf_cargo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_consultar_salario_funcionario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_consultar_salario_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Spotlight Blue Button.png"))); // NOI18N
        btn_consultar_salario_funcionario.setText("CONSULTAR");
        btn_consultar_salario_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_salario_funcionarioActionPerformed(evt);
            }
        });

        btn_salvar_salario_funcionario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_salvar_salario_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/download.png"))); // NOI18N
        btn_salvar_salario_funcionario.setText("SALVAR");
        btn_salvar_salario_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_salario_funcionarioActionPerformed(evt);
            }
        });

        btn_excluir_salario_funcionario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_excluir_salario_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mr. Bomb.png"))); // NOI18N
        btn_excluir_salario_funcionario.setText("EXCLUIR");
        btn_excluir_salario_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_salario_funcionarioActionPerformed(evt);
            }
        });

        btn_limpar_salario_funcionario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_limpar_salario_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Write Document.png"))); // NOI18N
        btn_limpar_salario_funcionario.setText("LIMPAR");
        btn_limpar_salario_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar_salario_funcionarioActionPerformed(evt);
            }
        });

        btn_alterar_salario_funcionario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_alterar_salario_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/under-construction.png"))); // NOI18N
        btn_alterar_salario_funcionario.setText("ALTERAR");
        btn_alterar_salario_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterar_salario_funcionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_consultar_salario_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_salvar_salario_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluir_salario_funcionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_limpar_salario_funcionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_alterar_salario_funcionario, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_consultar_salario_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_salvar_salario_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(btn_alterar_salario_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_excluir_salario_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(btn_limpar_salario_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jt_salario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jt_salario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_salarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_salario);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CÓDIGO DO DEPARTAMENTO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(cb_cod_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(cb_cod_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-755)/2, (screenSize.height-544)/2, 755, 544);
    }// </editor-fold>//GEN-END:initComponents
        
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void btn_consultar_salario_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_salario_funcionarioActionPerformed
        FuncionarioDAO.cod = Integer.parseInt(tf_cod.getText());
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
            try {
                Statement estado1 = conn.createStatement();
                ResultSet rs = estado1.executeQuery("SELECT nome FROM funcionario "
                        + " WHERE cod = " + FuncionarioDAO.cod + " ");
                Statement estado2 = conn.createStatement();
                ResultSet rs2 = estado2.executeQuery("SELECT nome_cargo FROM departamento "
                        + " WHERE cod_func = " + FuncionarioDAO.cod + " ");
                Statement estado3 = conn.createStatement();
                ResultSet rs3 = estado3.executeQuery("SELECT salario FROM salario_func "
                        + " WHERE cod_func_salario = "+ FuncionarioDAO.cod + " ");
                while (rs.next()) {
                    tf_nome.setText(rs.getString("nome"));
                    
                }
                rs.close();
                
                while (rs2.next()) {        
                    tf_cargo.setText(rs2.getString("nome_cargo"));
                }
                rs2.close();
                
                while (rs3.next()) {        
                    Double salario1 = rs3.getDouble("salario");
                    String salario = String.valueOf(salario1);
                    tf_salario.setText(salario);
                
                }
                rs3.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT nome_departamento FROM departamento WHERE"
                        + " cod_func =" + FuncionarioDAO.cod +" ");
                Statement stmt1 = conn.createStatement();
                ResultSet rs1 = stmt1.executeQuery("SELECT cod_departamento FROM departamento WHERE"
                        + " cod_func =" + FuncionarioDAO.cod +" ");
                
                while (rs.next() && rs1.next()) {
                    cb_departamento.addItem(rs.getString("nome_departamento"));
                    cb_cod_dept.addItem(rs1.getInt("cod_departamento"));
                }
                stmt.close();
                stmt1.close();
            } catch (Exception ex) {
                System.err.println("Erro I/O.\n " + ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btn_consultar_salario_funcionarioActionPerformed

    private void btn_salvar_salario_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_salario_funcionarioActionPerformed
        Integer cod_func = Integer.parseInt(tf_cod.getText());
        Double salarioFunc = Double.parseDouble(tf_salario.getText());
        Integer cod_departamento = Integer.parseInt(cb_cod_dept.getSelectedItem().toString());
        
        Salario salario = new Salario(cod_func, cod_departamento, salarioFunc);
        
        FuncionarioDAO inserir = new FuncionarioDAO();
        inserir.inserirSalarioFuncionario(salario);
        
        SalarioFuncionarioTableModel obj = new SalarioFuncionarioTableModel();
        model = new SalarioFuncionarioTableModel(obj.ConsultaBancoSalarioFuncionario());
        jt_salario.setModel(model);
        
        jt_salario.setAutoResizeMode(jt_salario.AUTO_RESIZE_OFF);  
        jt_salario.getColumnModel().getColumn(0).setPreferredWidth(35);  
        jt_salario.getColumnModel().getColumn(1).setPreferredWidth(250);  
        jt_salario.getColumnModel().getColumn(2).setPreferredWidth(80);  
        jt_salario.getColumnModel().getColumn(3).setPreferredWidth(115);  
        jt_salario.getColumnModel().getColumn(4).setPreferredWidth(80);  
        jt_salario.getColumnModel().getColumn(5).setPreferredWidth(160); 
            
    }//GEN-LAST:event_btn_salvar_salario_funcionarioActionPerformed

    private void cb_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_departamentoActionPerformed
        setDept(cb_departamento.getSelectedItem());
        setDepartamento(getDept().toString());
                
    }//GEN-LAST:event_cb_departamentoActionPerformed

    private void jt_salarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_salarioMouseClicked
        FuncionarioDAO.cod = (Integer) jt_salario.getValueAt(jt_salario.getSelectedRow(), 0);
        
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
            try {
                Statement estado1 = conn.createStatement();
                ResultSet rs = estado1.executeQuery("SELECT cod, nome FROM funcionario "
                        + " WHERE cod = " + FuncionarioDAO.cod + " ");
                Statement estado2 = conn.createStatement();
                ResultSet rs2 = estado2.executeQuery("SELECT nome_cargo FROM departamento "
                        + " WHERE cod_func = " + FuncionarioDAO.cod + " ");
                Statement estado3 = conn.createStatement();
                ResultSet rs3 = estado3.executeQuery("SELECT salario FROM salario_func "
                        + " WHERE cod_func_salario = "+ FuncionarioDAO.cod + " ");
                while (rs.next() && rs2.next() && rs3.next()) {
                    tf_nome.setText(rs.getString("nome"));
                    
                    Integer codigo1 = rs.getInt("cod");
                    String codigo = String.valueOf(codigo1);
                    tf_cod.setText(codigo);
                    
                    tf_cargo.setText(rs2.getString("nome_cargo"));
                    
                    Double salario1 = rs3.getDouble("salario");
                    String salario = String.valueOf(salario1);
                    tf_salario.setText(salario);
                }
                rs.close();
                rs2.close();
                rs3.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT nome_departamento FROM departamento WHERE"
                        + " cod_func =" + FuncionarioDAO.cod +" ");
                Statement stmt1 = conn.createStatement();
                ResultSet rs1 = stmt1.executeQuery("SELECT cod_departamento FROM departamento WHERE"
                        + " cod_func =" + FuncionarioDAO.cod +" ");
                
                while (rs.next() && rs1.next()) {
                    cb_departamento.addItem(rs.getString("nome_departamento"));
                    cb_cod_dept.addItem(rs1.getInt("cod_departamento"));
                }
                stmt.close();
                stmt1.close();
            } catch (Exception ex) {
                System.err.println("Erro I/O.\n " + ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_jt_salarioMouseClicked

    private void btn_excluir_salario_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_salario_funcionarioActionPerformed
        FuncionarioDAO.cod = (Integer) jt_salario.getValueAt(jt_salario.getSelectedRow(), 0);
        
        if (jt_salario.getSelectedRowCount() > 0) {
            try {
                FuncionarioDAO deletar = new FuncionarioDAO(); 
                deletar.deletarSalarioFuncionario(); 
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "ESCOLHA UM REGISTRO PARA SER EXCLUÍDO!");
        }
        
        SalarioFuncionarioTableModel obj = new SalarioFuncionarioTableModel();
        model = new SalarioFuncionarioTableModel(obj.ConsultaBancoSalarioFuncionario());
        jt_salario.setModel(model);
        
        jt_salario.setAutoResizeMode(jt_salario.AUTO_RESIZE_OFF);  
        jt_salario.getColumnModel().getColumn(0).setPreferredWidth(35);  
        jt_salario.getColumnModel().getColumn(1).setPreferredWidth(250);  
        jt_salario.getColumnModel().getColumn(2).setPreferredWidth(80);  
        jt_salario.getColumnModel().getColumn(3).setPreferredWidth(115);  
        jt_salario.getColumnModel().getColumn(4).setPreferredWidth(80);  
        jt_salario.getColumnModel().getColumn(5).setPreferredWidth(160); 
    }//GEN-LAST:event_btn_excluir_salario_funcionarioActionPerformed

    private void btn_limpar_salario_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpar_salario_funcionarioActionPerformed
        tf_nome.setText("");
        tf_cargo.setText("");
        tf_cod.setText("");
        tf_salario.setText("");
        
    }//GEN-LAST:event_btn_limpar_salario_funcionarioActionPerformed

    private void btn_alterar_salario_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterar_salario_funcionarioActionPerformed
        String nome = tf_nome.getText();
        Double salarioFunc = Double.parseDouble(tf_salario.getText());
        String nomeCargo = tf_cargo.getText();
        
        
        Salario salario = new Salario(nome, salarioFunc, nomeCargo, departamento);
        
        FuncionarioDAO update = new FuncionarioDAO();
        update.updateSalarioFuncionario(salario);
        
        SalarioFuncionarioTableModel obj = new SalarioFuncionarioTableModel();
        model = new SalarioFuncionarioTableModel(obj.ConsultaBancoSalarioFuncionario());
        jt_salario.setModel(model);
        
        jt_salario.setAutoResizeMode(jt_salario.AUTO_RESIZE_OFF);  
        jt_salario.getColumnModel().getColumn(0).setPreferredWidth(35);  
        jt_salario.getColumnModel().getColumn(1).setPreferredWidth(250);  
        jt_salario.getColumnModel().getColumn(2).setPreferredWidth(80);  
        jt_salario.getColumnModel().getColumn(3).setPreferredWidth(115);  
        jt_salario.getColumnModel().getColumn(4).setPreferredWidth(80);  
        jt_salario.getColumnModel().getColumn(5).setPreferredWidth(160);
    }//GEN-LAST:event_btn_alterar_salario_funcionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSalarioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSalarioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSalarioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSalarioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSalarioFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar_salario_funcionario;
    private javax.swing.JButton btn_consultar_salario_funcionario;
    private javax.swing.JButton btn_excluir_salario_funcionario;
    private javax.swing.JButton btn_limpar_salario_funcionario;
    private javax.swing.JButton btn_salvar_salario_funcionario;
    private javax.swing.JComboBox cb_cod_dept;
    private javax.swing.JComboBox cb_departamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jt_salario;
    private javax.swing.JTextField tf_cargo;
    private javax.swing.JTextField tf_cod;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_salario;
    // End of variables declaration//GEN-END:variables
}