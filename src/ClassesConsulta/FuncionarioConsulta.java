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
public class FuncionarioConsulta {
    private Integer cod;
    private Integer codDepartamento;
    private String nome;
    private String cpf;
    private String rg; 
    private String sexo;
    private String departamento;
    private String cargo;       
    private String nascimento;
    private String endereco;
    private String numero;
    private String cidade;
    private String bairro;
    private String cep;
    private String residencial;
    private String celular;
    private String email;
    private String uf;
    private Double salario;
    private Date data;
    private Integer cod_dept;

    public FuncionarioConsulta(Integer cod, String nome, Double salario) {
        this.cod = cod;
        this.nome = nome;
        this.salario = salario;
    }
    
    public FuncionarioConsulta(Integer cod, String nome, String cpf, String rg, String departamento, Integer codDepartamento, String cargo, String celular, Date data) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.departamento = departamento;
        this.codDepartamento = codDepartamento;
        this.cargo = cargo;
        this.celular = celular;
        this.data = data;
    }
    
    //construtor salario

    public FuncionarioConsulta(Integer cod, String nome, Double salario, String departamento, Integer cod_dept, String cargo) {
        this.cod = cod;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
        this.codDepartamento = cod_dept;
        this.cargo = cargo;
        
    }
    

    public Integer getCod_dept() {
        return cod_dept;
    }

    public void setCod_dept(Integer cod_dept) {
        this.cod_dept = cod_dept;
    }
    
    
    public Integer getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(Integer codDepartamento) {
        this.codDepartamento = codDepartamento;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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

    public void setResidencial(String residencial) {
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
    
     
    
    
}
