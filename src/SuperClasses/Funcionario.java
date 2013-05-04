/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClasses;

/**
 *
 * @author PPW
 */
public class Funcionario extends Pessoa{
    private Integer cod;
    private String departamento;
    private String cargo;
    private String dataNascimento;
    private Endereco endereco;
    private Contato contato;
    
    public Funcionario(String departamento, Integer codDepartamento, String cargo, Endereco endereco, Contato contato, String nome, String cpf, String rg, String situacaoSexo) {
        super(nome, cpf, rg, situacaoSexo);
        this.departamento = departamento;
        this.cod = codDepartamento;
        this.cargo = cargo;
        this.endereco = endereco;
        this.contato = contato;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
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
