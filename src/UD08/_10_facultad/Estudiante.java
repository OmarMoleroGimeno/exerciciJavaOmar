package UD08._10_facultad;

public class Estudiante extends Persona{

    private String curso;

    public Estudiante(String nombre, String apellidos, int id, String estadoCivil, String curso) {
        super(nombre, apellidos, id, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void matriculaNuevoCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante" +
                super.toString() +
                " curso=" + curso;
    }

    
}