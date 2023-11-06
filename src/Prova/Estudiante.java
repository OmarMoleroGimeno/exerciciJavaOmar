package Prova;

import java.util.Calendar;

public class Estudiante {
    int nia;
    String nombre;
    int edad;
    String telefono;
    Calendar inscripcion;

    // Constructor por defecto
    public Estudiante() {
        inscripcion = Calendar.getInstance();
    }

    // Constructor con nombre
    public Estudiante(String nombre) {
        this.nombre = nombre;
        inscripcion = Calendar.getInstance();
    }

    // Constructor con todos los campos
    public Estudiante(int nia, String nombre, int edad, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        inscripcion = Calendar.getInstance();
    }

    // Resto de los métodos de acceso y modificación de campos

    @Override
    public String toString() {
        String fechaInscripcion = this.inscripcion.get(Calendar.DAY_OF_MONTH) +
                "/" + (this.inscripcion.get(Calendar.MONTH) + 1) +
                "/" + this.inscripcion.get(Calendar.YEAR) +
                " " + this.inscripcion.get(Calendar.HOUR_OF_DAY) +
                ":" + this.inscripcion.get(Calendar.MINUTE) +
                ":" + this.inscripcion.get(Calendar.SECOND);

        return "************\n" +
                "Estudiante: " + this.nia +
                "\nInscripción: " + fechaInscripcion +
                "\nNombre: " + this.nombre +
                "\nEdad: " + this.edad +
                "\nTeléfono: " + this.telefono +
                "\n************\n";
    }

    public static void main(String[] args) {
        Estudiante estudiante01 = new Estudiante(123, "Omar Molero Gimeno", 18, "654556173");
        System.out.println(estudiante01.toString());
    }
}

