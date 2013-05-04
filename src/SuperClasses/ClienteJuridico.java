/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClasses;

/**
 *
 * @author PPW
 */
public class ClienteJuridico {
    private  Endereco endereco;
    private  Contato contato;
    private  String nome;
    private  String cnpj;

    public ClienteJuridico(String nome, String cnpj, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
