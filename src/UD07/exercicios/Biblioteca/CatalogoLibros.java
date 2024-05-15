package UD07.exercicios.Biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class CatalogoLibros {

    private ArrayList<Libro> catalogo;

    public CatalogoLibros(Libro v[]){
        this.catalogo = new ArrayList<>();

        for (int i = 0; i < v.length; i++) {
            this.catalogo.add(v[i]);
        }
    }

    public String getCatalogo(){
        String str = String.format("%1$-90s\n", " ").replace(' ','-');
        str += String.format(" | %-28s%-30s%-28s |\n", "TÍTULO", "AUTOR", "ESTANTERIA");
        str += String.format("%90s\n", " ").replace(' ', '-');

        Iterator<Libro> it = this.catalogo.iterator();
        while (it.hasNext()) {
            str += it.next();
        }
        return str;
    }

    public String buscar(Libro l){
        if (catalogo.contains(l)) {
            return l.getEstanteria();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Libro[] listaLibros = new Libro[5];

        listaLibros[0] = new Libro(null, null, null);
        listaLibros[0] = new Libro(null, null, null);
        listaLibros[0] = new Libro(null, null, null);
        listaLibros[0] = new Libro(null, null, null);
        listaLibros[0] = new Libro(null, null, null);
    }
    
}