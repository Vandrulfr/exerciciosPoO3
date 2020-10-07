package Carros;

import java.math.BigDecimal;

/**
 * carros
 */
public class CarroLocadora {

    private String locador; //Idealmente locador teria sua própria classe, mas isso sairia do escopo
    private String modelo;
    private String placa;
    private String marca;
    private String cor;
    private BigDecimal diaria;
    private double quilometragem;
    private boolean alugado;


    public CarroLocadora() {
    }

    public CarroLocadora(String locador, String modelo, String placa, String marca, String cor, BigDecimal diaria, double quilometragem, boolean alugado) {
        this.locador = locador;
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.diaria = diaria;
        this.quilometragem = quilometragem;
        this.alugado = alugado;
    }

    public String getLocador() {
        return this.locador;
    }

    public void setLocador(String locador) {
        this.locador = locador;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getDiaria() {
        return this.diaria;
    }

    public void setDiaria(BigDecimal diaria) {
        this.diaria = diaria;
    }

    public double getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isAlugado() {
        return this.alugado;
    }

    public boolean getAlugado() {
        return this.alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public CarroLocadora locador(String locador) {
        this.locador = locador;
        return this;
    }

    public CarroLocadora modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroLocadora placa(String placa) {
        this.placa = placa;
        return this;
    }

    public CarroLocadora marca(String marca) {
        this.marca = marca;
        return this;
    }

    public CarroLocadora cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroLocadora diaria(BigDecimal diaria) {
        this.diaria = diaria;
        return this;
    }

    public CarroLocadora quilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
        return this;
    }

    public CarroLocadora alugado(boolean alugado) {
        this.alugado = alugado;
        return this;
    }
    
    @Override
    public String toString() {
        return "{" +
            " locador='" + getLocador() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", placa='" + getPlaca() + "'" +
            ", marca='" + getMarca() + "'" +
            ", cor='" + getCor() + "'" +
            ", diaria='" + getDiaria() + "'" +
            ", quilometragem='" + getQuilometragem() + "'" +
            ", alugado='" + isAlugado() + "'" +
            "}";
    }

}