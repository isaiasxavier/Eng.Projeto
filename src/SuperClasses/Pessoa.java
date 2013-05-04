/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClasses;

/**
 *
 * @author PPW
 */
public class Pessoa {
    private  String nome;
    private  String cpf;
    private  String rg;
    private  String situacaoSexo;

    public Pessoa(String nome, String cpf, String rg, String situacaoSexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.situacaoSexo = situacaoSexo;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSituacaoSexo() {
        return situacaoSexo;
    }

    public void setSituacaoSexo(String situacaoSexo) {
        this.situacaoSexo = situacaoSexo;
    }  
    
}
