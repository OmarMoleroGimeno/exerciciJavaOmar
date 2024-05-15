package Taller;

import java.io.Serializable;
import java.time.LocalDate;

public class Herramienta implements Serializable{
    private String nombre;
    private double precio;
    private LocalDate fechaPrestamo;
    
    public Herramienta(String nombre, double precio, LocalDate fechaPrestamo) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaPrestamo = null;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public boolean getPrestamoCaducado(){
        LocalDate fechaActual = LocalDate.now();
        boolean caducado = false;

        if (fechaActual.compareTo(this.fechaPrestamo) > 15) {
            caducado = true;
        }

        return caducado;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\nPrecio: " + this.getPrecio() + "\nFecha Préstamo: " +this.getFechaPrestamo();
    }



}
