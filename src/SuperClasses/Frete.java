package SuperClasses;


public class Frete {
    private Integer codMotorista;
    private Integer codClienteJuridico;
    private String  cepRemetente;
    private String  cepDestinatario;
    private Endereco endereco;
    private Contato contato;
    private String peso;
    private Double valor;

    public Frete(Integer codMotorista, Integer codClienteJuridico, String cepRemetente, String cepDestinatario, Endereco endereco, Contato contato, String peso, Double valor) {
        this.codMotorista = codMotorista;
        this.codClienteJuridico = codClienteJuridico;
        this.cepRemetente = cepRemetente;
        this.cepDestinatario = cepDestinatario;
        this.endereco = endereco;
        this.contato = contato;
        this.peso = peso;
        this.valor = valor;
    }

    
    
    public Integer getCodMotorista() {
        return codMotorista;
    }

    public void setCodMotorista(Integer codMotorista) {
        this.codMotorista = codMotorista;
    }

    public Integer getCodClienteJuridico() {
        return codClienteJuridico;
    }

    public void setCodClienteJuridico(Integer codClienteJuridico) {
        this.codClienteJuridico = codClienteJuridico;
    }

    public String getCepRemetente() {
        return cepRemetente;
    }

    public void setCepRemetente(String cepRemetente) {
        this.cepRemetente = cepRemetente;
    }

    public String getCepDestinatario() {
        return cepDestinatario;
    }

    public void setCepDestinatario(String cepDestinatario) {
        this.cepDestinatario = cepDestinatario;
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    } 
    
}
