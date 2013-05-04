/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;


import java.sql.Date;  
import java.text.SimpleDateFormat;  
/**
 *
 * @author PPW
 */
public class DataCadastro {
    private static Date data;
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    public Date DataAtual(){
    Date data = new Date(System.currentTimeMillis());    
    SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd");
    return data;
    }  

     
}
