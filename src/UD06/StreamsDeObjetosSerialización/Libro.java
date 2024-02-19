package UD06.StreamsDeObjetosSerialización;

import java.io.Serializable;

public class Libro implements Serializable{
    String titulo;
    int añoEdicion;
    Autor autor;

    public Libro(String titulo, int añoEdicion, Autor autor) {
        this.titulo = titulo;
        this.añoEdicion = añoEdicion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return  "Título: " + getTitulo() +
                "\nAño de edición: " + getAñoEdicion() +
                "\nAutor: " + this.autor.toString();
    }
    
}
