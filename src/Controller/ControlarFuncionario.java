/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ConexaoBanco;
import SuperClasses.Funcionario;
import Utilitarios.DataCadastro;
import java.sql.Connection;

/**
 *
 * @author PPW
 */
public class ControlarFuncionario {
    private boolean confere;

    public boolean controlarCadastroFuncionario(Funcionario funcionario) {
        Connection conn = new ConexaoBanco().conectaAgora();
        DataCadastro data = new DataCadastro();
        confere = false;

        if (conn != null
                && funcionario.getNome() != null  && funcionario.getNome().length() <= 450
                && funcionario.getCpf()  != null  && funcionario.getCpf().length() <= 60
                && funcionario.getRg()   != null  && funcionario.getRg().length() <= 60
                && funcionario.getDepartamento()   != null  && funcionario.getDepartamento().length() <= 100
                && funcionario.getCargo()   != null  && funcionario.getCargo().length() <= 100
             //   && funcionario.getSituacaoSexo() != null
                && funcionario.getEndereco().getEndereco()   != null && funcionario.getEndereco().getEndereco().length() <= 450
                && funcionario.getEndereco().getNumero()     != null && funcionario.getEndereco().getNumero().length() <= 30
           //     && funcionario.getEndereco().getSituacaoUF() != null
                && funcionario.getEndereco().getCidade()     != null && funcionario.getEndereco().getCidade().length() <= 255
                && funcionario.getEndereco().getBairro()     != null && funcionario.getEndereco().getBairro().length() <= 255
                && funcionario.getEndereco().getCep()        != null && funcionario.getEndereco().getCep().length() <= 20
                && funcionario.getContato().getTelefone_residencial() != null && funcionario.getContato().getTelefone_residencial().length() <= 255
                && funcionario.getContato().getTelefone_celular()     != null && funcionario.getContato().getTelefone_celular().length() <= 255
                && funcionario.getContato().getEmail()        != null && funcionario.getContato().getEmail().length() <= 100) {
                confere = true;
        }
        return confere;
        }
    
}
