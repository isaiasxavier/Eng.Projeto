/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import SuperClasses.Login;
import DAO.ConexaoBanco;
import Telas.TelaLogin;
import Telas.TelaPrincipal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PPW
 */
public class ValidarLogin {

    public void Valida() {

        Connection conn = new ConexaoBanco().conectaAgora();
        if (conn != null) {
            try {
                Statement estado = conn.createStatement();
                ResultSet rs = estado.executeQuery("SELECT usuario, senha FROM login");

                boolean achou = false;
                while (rs.next()) {
                    if (rs.getString("usuario").equals(Login.getUsuario()) && rs.getString("senha").equals(Login.getSenha())) {
                        achou = true;
                    }
                }
                if (achou == false ) {
                    JOptionPane.showMessageDialog(null, "USUARIO ou SENHA incorreta!");

                    new TelaLogin().setFocusCycleRoot(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Bem vindo!");

                    new TelaPrincipal().setVisible(true);

                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }
}
