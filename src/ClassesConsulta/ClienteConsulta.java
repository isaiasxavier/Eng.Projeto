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
public class ClienteConsulta {
    private  Integer cod;
    private  String nome;
    private  String cpf;
    private  String rg;
    private  String sexo;
    private  String endereco;
    private  String numero;
    private  String cidade;
    private  String bairro;
    private  String cep;
    private  String residencial;
    private  String celular;
    private  String email;
    private  String uf;
    private  Date data;
    private  String cnpj;
    private  String telefone_comercial;

    public ClienteConsulta(Integer cod, String nome, String sexo, String cpf, String rg, String cidade, String uf, String celular, Date data) {
        this.cod = cod;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.cidade = cidade;
        this.uf = uf;
        this.celular = celular;
        this.data = data;
    }

    public ClienteConsulta(Integer cod, String nome, String cnpj, String cidade, String uf, String telefone_comercial, Date data) {
        this.cod = cod;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone_comercial = telefone_comercial;
        this.data = data;
    }

    public String getTelefone_comercial() {
        return telefone_comercial;
    }

    public void setTelefone_comercial(String telefone_comercial) {
        this.telefone_comercial = telefone_comercial;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getResidencial() {
        return residencial;
    }

    public void setTelefone_residencial(String residencial) {
        this.residencial = residencial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    

}
