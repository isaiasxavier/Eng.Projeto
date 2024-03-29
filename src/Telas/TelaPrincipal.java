/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import org.jrimum.bopepo.BancosSuportados;
import org.jrimum.bopepo.Boleto;
import org.jrimum.bopepo.view.BoletoViewer;
import org.jrimum.domkee.comum.pessoa.endereco.CEP;
import org.jrimum.domkee.comum.pessoa.endereco.Endereco;
import org.jrimum.domkee.comum.pessoa.endereco.UnidadeFederativa;
import org.jrimum.domkee.financeiro.banco.febraban.Carteira;
import org.jrimum.domkee.financeiro.banco.febraban.Cedente;
import org.jrimum.domkee.financeiro.banco.febraban.ContaBancaria;
import org.jrimum.domkee.financeiro.banco.febraban.NumeroDaConta;
import org.jrimum.domkee.financeiro.banco.febraban.Sacado;
import org.jrimum.domkee.financeiro.banco.febraban.SacadorAvalista;
import org.jrimum.domkee.financeiro.banco.febraban.TipoDeTitulo;
import org.jrimum.domkee.financeiro.banco.febraban.Titulo;


/**
 *
 * @author PPW
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        new TelaLogin().dispose();
    }
    
     private static void mostreBoletoNaTela(File arquivoBoleto) {

                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                
                try {
                        desktop.open(arquivoBoleto);
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnCadastro = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnFuncionarios = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnFornecedores = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jmenu_veiculo_terceirizado = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnSair1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transportadora do seu Felício");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MnCadastro.setText("Cadastro");
        MnCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MnCadastroKeyPressed(evt);
            }
        });

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Users.png"))); // NOI18N
        jMenu6.setText("CLIENTES");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/User.png"))); // NOI18N
        jMenuItem8.setText("CLIENTE FÍSICO");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fornecedor.png"))); // NOI18N
        jMenuItem9.setText("CLIENTE JÚRIDICO");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        MnCadastro.add(jMenu6);
        MnCadastro.add(jSeparator6);

        mnFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario.png"))); // NOI18N
        mnFuncionarios.setText("FUNCIONÁRIOS");
        mnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFuncionariosActionPerformed(evt);
            }
        });
        MnCadastro.add(mnFuncionarios);
        MnCadastro.add(jSeparator4);

        mnFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fornecedor.png"))); // NOI18N
        mnFornecedores.setText("FORNECEDORES");
        mnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFornecedoresActionPerformed(evt);
            }
        });
        MnCadastro.add(mnFornecedores);
        MnCadastro.add(jSeparator3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pedro e bino.png"))); // NOI18N
        jMenu2.setText("CADASTRAR MOTORISTA");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bino.png"))); // NOI18N
        jMenuItem3.setText("MOTORISTA TERCEIRIZADO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pedro.png"))); // NOI18N
        jMenuItem2.setText("MOTORISTA PRÓPRIO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        MnCadastro.add(jMenu2);
        MnCadastro.add(jSeparator1);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/truck_icon.png"))); // NOI18N
        jMenu1.setText("CADASTRAR VEÍCULOS");

        jmenu_veiculo_terceirizado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmenu_veiculo_terceirizado.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jmenu_veiculo_terceirizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/truck_icon1.png"))); // NOI18N
        jmenu_veiculo_terceirizado.setText("VEÍCULO TERCEIRIZADO");
        jmenu_veiculo_terceirizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_veiculo_terceirizadoActionPerformed(evt);
            }
        });
        jMenu1.add(jmenu_veiculo_terceirizado);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/truck_icon3.png"))); // NOI18N
        jMenuItem1.setText("VEÍCULO PRÓPRIO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MnCadastro.add(jMenu1);

        jMenuBar1.add(MnCadastro);

        jMenu4.setText("Financeiro");

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/despesas.png"))); // NOI18N
        jMenu5.setText("SALÁRIOS");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario.png"))); // NOI18N
        jMenuItem4.setText("FUNCIONÁRIOS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pedro.png"))); // NOI18N
        jMenuItem5.setText("MOTORISTA PRÓPRIO");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenu4.add(jMenu5);
        jMenu4.add(jSeparator5);

        jMenuBar1.add(jMenu4);

        mnSair1.setText("Frete");
        mnSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSair1MouseClicked(evt);
            }
        });
        mnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSair1ActionPerformed(evt);
            }
        });

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rotas.png"))); // NOI18N
        jMenu3.setText("CADASTRAR FRETES");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("FRETE LEVE");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("FRETE PESADO");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        mnSair1.add(jMenu3);

        jMenuBar1.add(mnSair1);

        mnSair.setText("Sair");
        mnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSairMouseClicked(evt);
            }
        });
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1)
                .addContainerGap(676, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton1)
                .addContainerGap(474, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-867)/2, (screenSize.height-650)/2, 867, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void mnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFornecedoresActionPerformed
        this.setEnabled(false);

        new TelaCadastroFornecedor(this).setVisible(true);
    }//GEN-LAST:event_mnFornecedoresActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mnSairMouseClicked

    private void mnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFuncionariosActionPerformed
        this.setEnabled(false);

        new TelaCadastroFuncionario(this).setVisible(true);
    }//GEN-LAST:event_mnFuncionariosActionPerformed

    private void jmenu_veiculo_terceirizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_veiculo_terceirizadoActionPerformed
        this.setEnabled(false);

        new TelaCadastroMotoristaTerceirizado(this).setVisible(true);
    }//GEN-LAST:event_jmenu_veiculo_terceirizadoActionPerformed

    private void MnCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MnCadastroKeyPressed
    }//GEN-LAST:event_MnCadastroKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setEnabled(false);

        new TelaCadastroVeiculoProprio(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setEnabled(false);

        new TelaCadastroMotoristaProprio(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setEnabled(false);

        new TelaCadastroMotoristaTerceirizado(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setEnabled(false);

        new TelaSalarioFuncionario(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setEnabled(false);

        new TelaSalarioMotoristaProprio(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSair1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSair1MouseClicked

    private void mnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSair1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.setEnabled(false);

        new TelaCadastroCliente(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.setEnabled(false);

        new TelaFretePesado(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.setEnabled(false);

        new TelaCadastroClienteJuridico(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
                 * INFORMANDO DADOS SOBRE O CEDENTE.
                 */
                Cedente cedente = new Cedente("Transportadora do seu Felício", "00.000.208/0001-00");

                /*
                 * INFORMANDO DADOS SOBRE O SACADO.
                 */
                Sacado sacado = new Sacado("JavaDeveloper Pronto Para Férias", "222.222.222-22");

                // Informando o endereço do sacado.
                Endereco enderecoSac = new Endereco();
                enderecoSac.setUF(UnidadeFederativa.RN);
                enderecoSac.setLocalidade("Natal");
                enderecoSac.setCep(new CEP("59064-120"));
                enderecoSac.setBairro("Grande Centro");
                enderecoSac.setLogradouro("Rua poeta dos programas");
                enderecoSac.setNumero("1");
                sacado.addEndereco(enderecoSac);

                /*
                 * INFORMANDO DADOS SOBRE O SACADOR AVALISTA.
                 */
                SacadorAvalista sacadorAvalista = new SacadorAvalista("JRimum Enterprise", "00.000.000/0001-91");

                // Informando o endereço do sacador avalista.
                Endereco enderecoSacAval = new Endereco();
                enderecoSacAval.setUF(UnidadeFederativa.DF);
                enderecoSacAval.setLocalidade("Brasília");
                enderecoSacAval.setCep(new CEP("59000-000"));
                enderecoSacAval.setBairro("Grande Centro");
                enderecoSacAval.setLogradouro("Rua Eternamente Principal");
                enderecoSacAval.setNumero("001");
                sacadorAvalista.addEndereco(enderecoSacAval);

                /*
                 * INFORMANDO OS DADOS SOBRE O TÍTULO.
                 */
                
                // Informando dados sobre a conta bancária do título.
                ContaBancaria contaBancaria = new ContaBancaria(BancosSuportados.BANCO_BRADESCO.create());
                contaBancaria.setNumeroDaConta(new NumeroDaConta(123456, "0"));
                contaBancaria.setCarteira(new Carteira(30));
                contaBancaria.setAgencia(new org.jrimum.domkee.financeiro.banco.febraban.Agencia(1234, "1"));
                
                Titulo titulo = new Titulo(contaBancaria, sacado, cedente, sacadorAvalista);
                titulo.setNumeroDoDocumento("123456");
                titulo.setNossoNumero("99345678912");
                titulo.setDigitoDoNossoNumero("5");
                titulo.setValor(BigDecimal.valueOf(0.23));
                titulo.setDataDoDocumento(new Date());
                titulo.setDataDoVencimento(new Date());
                titulo.setTipoDeDocumento(TipoDeTitulo.DM_DUPLICATA_MERCANTIL);
                titulo.setAceite(Titulo.EnumAceite.A);
                titulo.setDesconto(new BigDecimal(0.05));
             //   titulo.setDeducao(BigDecimal.ZERO);
             //   titulo.setMora(BigDecimal.ZERO);
             //   titulo.setAcrecimo(BigDecimal.ZERO);
             //   titulo.setValorCobrado(BigDecimal.ZERO);

                /*
                 * INFORMANDO OS DADOS SOBRE O BOLETO.
                 */
                Boleto boleto = new Boleto(titulo);
                
                boleto.setLocalPagamento("Pagável preferencialmente na Rede X ou em " +
                                "qualquer Banco até o Vencimento.");
                boleto.setInstrucaoAoSacado("Senhor sacado, sabemos sim que o valor " +
                                "cobrado não é o esperado, aproveite o DESCONTÃO!");
                boleto.setInstrucao1("PARA PAGAMENTO 1 até Hoje não cobrar nada!");
                boleto.setInstrucao2("PARA PAGAMENTO 2 até Amanhã Não cobre!");
                boleto.setInstrucao3("PARA PAGAMENTO 3 até Depois de amanhã, OK, não cobre.");
                boleto.setInstrucao4("PARA PAGAMENTO 4 até 04/xx/xxxx de 4 dias atrás COBRAR O VALOR DE: R$ 01,00");
                boleto.setInstrucao5("PARA PAGAMENTO 5 até 05/xx/xxxx COBRAR O VALOR DE: R$ 02,00");
                boleto.setInstrucao6("PARA PAGAMENTO 6 até 06/xx/xxxx COBRAR O VALOR DE: R$ 03,00");
                boleto.setInstrucao7("PARA PAGAMENTO 7 até xx/xx/xxxx COBRAR O VALOR QUE VOCÊ QUISER!");
                boleto.setInstrucao8("APÓS o Vencimento, Pagável Somente na Rede X.");

                /*
                 * GERANDO O BOLETO BANCÁRIO.
                 */
                // Instanciando um objeto "BoletoViewer", classe responsável pela
                // geração do boleto bancário.
                BoletoViewer boletoViewer = new BoletoViewer(boleto);

                // Gerando o arquivo. No caso o arquivo mencionado será salvo na mesma
                // pasta do projeto. Outros exemplos:
                // WINDOWS: boletoViewer.getAsPDF("C:/Temp/MeuBoleto.pdf");
                // LINUX: boletoViewer.getAsPDF("/home/temp/MeuBoleto.pdf");
                File arquivoPdf = boletoViewer.getPdfAsFile("C:/Temp/MeuBoleto.pdf");

                // Mostrando o boleto gerado na tela.
                mostreBoletoNaTela(arquivoPdf);
        

        /**
         * Exibe o arquivo na tela.
         * 
         * @param arquivoBoleto
         */
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuItem jmenu_veiculo_terceirizado;
    private javax.swing.JMenuItem mnFornecedores;
    private javax.swing.JMenuItem mnFuncionarios;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenu mnSair1;
    // End of variables declaration//GEN-END:variables
}
