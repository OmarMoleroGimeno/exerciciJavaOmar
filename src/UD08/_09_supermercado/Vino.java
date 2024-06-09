package UD08._09_supermercado;

import java.time.LocalDate;

public class Vino implements esAlimento, conDescuento{

    private String marca;
    private String tipoDeVino;
    private double gradosAlchol;
    private double precio;
    private LocalDate fechaCaducidad;
    private double precioDescuento;

    public Vino(String marca, String tipoDeVino, double gradosAlchol, double precio) {
        this.marca = marca;
        this.tipoDeVino = tipoDeVino;
        this.gradosAlchol = gradosAlchol;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeVino() {
        return tipoDeVino;
    }

    public void setTipoDeVino(String tipoDeVino) {
        this.tipoDeVino = tipoDeVino;
    }

    public double getGradosAlchol() {
        return gradosAlchol;
    }

    public void setGradosAlchol(double gradosAlchol) {
        this.gradosAlchol = gradosAlchol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescuento(double des) {
        this.precioDescuento = des;
    }

    @Override
    public double getDescuento() {
        return ((this.getPrecioDescuento()*100)/this.getPrecio());
    }

    @Override
    public double getPrecioDescuento() {
        return this.precioDescuento;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        return (int)(this.getGradosAlchol() * 10);
    }

    @Override
    public String toString() {
        return "Vino [marca=" + marca + ", tipoDeVino=" + tipoDeVino + ", gradosAlchol=" + gradosAlchol + ", precio="
                + precio + ", fechaCaducidad=" + fechaCaducidad + ", precioDescuento=" + precioDescuento + "]";
    }

}