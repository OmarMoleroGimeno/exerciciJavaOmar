package UD08._10_facultad;

public class Profesor extends Persona{

    private String departamento;

    public Profesor(String nombre, String apellidos, int id, String estadoCivil, String departamento) {
        super(nombre, apellidos, id, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void cambioDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor:\n" +
        super.toString() +
        " departamento=" + departamento;
    }

    
}