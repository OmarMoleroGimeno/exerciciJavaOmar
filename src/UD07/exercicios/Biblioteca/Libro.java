package UD07.exercicios.Biblioteca;

public class Libro implements Comparable<Libro>{
    
    private String Titulo;
    private String Autor;
    private String Estanteria;

    public Libro(String Titulo, String Autor, String Estanteria) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Estanteria = Estanteria;
    }
    
    public String getTitulo() {
        return Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public String getEstanteria() {
        return Estanteria;
    }

    @Override
    public int compareTo(Libro o) {
        if (this.getTitulo().compareTo(o.getTitulo()) == 0) {
            return this.getTitulo().compareTo(o.getTitulo());
        } else {
            return this.getTitulo().compareTo(o.getTitulo());
        }
        
    }

    @Override
    public String toString() {
        return  String.format(" %-28%-30s%", "")"Título: " + getTitulo() +
                " - Autor: " + getAutor() +
                " - Estantería: " + getEstanteria();
    }

}