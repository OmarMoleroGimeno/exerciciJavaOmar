package UD07.actividades.actividad04;

public class Paciente implements Comparable<Paciente>{

    private String apellidos;
    private String nombre;
    private int edad;

    public Paciente(String apellidos, String nombre, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }



    @Override
    public int compareTo(Paciente o) {
        if (this.getApellidos().compareTo(o.getApellidos()) == 0) {
            return this.getNombre().compareTo(o.getNombre());
        } else {
            return this.getApellidos().compareTo(o.getApellidos());
        }
    }

    @Override
    public String toString() {
        return  String.format(" %-40s%-25s%-5d",
                                    this.getNombre(),
                                    this.getApellidos(),
                                    this.getEdad());
    }
    
}