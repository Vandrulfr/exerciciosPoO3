package Carros;

import java.math.BigDecimal;

public class CarroRevendedora {

    private String modelo;
    private String placa;
    private String cor;
    private String marca;
    private BigDecimal preco;
    private boolean vendido;


    public CarroRevendedora() {
    }

    public CarroRevendedora(String modelo, String placa, String cor, String marca, BigDecimal preco, boolean vendido) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.vendido = vendido;
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

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPreco() {
        return this.preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isVendido() {
        return this.vendido;
    }

    public boolean getVendido() {
        return this.vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public CarroRevendedora modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroRevendedora placa(String placa) {
        this.placa = placa;
        return this;
    }

    public CarroRevendedora cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroRevendedora marca(String marca) {
        this.marca = marca;
        return this;
    }

    public CarroRevendedora preco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    public CarroRevendedora vendido(boolean vendido) {
        this.vendido = vendido;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " modelo='" + getModelo() + "'" +
            ", placa='" + getPlaca() + "'" +
            ", cor='" + getCor() + "'" +
            ", marca='" + getMarca() + "'" +
            ", preco='" + getPreco() + "'" +
            ", vendido='" + isVendido() + "'" +
            "}";
    }

}
