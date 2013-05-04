/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesConsulta;

import java.sql.Date;

/**
 *
 * @author PPW
 */
public class MotoristaConsulta {
    private Integer cod;
    private String nome;
    private String sexo;
    private String cpf;
    private String rg;
    private String Cnh;
    private String rntcr;
    private String cidade;
    private String Uf;
    private String celular;
    private Date data;
    private Double salario;
    
    //construtor para CADASTRO MOTORISTA TELA PRINCIPAL
    public MotoristaConsulta(Integer cod, String nome, String sexo, String cpf, String rg, String Cnh, String rntcr, String cidade, String Uf, String celular, Date data) {
        this.cod = cod;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.Cnh = Cnh;
        this.rntcr = rntcr;
        this.cidade = cidade;
        this.Uf = Uf;
        this.celular = celular;
        this.data = data;
    }
    
    //construtor para CADASTRO MOTORISTA TELA ALTERAR
    public MotoristaConsulta(Integer cod, String nome, String cpf, String rg, String Cnh, String rntcr, String cidade, String Uf, String celular, Date data) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.Cnh = Cnh;
        this.rntcr = rntcr;
        this.cidade = cidade;
        this.Uf = Uf;
        this.celular = celular;
        this.data = data;
    }
    
    //construtor para tela salarioMotoristaProprio

    public MotoristaConsulta(Integer cod, String nome, Double salario) {
        this.cod = cod;
        this.nome = nome;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getCnh() {
        return Cnh;
    }

    public void setCnh(String Cnh) {
        this.Cnh = Cnh;
    }

    public String getRntcr() {
        return rntcr;
    }

    public void setRntcr(String rntcr) {
        this.rntcr = rntcr;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
