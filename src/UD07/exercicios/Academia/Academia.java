package UD07.exercicios.Academia;

import java.util.HashSet;

public class Academia {
    private String nombre;
    private String direccion;
    private int numAulas;
    private HashSet<Aula> academia;

    public Academia(String nombre, String direccion, int numAulas, HashSet<Aula> academia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numAulas = numAulas;
        this.academia = academia;
    }

    public void ampliar (Aula a){
        academia.add(a);
    }

    public void quitar(Aula a){
        academia.remove(a);
    }

    public int getNumAulas(){
        return academia.size();
    }

    @Override
    public String toString() {
        String str = "****** Aulas ******";
        for (Aula aula : academia) {
            str += "\n" + aula;
        }
        return str;
    }
}