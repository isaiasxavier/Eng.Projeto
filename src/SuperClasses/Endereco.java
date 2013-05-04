/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClasses;

/**
 *
 * @author PPW
 */
public class Endereco {
    
    private  String endereco;
    private  String numero;
    private  String cidade;
    private  String bairro;
    private  String cep;

    public Endereco(String situacaoUF) {
        
    }
    private  String situacaoUF;

    public Endereco(String endereco, String numero, String cidade, String bairro, String cep, String situacaoUF) {
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.situacaoUF = situacaoUF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSituacaoUF() {
        return situacaoUF;
    }

    public void setSituacaoUF(String situacaoUF) {
        this.situacaoUF = situacaoUF;
    }
    
   
}
