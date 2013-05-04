/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClasses;

/**
 *
 * @author PPW
 */
public class Cliente extends Pessoa{
    private  Endereco endereco;
    private  Contato contato;

    public Cliente(Endereco endereco, Contato contato, String nome, String cpf, String rg, String situacaoSexo) {
        super(nome, cpf, rg, situacaoSexo);
        this.endereco = endereco;
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    
}
