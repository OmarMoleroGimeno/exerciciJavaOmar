package UD08._09_supermercado;

import java.time.LocalDate;

public class Cereales implements esAlimento{

    private String marca;
    private double precio;
    private String tipoDeCereal;
    private LocalDate fechaCaducidad;
    
    public Cereales(String marca, double precio, String tipoDeCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoDeCereal = tipoDeCereal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoDeCereal() {
        return tipoDeCereal;
    }

    public void setTipoDeCereal(String tipoDeCereal) {
        this.tipoDeCereal = tipoDeCereal;
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
        int calorias = 0;
        switch (this.getTipoDeCereal().toLowerCase()) {
            case "espelta":
                calorias = 5;
            break;

            case "maíz":
                calorias = 8;
            break;

            case "trigo":
                calorias = 12;
            break;

            default:
                calorias = 15;
            break;
        }
        return calorias;
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + this.getMarca() + "'" +
            ", precio='" + this.getPrecio() + "'" +
            ", tipoDeCereal='" + this.getTipoDeCereal() + "'" +
            ", fechaCaducidad='" + this.getCaducidad() + "'" +
            "}";
    }

}