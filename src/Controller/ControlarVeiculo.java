/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ClassesConsulta.Veiculo;
import DAO.ConexaoBanco;
import java.sql.Connection;

/**
 *
 * @author PPW
 */
public class ControlarVeiculo {
    private boolean conferir;
    public Boolean ControlarVeiculo(Veiculo veiculo){
        Connection conn = new ConexaoBanco().conectaAgora();
        boolean conferir = false;
        if(conn != null
            /*    && veiculo.getCor().length() <= 9
                && veiculo.getPlacaCavalo() != null && veiculo.getPlacaCavalo().length() <= 9
                && veiculo.getPlacaCarreta() != null && veiculo.getPlacaCarreta().length() <= 9
                && veiculo.getAno().length() <= 8
                && veiculo.getCarreta() != null && veiculo.getCarreta().length() <= 50
                && veiculo.getMarca() != null && veiculo.getMarca().length() <= 14
                && veiculo.getModelo() != null && veiculo.getModelo().length() <= 50
                && veiculo.getVeiculo() != null && veiculo.getVeiculo().length() <= 50
                && veiculo.getCod_motorista() != null*/ ){
            conferir = true;
        }
        return conferir;
        
        }
        
}
