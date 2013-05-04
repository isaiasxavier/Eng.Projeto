/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.ConexaoBanco;
import DAO.MotoristaProprioDAO;
import SuperClasses.Contato;
import SuperClasses.Endereco;
import SuperClasses.Motorista;
import Tabelas.MotoristaTableModel;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PPW
 */
public class TelaCadastroMotoristaProprio extends javax.swing.JFrame {
    private TelaPrincipal telaAnterior;
    private MotoristaTableModel model;
    private String sexo;
    private String estado;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Creates new form TelaCadastroMotoristaProprio
     */
    public TelaCadastroMotoristaProprio() {
        super();
        initComponents();
        setResizable(false);
        
    }
    
    public TelaCadastroMotoristaProprio(TelaPrincipal telaAnterior){
        this();
        this.telaAnterior = telaAnterior;
        
       MotoristaTableModel obj = new MotoristaTableModel();
       model = new MotoristaTableModel(obj.ConsultaBancoProprio());
       jTCadastroMotoristaProprio.setModel(model);
        
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
        tf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_cpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_rg = new javax.swing.JTextField();
        cb_sexo_motorista_proprio = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_rntcr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_cnh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_inss = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tf_endereco = new javax.swing.JTextField();
        cb_uf_motorista_proprio = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        tf_numero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_cidade = new javax.swing.JTextField();
        tf_cep = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_bairro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        tf_residencial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_celular = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCadastroMotoristaProprio = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_salvar_motorista_terceirizado = new javax.swing.JButton();
        btn_alterar_motorista_proprio = new javax.swing.JButton();
        btn_excluir_motorista_proprio = new javax.swing.JButton();
        btn_excluir_motorista_proprio1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO MOTORISTA PROPRIO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("RG:");

        cb_sexo_motorista_proprio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cb_sexo_motorista_proprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sexo_motorista_proprioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("SEXO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("RNTCR:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CNH:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Inscr. INSS Nº:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ENDEREÇO/RUA:");

        cb_uf_motorista_proprio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cb_uf_motorista_proprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_uf_motorista_proprioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("UF:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("NÚMERO:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("CIDADE:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("CEP:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("BAIRRO:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Tele/RESIDENCIAL:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Tele/CELULAR:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("EMAIL:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_residencial, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_email))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_sexo_motorista_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_rntcr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cnh, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_inss, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_endereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_uf_motorista_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tf_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_sexo_motorista_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_rntcr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tf_cnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tf_inss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_uf_motorista_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tf_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTCadastroMotoristaProprio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTCadastroMotoristaProprio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCadastroMotoristaProprioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCadastroMotoristaProprio);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_salvar_motorista_terceirizado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_salvar_motorista_terceirizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/download.png"))); // NOI18N
        btn_salvar_motorista_terceirizado.setText("SALVAR");
        btn_salvar_motorista_terceirizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_motorista_terceirizadoActionPerformed(evt);
            }
        });

        btn_alterar_motorista_proprio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_alterar_motorista_proprio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/under-construction.png"))); // NOI18N
        btn_alterar_motorista_proprio.setText("ALTERAR");
        btn_alterar_motorista_proprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterar_motorista_proprioActionPerformed(evt);
            }
        });

        btn_excluir_motorista_proprio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_excluir_motorista_proprio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mr. Bomb.png"))); // NOI18N
        btn_excluir_motorista_proprio.setText("EXCLUIR");
        btn_excluir_motorista_proprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_motorista_proprioActionPerformed(evt);
            }
        });

        btn_excluir_motorista_proprio1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_excluir_motorista_proprio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Write Document.png"))); // NOI18N
        btn_excluir_motorista_proprio1.setText("LIMPAR");
        btn_excluir_motorista_proprio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_motorista_proprio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_salvar_motorista_terceirizado)
                .addGap(54, 54, 54)
                .addComponent(btn_alterar_motorista_proprio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btn_excluir_motorista_proprio)
                .addGap(50, 50, 50)
                .addComponent(btn_excluir_motorista_proprio1)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alterar_motorista_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar_motorista_terceirizado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir_motorista_proprio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir_motorista_proprio1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ultimos.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-844)/2, (screenSize.height-627)/2, 844, 627);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void btn_salvar_motorista_terceirizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_motorista_terceirizadoActionPerformed
        String nome = tf_nome.getText();
        String cpf  = tf_cpf.getText();
        String rg   = tf_rg.getText();
        String cnh  = tf_cnh.getText();
        String inss          = tf_inss.getText();
        String rntcr         = tf_rntcr.getText();
        String logradouro    = tf_endereco.getText();
        String bairro        = tf_bairro.getText();
        String cep           = tf_cep.getText();
        String numero        = tf_numero.getText();
        String email         = tf_email.getText();
        String cidade        = tf_cidade.getText();
        String celular       = tf_celular.getText();
        String residencial   = tf_residencial.getText();
      
        Endereco endereco   = new Endereco(logradouro, numero, cidade, bairro, cep, estado);
        Contato contato     = new Contato (residencial, celular, email);
        Motorista motorista = new Motorista(inss, rntcr, cnh, endereco, contato, nome, cpf, rg, sexo);
        
        MotoristaProprioDAO inserir = new MotoristaProprioDAO();
        inserir.inserirMotoristaProprio(motorista);
        
        MotoristaTableModel obj = new MotoristaTableModel();
        model = new MotoristaTableModel(obj.ConsultaBancoProprio());
        jTCadastroMotoristaProprio.setModel(model);
        
        
    }//GEN-LAST:event_btn_salvar_motorista_terceirizadoActionPerformed

    private void btn_alterar_motorista_proprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterar_motorista_proprioActionPerformed
        if(jTCadastroMotoristaProprio.getSelectedRowCount() > 0){
             
        }else{
            JOptionPane.showMessageDialog(null, "ESCOLHA UM REGISTRO PARA SER ALTERADO");
        }
    }//GEN-LAST:event_btn_alterar_motorista_proprioActionPerformed

    private void btn_excluir_motorista_proprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_motorista_proprioActionPerformed
        Connection conn = new ConexaoBanco().conectaAgora();
        
        if (conn != null) {
            try {
                int x = jTCadastroMotoristaProprio.getSelectedRow();  
                Integer cod = (Integer) jTCadastroMotoristaProprio.getValueAt(x, 0);  
                Statement estado1 = conn.createStatement();
                String deletaContato = "DELETE FROM contato_motorista_proprio WHERE cod_motorista_proprio = "+ cod +" ";  
                estado1.executeUpdate(deletaContato);
                String deletaEndereco = "DELETE FROM endereco_motorista_proprio WHERE cod_motorista_p = "+ cod +" ";
                estado1.executeUpdate(deletaEndereco);
                String deletaMotorista = "DELETE FROM motorista_proprio WHERE cod = "+ cod +" ";
                estado1.executeUpdate(deletaMotorista);
                JOptionPane.showMessageDialog(null, "O REGISTRO FOI EXCLUÍDO COM SUCESSO");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "O REGISTRO NÂO FOI EXCLUÍDO COM SUCESSO!");
        }
        
        //Atualiza a Tabela realizando uma nova consulta
        MotoristaTableModel obj = new MotoristaTableModel();
        model = new MotoristaTableModel(obj.ConsultaBancoProprio());
        jTCadastroMotoristaProprio.setModel(model);
        
    }//GEN-LAST:event_btn_excluir_motorista_proprioActionPerformed

    private void cb_sexo_motorista_proprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sexo_motorista_proprioActionPerformed
        Motorista motorista = new Motorista(null, null, null, null, null, null, null, null, null);
        if (cb_sexo_motorista_proprio.getSelectedItem().equals("M")) {
            sexo = ("Masculino");

        } else if (cb_sexo_motorista_proprio.getSelectedItem().equals("F")) {
            sexo = ("Masculino");
        }
    }//GEN-LAST:event_cb_sexo_motorista_proprioActionPerformed

    private void cb_uf_motorista_proprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_uf_motorista_proprioActionPerformed
        String uf[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS","MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};

        String estado[] = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceara", "Distrito Federal",
            "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará",
            "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do sul",
            "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
        
       
        for (int i = 0; i < uf.length; i++) {
            if (cb_uf_motorista_proprio.getSelectedItem().equals(uf[i])) {
                setEstado(estado[i]);

            }
        }
    }//GEN-LAST:event_cb_uf_motorista_proprioActionPerformed

    private void jTCadastroMotoristaProprioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCadastroMotoristaProprioMouseClicked
      
        
    }//GEN-LAST:event_jTCadastroMotoristaProprioMouseClicked

    private void btn_excluir_motorista_proprio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_motorista_proprio1ActionPerformed
        tf_nome.setText("");
        tf_cpf.setText("");
        tf_rg.setText("");
        tf_cnh.setText("");
        tf_inss.setText("");
        tf_rntcr.setText("");
        tf_endereco.setText("");
        tf_bairro.setText("");
        tf_cep.setText("");
        tf_numero.setText("");
        tf_email.setText("");
        tf_cidade.setText("");
        tf_celular.setText("");
        tf_residencial.setText("");
    }//GEN-LAST:event_btn_excluir_motorista_proprio1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroMotoristaProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMotoristaProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMotoristaProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMotoristaProprio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroMotoristaProprio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar_motorista_proprio;
    private javax.swing.JButton btn_excluir_motorista_proprio;
    private javax.swing.JButton btn_excluir_motorista_proprio1;
    private javax.swing.JButton btn_salvar_motorista_terceirizado;
    private javax.swing.JComboBox cb_sexo_motorista_proprio;
    private javax.swing.JComboBox cb_uf_motorista_proprio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTCadastroMotoristaProprio;
    private javax.swing.JTextField tf_bairro;
    private javax.swing.JTextField tf_celular;
    private javax.swing.JTextField tf_cep;
    private javax.swing.JTextField tf_cidade;
    private javax.swing.JTextField tf_cnh;
    private javax.swing.JTextField tf_cpf;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_inss;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_numero;
    private javax.swing.JTextField tf_residencial;
    private javax.swing.JTextField tf_rg;
    private javax.swing.JTextField tf_rntcr;
    // End of variables declaration//GEN-END:variables
}
