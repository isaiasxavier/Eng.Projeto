/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClasses;

/**
 *
 * @author PPW
 */
public class Contato {
    private String telefone_residencial;
    private String telefone_celular;
    private String email;
    private String telefone_comercial;

    public Contato(String telefone_residencial, String telefone_celular, String email, String telefone_comercial) {
        this.telefone_residencial = telefone_residencial;
        this.telefone_celular = telefone_celular;
        this.email = email;
        this.telefone_comercial = telefone_celular;
    }
    
    public Contato(String telefone_residencial, String telefone_celular, String email) {
        this.telefone_residencial = telefone_residencial;
        this.telefone_celular = telefone_celular;
        this.email = email;
    }

    public String getTelefone_comercial() {
        return telefone_comercial;
    }

    public void setTelefone_comercial(String telefone_comercial) {
        this.telefone_comercial = telefone_comercial;
    }
    
    public String getTelefone_residencial() {
        return telefone_residencial;
    }

    public void setTelefone_residencial(String telefone_residencial) {
        this.telefone_residencial = telefone_residencial;
    }

    public String getTelefone_celular() {
        return telefone_celular;
    }

    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
