package Carros;

import java.math.BigDecimal;

public class CarroDetran {
    private String dono;
    private String modelo;
    private String placa;
    private String cor;
    private String marca;
    private String multas;
    private BigDecimal valorMultas;
    private boolean ipvaPago;
    private BigDecimal valorIpva;


    public CarroDetran() {
    }

    public CarroDetran(String dono, String modelo, String placa, String cor, String marca, String multas, BigDecimal valorMultas, boolean ipvaPago, BigDecimal valorIpva) {
        this.dono = dono;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.multas = multas;
        this.valorMultas = valorMultas;
        this.ipvaPago = ipvaPago;
        this.valorIpva = valorIpva;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
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

    public String getMultas() {
        return this.multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    public BigDecimal getValorMultas() {
        return this.valorMultas;
    }

    public void setValorMultas(BigDecimal valorMultas) {
        this.valorMultas = valorMultas;
    }

    public boolean isIpvaPago() {
        return this.ipvaPago;
    }

    public boolean getIpvaPago() {
        return this.ipvaPago;
    }

    public void setIpvaPago(boolean ipvaPago) {
        this.ipvaPago = ipvaPago;
    }

    public BigDecimal getValorIpva() {
        return this.valorIpva;
    }

    public void setValorIpva(BigDecimal valorIpva) {
        this.valorIpva = valorIpva;
    }

    public CarroDetran dono(String dono) {
        this.dono = dono;
        return this;
    }

    public CarroDetran modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroDetran placa(String placa) {
        this.placa = placa;
        return this;
    }

    public CarroDetran cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroDetran marca(String marca) {
        this.marca = marca;
        return this;
    }

    public CarroDetran multas(String multas) {
        this.multas = multas;
        return this;
    }

    public CarroDetran valorMultas(BigDecimal valorMultas) {
        this.valorMultas = valorMultas;
        return this;
    }

    public CarroDetran ipvaPago(boolean ipvaPago) {
        this.ipvaPago = ipvaPago;
        return this;
    }

    public CarroDetran valorIpva(BigDecimal valorIpva) {
        this.valorIpva = valorIpva;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " dono='" + getDono() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", placa='" + getPlaca() + "'" +
            ", cor='" + getCor() + "'" +
            ", marca='" + getMarca() + "'" +
            ", multas='" + getMultas() + "'" +
            ", valorMultas='" + getValorMultas() + "'" +
            ", ipvaPago='" + isIpvaPago() + "'" +
            ", valorIpva='" + getValorIpva() + "'" +
            "}";
    }

}
