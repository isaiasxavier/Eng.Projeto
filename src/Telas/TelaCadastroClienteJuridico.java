/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.ClienteDAO;
import DAO.ConexaoBanco;
import SuperClasses.ClienteJuridico;
import SuperClasses.Contato;
import SuperClasses.Endereco;
import Tabelas.ClienteJuridicoTableModel;
import Tabelas.ClienteTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PPW
 */
public class TelaCadastroClienteJuridico extends javax.swing.JFrame {
    private TelaPrincipal telaAnterior;
    private ClienteJuridicoTableModel model;
    private ClienteJuridico cliente;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    public TelaCadastroClienteJuridico() {
        initComponents();
    }
    
    public TelaCadastroClienteJuridico(TelaPrincipal telaAnterior) {
        this();
        this.telaAnterior = telaAnterior;
        
        ClienteJuridicoTableModel obj = new ClienteJuridicoTableModel();
        model = new ClienteJuridicoTableModel(obj.ConsultaBancoClienteJuridico());
        jt_cadastro_cliente.setModel(model);
        
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
        Nome = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        tf_cnpj = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cb_uf_motorista_terceirizado = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        tf_endereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_cidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_bairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tf_cep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_residencial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_celular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_salvar_cliente = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir_motorista_terceirizado = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_cadastro_cliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO CLIENTE JURÍDICO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nome.setText("FANTASIA:");

        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CPF.setText("CNPJ");

        tf_cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cnpjActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("UF:");

        cb_uf_motorista_terceirizado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cb_uf_motorista_terceirizado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cb_uf_motorista_terceirizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_uf_motorista_terceirizadoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ENDEREÇO/RUA:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("NÚMERO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("CIDADE:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("BAIRRO:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("CEP:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("TELEFONE COMERCIAL:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("TELEFONE(CELULAR):");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("E-MAIL:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_endereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_uf_motorista_terceirizado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cep))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_residencial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF)
                    .addComponent(tf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb_uf_motorista_terceirizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tf_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_salvar_cliente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_salvar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/download.png"))); // NOI18N
        btn_salvar_cliente.setText("SALVAR");
        btn_salvar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_clienteActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/under-construction.png"))); // NOI18N
        btn_alterar.setText("ALTERAR");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir_motorista_terceirizado.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_excluir_motorista_terceirizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mr. Bomb.png"))); // NOI18N
        btn_excluir_motorista_terceirizado.setText("EXCLUIR");
        btn_excluir_motorista_terceirizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_motorista_terceirizadoActionPerformed(evt);
            }
        });

        btn_limpar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Write Document.png"))); // NOI18N
        btn_limpar.setText("LIMPAR");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        jt_cadastro_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jt_cadastro_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_cadastro_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_cadastro_cliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_salvar_cliente)
                .addGap(51, 51, 51)
                .addComponent(btn_alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btn_excluir_motorista_terceirizado)
                .addGap(58, 58, 58)
                .addComponent(btn_limpar)
                .addGap(44, 44, 44))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir_motorista_terceirizado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-844)/2, (screenSize.height-574)/2, 844, 574);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cnpjActionPerformed

    private void cb_uf_motorista_terceirizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_uf_motorista_terceirizadoActionPerformed
        String siglas[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",            "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};

        String uf[] = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceara", "Distrito Federal",
            "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará",
            "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do sul",
            "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};

        for (int i = 0; i < siglas.length; i++) {
            if (cb_uf_motorista_terceirizado.getSelectedItem().equals(siglas[i])) {
                setEstado((uf[i]));

            }
        }
    }//GEN-LAST:event_cb_uf_motorista_terceirizadoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void btn_salvar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_clienteActionPerformed
        String nome          = tf_nome.getText();
        String cnpj          = tf_cnpj.getText();
        String logradouro    = tf_endereco.getText();
        String bairro        = tf_bairro.getText();
        String cep           = tf_cep.getText();
        String numero        = tf_numero.getText();
        String email         = tf_email.getText();
        String cidade        = tf_cidade.getText();
        String celular       = tf_celular.getText();
        String residencial   = tf_residencial.getText();
        
        Contato contato = new Contato(residencial, celular, email);
        Endereco endereco = new Endereco(logradouro, numero, cidade, bairro, cep, estado); 
        cliente = new ClienteJuridico(nome, cnpj, endereco, contato);
        
        ClienteDAO inserir = new ClienteDAO();
        inserir.inserirClienteJuridico(cliente);
        
        ClienteJuridicoTableModel obj = new ClienteJuridicoTableModel();
        model = new ClienteJuridicoTableModel(obj.ConsultaBancoClienteJuridico());
        jt_cadastro_cliente.setModel(model);
        

    }//GEN-LAST:event_btn_salvar_clienteActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        String nome          = tf_nome.getText();
        String cnpj          = tf_cnpj.getText();
        String logradouro    = tf_endereco.getText();
        String bairro        = tf_bairro.getText();
        String cep           = tf_cep.getText();
        String numero        = tf_numero.getText();
        String email         = tf_email.getText();
        String cidade        = tf_cidade.getText();
        String celular       = tf_celular.getText();
        String residencial   = tf_residencial.getText();
        
        Contato contato = new Contato(residencial, celular, email);
        Endereco endereco = new Endereco(logradouro, numero, cidade, bairro, cep, estado); 
        cliente = new ClienteJuridico(nome, cnpj, endereco, contato);
        
        ClienteDAO update = new ClienteDAO();
        update.updateClienteJuridico(cliente);
        
        ClienteJuridicoTableModel obj = new ClienteJuridicoTableModel();
        model = new ClienteJuridicoTableModel(obj.ConsultaBancoClienteJuridico());
        jt_cadastro_cliente.setModel(model);
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluir_motorista_terceirizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_motorista_terceirizadoActionPerformed
        ClienteDAO.cod = (Integer) jt_cadastro_cliente.getValueAt(jt_cadastro_cliente.getSelectedRow(), 0);
        
        if (jt_cadastro_cliente.getSelectedRowCount() > 0) {
            try {
                ClienteDAO deletar = new ClienteDAO(); 
                deletar.deletarRegistroJuridico(); 
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "ESCOLHA UM REGISTRO PARA SER EXCLUÍDO!");
        }
        
        ClienteJuridicoTableModel obj = new ClienteJuridicoTableModel();
        model = new ClienteJuridicoTableModel(obj.ConsultaBancoClienteJuridico());
        jt_cadastro_cliente.setModel(model);
    }//GEN-LAST:event_btn_excluir_motorista_terceirizadoActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        tf_nome.setText("");
        tf_cnpj.setText("");
        tf_endereco.setText("");
        tf_numero.setText("");
        tf_cidade.setText("");
        tf_bairro.setText("");
        tf_cep.setText("");
        tf_residencial.setText("");
        tf_celular.setText("");
        tf_email.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void jt_cadastro_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_cadastro_clienteMouseClicked
        ClienteDAO.cod = (Integer) jt_cadastro_cliente.getValueAt(jt_cadastro_cliente.getSelectedRow(), 0);
        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null){
            try{
                Statement estado1 = conn.createStatement();
                ResultSet rs = estado1.executeQuery("SELECT razaosocial, cnpj FROM cliente_juridico WHERE cod = " + ClienteDAO.cod + " ");     
                Statement estado2 = conn.createStatement();
                ResultSet rs1 = estado2.executeQuery("SELECT endereco, numero, cidade, bairro, cep FROM endereco_cliente_juridico WHERE cod_cliente_j = " + ClienteDAO.cod +" ");
                Statement estado3 = conn.createStatement();
                ResultSet rs2 = estado3.executeQuery("SELECT telefone_comercial, telefone_celular, email FROM contato_cliente_juridico WHERE cod_cliente_juridico = " + ClienteDAO.cod +" ");
                while(rs.next() && rs1.next() && rs2.next()){
                    tf_nome.setText(rs.getString("razaosocial"));
                    tf_cnpj.setText(rs.getString("cnpj"));
                    tf_endereco.setText(rs1.getString("endereco"));
                    tf_numero.setText(rs1.getString("numero"));
                    tf_cidade.setText(rs1.getString("cidade"));
                    tf_bairro.setText(rs1.getString("bairro"));
                    tf_cep.setText(rs1.getString("cep"));
                    tf_residencial.setText(rs2.getString("telefone_comercial"));
                    tf_celular.setText(rs2.getString("telefone_celular"));
                    tf_email.setText(rs2.getString("email"));
                }
                rs.close();
                rs1.close();
                rs2.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }      
        }
    }//GEN-LAST:event_jt_cadastro_clienteMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastroClienteJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClienteJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClienteJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClienteJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroClienteJuridico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir_motorista_terceirizado;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_salvar_cliente;
    private javax.swing.JComboBox cb_uf_motorista_terceirizado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTable jt_cadastro_cliente;
    private javax.swing.JTextField tf_bairro;
    private javax.swing.JTextField tf_celular;
    private javax.swing.JTextField tf_cep;
    private javax.swing.JTextField tf_cidade;
    private javax.swing.JTextField tf_cnpj;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_numero;
    private javax.swing.JTextField tf_residencial;
    // End of variables declaration//GEN-END:variables
}
