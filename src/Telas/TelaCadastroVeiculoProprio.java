/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ClassesConsulta.Veiculo;
import DAO.ConexaoBanco;
import DAO.VeiculoProprioDAO;
import Tabelas.VeiculoTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PPW
 */
public class TelaCadastroVeiculoProprio extends javax.swing.JFrame {
    private TelaPrincipal telaAnterior;
    private VeiculoTableModel model;
    private Veiculo veiculo;
    private String veiculoo;
    private String carreta;
    
    public String getVeiculoo() {
        return veiculoo;
    }

    public void setVeiculoo(String veiculoo) {
        this.veiculoo = veiculoo;
    }

    public String getCarreta() {
        return carreta;
    }

    public void setCarreta(String carreta) {
        this.carreta = carreta;
    }
    
    
    
    
    
    /**
     * Creates new form TelaCadastroVeiculoProprioo
     */
    public TelaCadastroVeiculoProprio() {
        initComponents();
    }
    
    public TelaCadastroVeiculoProprio(TelaPrincipal telaAnterior){
        this();
        this.telaAnterior = telaAnterior;
        
        VeiculoTableModel v = new VeiculoTableModel();
        model = new VeiculoTableModel(v.ConsultaVeiculoProprio());
        jt_veiculo_proprio.setModel(model);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        btn_salvar_veiculo_proprio = new javax.swing.JButton();
        btn_alterar_veiculo_terceirizado2 = new javax.swing.JButton();
        btn_limpar_veiculo_proprio = new javax.swing.JButton();
        btn_excluir_veiculo_terceirizado5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        tf_placacavalo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_cod = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        cb_veiculo_veiculo_proprio = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        cb_carreta_veiculo_proprio = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        tf_modelo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf_cor = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf_placacarreta = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tf_ano = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_veiculo_proprio = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO VEÌCULO PRÓPRIO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_salvar_veiculo_proprio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_salvar_veiculo_proprio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/download.png"))); // NOI18N
        btn_salvar_veiculo_proprio.setText("SALVAR");
        btn_salvar_veiculo_proprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_veiculo_proprioActionPerformed(evt);
            }
        });

        btn_alterar_veiculo_terceirizado2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_alterar_veiculo_terceirizado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/under-construction.png"))); // NOI18N
        btn_alterar_veiculo_terceirizado2.setText("ALTERAR");
        btn_alterar_veiculo_terceirizado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterar_veiculo_terceirizado2ActionPerformed(evt);
            }
        });

        btn_limpar_veiculo_proprio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_limpar_veiculo_proprio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Write Document.png"))); // NOI18N
        btn_limpar_veiculo_proprio.setText("LIMPAR");
        btn_limpar_veiculo_proprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar_veiculo_proprioActionPerformed(evt);
            }
        });

        btn_excluir_veiculo_terceirizado5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_excluir_veiculo_terceirizado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mr. Bomb.png"))); // NOI18N
        btn_excluir_veiculo_terceirizado5.setText("EXCLUIR");
        btn_excluir_veiculo_terceirizado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_veiculo_terceirizado5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_salvar_veiculo_proprio)
                .addGap(62, 62, 62)
                .addComponent(btn_alterar_veiculo_terceirizado2)
                .addGap(57, 57, 57)
                .addComponent(btn_excluir_veiculo_terceirizado5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btn_limpar_veiculo_proprio)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alterar_veiculo_terceirizado2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar_veiculo_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpar_veiculo_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir_veiculo_terceirizado5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("MARCA:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("PLACA/CAVALO MECÂNICO:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("CÓDIGO/MOTORISTA:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("VEÍCULO:");

        cb_veiculo_veiculo_proprio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_veiculo_veiculo_proprio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CAMINHÂO VUC", "CAMINHÂO TOCO", "CAMINHÂO TRUCK", "CAVALO MECÂNICO", "CAVALO MEÂNICO TRUCADO" }));
        cb_veiculo_veiculo_proprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_veiculo_veiculo_proprioActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("CARRETA:");

        cb_carreta_veiculo_proprio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_carreta_veiculo_proprio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NÂO", "CARRETA 2 EIXOS", "CARRETA 3 EIXOS", "CARRETA CAVALO TRUCADO", "BITREM" }));
        cb_carreta_veiculo_proprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_carreta_veiculo_proprioActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("MODELO:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("COR:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("PLACA/CARRETA:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("ANO:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NOME DO MOTORISTA:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_placacavalo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_placacarreta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_ano, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_veiculo_veiculo_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_carreta_veiculo_proprio, 0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cor))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nome)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(cb_veiculo_veiculo_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cb_carreta_veiculo_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(tf_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_placacavalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(tf_placacarreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(tf_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jt_veiculo_proprio.setModel(new javax.swing.table.DefaultTableModel(
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
        jt_veiculo_proprio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_veiculo_proprioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_veiculo_proprio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-844)/2, (screenSize.height-627)/2, 844, 627);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvar_veiculo_proprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_veiculo_proprioActionPerformed
        Integer cod  = Integer.parseInt(tf_cod.getText());
        String Marca = tf_marca.getText();
        String modelo = tf_modelo.getText();
        String Cor = tf_cor.getText();
        String Placacavalo = tf_placacavalo.getText();
        String Placacarreta = tf_placacarreta.getText();
        String ano  = tf_ano.getText();
        String nome = tf_nome.getText();
        
        veiculo = new Veiculo(nome, cod, Marca, modelo, Placacavalo, Placacarreta, ano, Cor, veiculoo, carreta);
        
        VeiculoProprioDAO inserir = new VeiculoProprioDAO();
        inserir.inserirVeiculoProprio(veiculo);

        VeiculoTableModel obj = new VeiculoTableModel();
        model = new VeiculoTableModel(obj.ConsultaVeiculoProprio());
        jt_veiculo_proprio.setModel(model);
    }//GEN-LAST:event_btn_salvar_veiculo_proprioActionPerformed

    private void btn_alterar_veiculo_terceirizado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterar_veiculo_terceirizado2ActionPerformed
        Integer cod  = Integer.parseInt(tf_cod.getText());
        String Marca = tf_marca.getText();
        String modelo = tf_modelo.getText();
        String Cor = tf_cor.getText();
        String Placacavalo = tf_placacavalo.getText();
        String Placacarreta = tf_placacarreta.getText();
        String ano  = tf_ano.getText();
        String nome = tf_nome.getText();
        
        veiculo = new Veiculo(nome, cod, Marca, modelo, Placacavalo, Placacarreta, ano, Cor, veiculoo, carreta);
        
        if(jt_veiculo_proprio.getSelectedRowCount() > 0){
            VeiculoProprioDAO update = new VeiculoProprioDAO();
            update.updateVeiculoProprio(veiculo);
        }else{
            JOptionPane.showMessageDialog(null, "ESCOLHA UM REGISTRO PARA SER ALTERADO");
        }
        
        VeiculoTableModel v = new VeiculoTableModel();
        model = new VeiculoTableModel(v.ConsultaVeiculoProprio());
        jt_veiculo_proprio.setModel(model);
        
    }//GEN-LAST:event_btn_alterar_veiculo_terceirizado2ActionPerformed

    private void btn_limpar_veiculo_proprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpar_veiculo_proprioActionPerformed
        tf_cod.setText("");
        tf_marca.setText("");
        tf_modelo.setText("");
        tf_cor.setText("");
        tf_placacavalo.setText("");
        tf_placacarreta.setText("");
        tf_ano.setText("");
        tf_nome.setText("");
    }//GEN-LAST:event_btn_limpar_veiculo_proprioActionPerformed

    private void btn_excluir_veiculo_terceirizado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_veiculo_terceirizado5ActionPerformed
        Connection conn = new ConexaoBanco().conectaAgora();
        int x = jt_veiculo_proprio.getSelectedRow();
        VeiculoProprioDAO.cod = (Integer) jt_veiculo_proprio.getValueAt(x, 0);
         
        if (jt_veiculo_proprio.getSelectedRowCount() > 0) {
            try {
                VeiculoProprioDAO deletar = new VeiculoProprioDAO(); 
                deletar.deletarRegistro(); 
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "O REGISTRO NÂO FOI EXCLUÍDO COM SUCESSO!");
        }
        
        VeiculoTableModel obj = new VeiculoTableModel();
        model = new VeiculoTableModel(obj.ConsultaVeiculoProprio());
        jt_veiculo_proprio.setModel(model);
    }//GEN-LAST:event_btn_excluir_veiculo_terceirizado5ActionPerformed

    private void cb_veiculo_veiculo_proprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_veiculo_veiculo_proprioActionPerformed
        String opcao[] = {"CAMINHÂO VUC", "CAMINHÂO TOCO", "CAMINHÂO TRUCK", "CAVALO MECÂNICO", "CAVALO MEÂNICO TRUCADO"};

        String escolha[] = {"CAMINHÂO VUC", "CAMINHÂO TOCO", "CAMINHÂO TRUCK", "CAVALO MECÂNICO", "CAVALO MEÂNICO TRUCADO"};
        
        for (int i = 0; i < opcao.length; i++) {
            if (cb_veiculo_veiculo_proprio.getSelectedItem().equals(opcao[i])) {
                setVeiculoo(escolha[i]);

            }
        }
    }//GEN-LAST:event_cb_veiculo_veiculo_proprioActionPerformed

    private void cb_carreta_veiculo_proprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_carreta_veiculo_proprioActionPerformed
        String opcao[] = {"NÂO", "CARRETA 2 EIXOS", "CARRETA 3 EIXOS", "CARRETA CAVALO TRUCADO", "BITREM"};

        String escolha[] = {"NÂO", "CARRETA 2 EIXOS", "CARRETA 3 EIXOS", "CARRETA CAVALO TRUCADO", "BITREM"};
        
        
        for (int i = 0; i < opcao.length; i++) {
            if (cb_carreta_veiculo_proprio.getSelectedItem().equals(opcao[i])) {
                setCarreta(escolha[i]);
            }
        }
    }//GEN-LAST:event_cb_carreta_veiculo_proprioActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void jt_veiculo_proprioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_veiculo_proprioMouseClicked
        int x = jt_veiculo_proprio.getSelectedRow();
        VeiculoProprioDAO.cod = (Integer) jt_veiculo_proprio.getValueAt(x, 0);   
        Connection conn = new ConexaoBanco().conectaAgora();
        
        if (conn != null){
            try{
                Statement estado = conn.createStatement();
                Statement estado1 = conn.createStatement();
                ResultSet rs = estado.executeQuery("SELECT cod_motorista_p, marca, modelo, cor, placacavalo, placacarreta,"
                        + " ano FROM veiculo_proprio WHERE cod_motorista_p = " + VeiculoProprioDAO.cod + " ");
                ResultSet rs1 = estado1.executeQuery("SELECT nome FROM motorista_proprio WHERE cod = " + VeiculoProprioDAO.cod + " ");      
                while(rs.next() && rs1.next()){
                    tf_cod.setText(rs.getString("cod_motorista_p"));
                    tf_marca.setText(rs.getString("marca"));
                    tf_modelo.setText(rs.getString("modelo"));
                    tf_cor.setText(rs.getString("cor"));
                    tf_placacavalo.setText(rs.getString("placacavalo"));
                    tf_placacarreta.setText(rs.getString("placacarreta"));
                    tf_ano.setText(rs.getString("ano"));
                    tf_nome.setText(rs1.getString("nome"));
                }
                rs.close();
                rs1.close();
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }      
        }
    }//GEN-LAST:event_jt_veiculo_proprioMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculoProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculoProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculoProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculoProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculoProprio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar_veiculo_terceirizado2;
    private javax.swing.JButton btn_excluir_veiculo_terceirizado5;
    private javax.swing.JButton btn_limpar_veiculo_proprio;
    private javax.swing.JButton btn_salvar_veiculo_proprio;
    private javax.swing.JComboBox cb_carreta_veiculo_proprio;
    private javax.swing.JComboBox cb_veiculo_veiculo_proprio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jt_veiculo_proprio;
    private javax.swing.JTextField tf_ano;
    private javax.swing.JTextField tf_cod;
    private javax.swing.JTextField tf_cor;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_placacarreta;
    private javax.swing.JTextField tf_placacavalo;
    // End of variables declaration//GEN-END:variables
}
