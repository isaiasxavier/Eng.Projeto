/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.ConexaoBanco;
import SuperClasses.Cliente;
import Utilitarios.DataCadastro;
import java.sql.Connection;

/**
 *
 * @author PPW
 */
public class ControlarCliente {
    private boolean confere;

    public boolean controlarCadastroCliente(Cliente cliente) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        confere = false;

        if (conn != null
                && cliente.getNome() != null  && cliente.getNome().length() <= 450
                && cliente.getCpf()  != null  && cliente.getCpf().length() <= 60
                && cliente.getRg().length() <= 60
                && cliente.getEndereco().getEndereco().length() <= 450
                && cliente.getEndereco().getNumero().length() <= 30
                && cliente.getEndereco().getCidade().length() <= 255
                && cliente.getEndereco().getBairro().length() <= 255
                && cliente.getEndereco().getCep()  != null && cliente.getEndereco().getCep().length() <= 20
                && cliente.getContato().getTelefone_residencial().length() <= 255
                && cliente.getContato().getTelefone_celular().length() <= 255
                && cliente.getContato().getEmail().length() <= 100) {
                confere = true;
        }
        return confere;
        }
    
}
