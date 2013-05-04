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
public class Veiculo {

    private  String  nomeMotorista;
    private  Integer cod_motorista;
    private  String  veiculo;
    private  String  carreta;
    private  String  marca;
    private  String  modelo;
    private  String  placaCavalo;
    private  String  placaCarreta;
    private  String  ano;
    private  Date    dataCadastro;
    private  String  cor;

    public Veiculo() {
    }
 
    public Veiculo(Integer cod_motorista, String nomeMotorista, String veiculo, String carreta, String marca, String modelo, String placaCavalo, String placaCarreta, String ano, Date dataCadastro) {
        this.cod_motorista = cod_motorista;
        this.nomeMotorista = nomeMotorista;
        this.veiculo = veiculo;
        this.carreta = carreta;
        this.marca = marca;
        this.modelo = modelo;
        this.placaCavalo = placaCavalo;
        this.placaCarreta = placaCarreta;
        this.ano = ano;
        this.dataCadastro = dataCadastro;
    }
    
    public Veiculo(String nomeMotorista, Integer cod_motorista, String marca, String modelo, String placaCavalo, String placaCarreta, String ano, String cor, String veiculoo, String carreta) {
        this.nomeMotorista = nomeMotorista;
        this.cod_motorista = cod_motorista;
        this.marca = marca;
        this.modelo = modelo;
        this.placaCavalo = placaCavalo;
        this.placaCarreta = placaCarreta;
        this.ano = ano;
        this.cor = cor;
        this.veiculo = veiculoo;
        this.carreta = carreta;
        
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public Integer getCod_motorista() {
        return cod_motorista;
    }

    public void setCod_motorista(Integer cod_motorista) {
        this.cod_motorista = cod_motorista;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getCarreta() {
        return carreta;
    }

    public void setCarreta(String carreta) {
        this.carreta = carreta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacaCavalo() {
        return placaCavalo;
    }

    public void setPlacaCavalo(String placaCavalo) {
        this.placaCavalo = placaCavalo;
    }

    public String getPlacaCarreta() {
        return placaCarreta;
    }

    public void setPlacaCarreta(String placaCarreta) {
        this.placaCarreta = placaCarreta;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
