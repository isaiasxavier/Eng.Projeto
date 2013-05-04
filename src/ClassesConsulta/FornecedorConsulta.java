/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesConsulta;

import java.util.Date;

/**
 *
 * @author PPW
 */
public class FornecedorConsulta {
    private Integer cod;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefoneComercial;
    private String cidade;
    private String bairro;
    private Date data;

    public FornecedorConsulta(Integer cod, String nome, String cnpj, String endereco, String telefoneComercial, String cidade, String bairro, Date data) {
        this.cod = cod;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefoneComercial = telefoneComercial;
        this.cidade = cidade;
        this.bairro = bairro;
        this.data = data;
    }

    
    
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
