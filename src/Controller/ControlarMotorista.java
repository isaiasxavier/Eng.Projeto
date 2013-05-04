/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ConexaoBanco;
import SuperClasses.Motorista;
import Telas.TelaCadastroMotoristaTerceirizado;
import Utilitarios.DataCadastro;
import java.sql.Connection;

/**
 *
 * @author PPW
 */
public class ControlarMotorista {
    private boolean confere;

    public boolean controlarCadastroMotorista(Motorista motorista) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        confere = false;

        if (conn != null
                && motorista.getNome() != null  && motorista.getNome().length() <= 450
                && motorista.getCpf()  != null  && motorista.getCpf().length() <= 60
                && motorista.getRg()   != null  && motorista.getRg().length() <= 60
             //   && motorista.getSituacaoSexo() != null
                && motorista.getRntcr()!= null && motorista.getRntcr().length() <= 60
                && motorista.getCnh()  != null   && motorista.getCnh().length() <= 60
                && motorista.getInss() != null  && motorista.getInss().length() <= 60
                && motorista.getEndereco().getEndereco()   != null && motorista.getEndereco().getEndereco().length() <= 450
                && motorista.getEndereco().getNumero()     != null && motorista.getEndereco().getNumero().length() <= 30
           //     && motorista.getEndereco().getSituacaoUF() != null
                && motorista.getEndereco().getCidade()     != null && motorista.getEndereco().getCidade().length() <= 255
                && motorista.getEndereco().getBairro()     != null && motorista.getEndereco().getBairro().length() <= 255
                && motorista.getEndereco().getCep()        != null && motorista.getEndereco().getCep().length() <= 20
                && motorista.getContato().getTelefone_residencial() != null && motorista.getContato().getTelefone_residencial().length() <= 255
                && motorista.getContato().getTelefone_celular()     != null && motorista.getContato().getTelefone_celular().length() <= 255
                && motorista.getContato().getEmail()        != null && motorista.getContato().getEmail().length() <= 100) {
                confere = true;
        }
        return confere;
        }
    
}
