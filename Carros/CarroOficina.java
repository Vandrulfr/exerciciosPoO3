package Carros;

import java.math.BigDecimal;

public class CarroOficina {
    private String dono;
    private String modelo;
    private String placa;
    private String cor;
    private String marca;
    private String defeitos;
    private String reparosRealizados;
    private BigDecimal custoDosReparos;
    private boolean reparosCompletos;
    private boolean retirado;


    public CarroOficina() {
    }

    public CarroOficina(String dono, String modelo, String placa, String cor, String marca, String defeitos, String reparosRealizados, BigDecimal custoDosReparos, boolean reparosCompletos, boolean retirado) {
        this.dono = dono;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.defeitos = defeitos;
        this.reparosRealizados = reparosRealizados;
        this.custoDosReparos = custoDosReparos;
        this.reparosCompletos = reparosCompletos;
        this.retirado = retirado;
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

    public String getDefeitos() {
        return this.defeitos;
    }

    public void setDefeitos(String defeitos) {
        this.defeitos = defeitos;
    }

    public String getReparosRealizados() {
        return this.reparosRealizados;
    }

    public void setReparosRealizados(String reparosRealizados) {
        this.reparosRealizados = reparosRealizados;
    }

    public BigDecimal getCustoDosReparos() {
        return this.custoDosReparos;
    }

    public void setCustoDosReparos(BigDecimal custoDosReparos) {
        this.custoDosReparos = custoDosReparos;
    }

    public boolean isReparosCompletos() {
        return this.reparosCompletos;
    }

    public boolean getReparosCompletos() {
        return this.reparosCompletos;
    }

    public void setReparosCompletos(boolean reparosCompletos) {
        this.reparosCompletos = reparosCompletos;
    }

    public boolean isRetirado() {
        return this.retirado;
    }

    public boolean getRetirado() {
        return this.retirado;
    }

    public void setRetirado(boolean retirado) {
        this.retirado = retirado;
    }

    public CarroOficina dono(String dono) {
        this.dono = dono;
        return this;
    }

    public CarroOficina modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroOficina placa(String placa) {
        this.placa = placa;
        return this;
    }

    public CarroOficina cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroOficina marca(String marca) {
        this.marca = marca;
        return this;
    }

    public CarroOficina defeitos(String defeitos) {
        this.defeitos = defeitos;
        return this;
    }

    public CarroOficina reparosRealizados(String reparosRealizados) {
        this.reparosRealizados = reparosRealizados;
        return this;
    }

    public CarroOficina custoDosReparos(BigDecimal custoDosReparos) {
        this.custoDosReparos = custoDosReparos;
        return this;
    }

    public CarroOficina reparosCompletos(boolean reparosCompletos) {
        this.reparosCompletos = reparosCompletos;
        return this;
    }

    public CarroOficina retirado(boolean retirado) {
        this.retirado = retirado;
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
            ", defeitos='" + getDefeitos() + "'" +
            ", reparosRealizados='" + getReparosRealizados() + "'" +
            ", custoDosReparos='" + getCustoDosReparos() + "'" +
            ", reparosCompletos='" + isReparosCompletos() + "'" +
            ", retirado='" + isRetirado() + "'" +
            "}";
    }


}
