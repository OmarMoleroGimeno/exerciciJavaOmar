package UD06.StreamsDeObjetosSerialización;

import java.io.Serializable;

public class Autor implements Serializable{
    private String nombre;
    private int añoNacimiento;
    private String nacionalidad;

    public Autor(String nombre, int añoNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() + " - " +
                "Año de nacimiento: " + getAñoNacimiento() + " - " +
                "Nacionalidad: " + getNacionalidad();
    }
}