/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClasses;

/**
 *
 * @author PPW
 */
public class Salario {
    private Integer cod_func;
    private Integer cod_dept;
    private String nome;
    private Double salario;
    private String nome_cargo;
    private String nome_departamento;

    public Salario(Integer cod_func, Double salario) {
        this.cod_func = cod_func;
        this.salario = salario;
    }

    
    
    public Salario(Integer cod_func, Integer cod_dept, Double salario) {
        this.cod_func = cod_func;
        this.cod_dept = cod_dept;
        this.salario = salario;     
    } 

    public Salario(String nome, Double salario, String nome_cargo, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.nome_cargo = nome_cargo;
        this.nome_departamento = departamento;
    }
    

    public Integer getCod_dept() {
        return cod_dept;
    }

    public void setCod_dept(Integer cod_dept) {
        this.cod_dept = cod_dept;
    }
    
    public Integer getCod_func() {
        return cod_func;
    }

    public void setCod_func(Integer cod_func) {
        this.cod_func = cod_func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome_cargo() {
        return nome_cargo;
    }

    public void setNome_cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }

    public String getNome_departamento() {
        return nome_departamento;
    }

    public void setNome_departamento(String nome_departamento) {
        this.nome_departamento = nome_departamento;
    }
    
    
    
    
}
