/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ConexaoBanco;
import SuperClasses.Fornecedor;
import Utilitarios.DataCadastro;
import java.sql.Connection;

/**
 *
 * @author PPW
 */
public class ControlarFornecedor {
     private boolean confere;

    public boolean controlarCadastroFornecedor(Fornecedor fornecedor) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        confere = false;

        if (conn != null
                && fornecedor.getNome() != null  && fornecedor.getNome().length() <= 450
                && fornecedor.getCnpj()  != null  && fornecedor.getCnpj().length() <= 14
                && fornecedor.getEndereco().getEndereco().length() <= 450
                && fornecedor.getEndereco().getNumero().length() <= 30
                && fornecedor.getEndereco().getCidade().length() <= 255
                && fornecedor.getEndereco().getBairro().length() <= 255
                && fornecedor.getEndereco().getCep()  != null && fornecedor.getEndereco().getCep().length() <= 20
                && fornecedor.getContato().getTelefone_residencial().length() <= 255
                && fornecedor.getContato().getTelefone_celular().length() <= 255
                && fornecedor.getContato().getEmail().length() <= 100) {
                confere = true;
        }
        return confere;
        }
    
}
