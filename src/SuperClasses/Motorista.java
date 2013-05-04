
package SuperClasses;
/**
 * @author PPW
 */
public class Motorista extends Pessoa {
    
    private  String inss;
    private  String rntcr;
    private  String cnh;
    private  Endereco endereco;
    private  Contato contato;

    public Motorista(String inss, String rntcr, String cnh, Endereco endereco, Contato contato, String nome, String cpf, String rg, String situacaoSexo) {
        super(nome, cpf, rg, situacaoSexo);
        this.inss = inss;
        this.rntcr = rntcr;
        this.cnh = cnh;
        this.endereco = endereco;
        this.contato = contato;
    }

     
    

    public String getInss() {
        return inss;
    }

    public void setInss(String inss) {
        this.inss = inss;
    }

    public String getRntcr() {
        return rntcr;
    }

    public void setRntcr(String rntcr) {
        this.rntcr = rntcr;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
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
