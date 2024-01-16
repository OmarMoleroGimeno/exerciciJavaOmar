package UD05.reservasLibreria;

import java.util.Objects;

public class Reserva {
    private String Nif;
    private String Nombre;
    private String Teléfono;
    private int Código;
    private int ejemplares;


    public Reserva(String Nif, String Nombre, String Teléfono, int Código, int ejemplares) {
        this.Nif = Nif;
        this.Nombre = Nombre;
        this.Teléfono = Teléfono;
        this.Código = Código;
        this.ejemplares = ejemplares;
    }

    public Reserva(String nif, String nombre, String tel, int codigo){
        this.Nif = nif;
        this.Nombre = nombre;
        this.Teléfono = tel;
        this.Código = codigo;
    }


    public String getNif() {
        return this.Nif;
    }

    public void setNif(String Nif) {
        this.Nif = Nif;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTeléfono() {
        return this.Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public int getCódigo() {
        return this.Código;
    }

    public void setCódigo(int Código) {
        this.Código = Código;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }



    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return
                "\nNombre: \t\t" + getNombre()+
                "\nNif: \t" + getNif()+
                "\nTeléfono: \t" + getTeléfono()+
                "\nCódigo: \t" + getCódigo()+
                "\nEjemplares: \t" + getEjemplares()
        ;
    }

    public boolean equals(Object o){
        //Controlamos si los dos son iguales, si es nulo o si son de diferente classe
        if (this == o) {
            return true;
        } else if(o == null){
            return false;
        } else if(this.getClass() != o.getClass()){
            return false;
        }
        final Reserva other = (Reserva) o;
        return Objects.equals(this.Código, other.Código) && (this.Nif == other.Nif);
    }

    public int compareTo(Object o){
        Reserva other = (Reserva)o;
        return Integer.compare(this.Código, other.Código);
    }
}
