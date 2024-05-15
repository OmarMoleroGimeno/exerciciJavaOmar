package UD07.prova;

import java.util.Comparator;

public class Estudiante {
    private int id;
    private String nombre;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }
    
    static class IdComparatot implements Comparator<Estudiante>{
        public int compare (Estudiante e1, Estudiante e2){
            return e2.getId() - e1.getId();
        }
    }

    static class NombreComparatot implements Comparator<Estudiante>{
        public int compare (Estudiante e1, Estudiante e2){
            return e2.getNombre().compareTo(e2.getNombre());
        }
    }

    @Override
    public String toString() {
        return String.format("id:%5d | nombre:%-50s\n", this.getId(), this.getNombre());
    }
}
