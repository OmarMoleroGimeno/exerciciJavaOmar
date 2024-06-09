package UD08._10_facultad;

public class Empleado extends Persona{

    private int año;
    private int numDespacho;

    public Empleado(String nombre, String apellidos, int id, String estadoCivil, int año, int numDespacho) {
        super(nombre, apellidos, id, estadoCivil);
        this.año = año;
        this.numDespacho = numDespacho;
    }

    public int getAño() {
        return año;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void reasignarDespacho(int nuevoDespacho) {
        this.numDespacho = nuevoDespacho;
    }

    @Override
    public String toString() {
        return "Empleado:\n" +
                super.toString() +
                "año=" + año + ", numDespacho=" + numDespacho;
    }


}
