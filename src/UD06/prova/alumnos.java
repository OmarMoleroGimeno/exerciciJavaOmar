package UD06.prova;

public class alumnos {
    private int nia;
    private String nombre;
    private String apellidos;
    private String curso;

    public alumnos(int nia, String nombre, String apellidos, String curso) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
    }
    
    public int getNia() {
        return nia;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCurso() {
        return curso;
    }
}
