package UD02;

import java.util.Scanner;

public class Activdad18 {
    String titulo;
    String autor;
    String editorial;
    int numeroDeEjemplaresTotales;
    int numeroDePrestados;
    int numeroPerdidos;
    int prestamo;
    int numeroDevoluciones;


    public Activdad18() {
    }


    public Activdad18(String titulo, String autor, String editorial, int numeroDeEjemplaresTotales, int numeroDePrestados, int numeroPerdidos, int prestamo, int numeroDevoluciones) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numeroDeEjemplaresTotales = numeroDeEjemplaresTotales;
        this.numeroDePrestados = numeroDePrestados;
        this.numeroPerdidos = numeroPerdidos;
        this.prestamo = prestamo;
        this.numeroDevoluciones = numeroDevoluciones;
    }

    public int getnumeroPerdidos() {
        return this.numeroPerdidos;
    }

    public void setnumeroPerdidos(int numeroPerdidos){
        this.numeroPerdidos = numeroPerdidos;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNuneroDeEjemplaresTotales() {
        return this.numeroDeEjemplaresTotales;
    }

    public void setNuneroDeEjemplaresTotales(int nuneroDeEjemplaresTotales) {
        this.numeroDeEjemplaresTotales = nuneroDeEjemplaresTotales;
    }

    public int getNuneroDePrestados() {
        return this.numeroDePrestados;
    }

    public void setNuneroDePrestados(int nuneroDePrestados) {
        this.numeroDePrestados = nuneroDePrestados;
    }

    public String prestamo(){

        if (numeroDeEjemplaresTotales > 0 && prestamo < numeroDeEjemplaresTotales) {
            numeroDeEjemplaresTotales -= prestamo;
            System.out.println("Prestamo realizada correctamente.");
        } else {
            System.out.println("No quedan ejemplares de este libro.");
        }
        return " ";
    }

    public String devolucion(){
        if (numeroDePrestados > 0 && numeroDePrestados < numeroDevoluciones) {
            numeroDePrestados -= numeroDevoluciones;
            System.out.println("Devolucion realizada correctamente.");
        } else {
            System.out.println("No puedes devolverlo, estamos llenos.");
        }
        return " ";
    }

    public String perdido(){
        if (numeroDeEjemplaresTotales > 0) {
            numeroPerdidos --;
            System.out.println("Opración realizada correctamente.");
        } else {
            System.out.println("Este libro no de ha perdido aqui.");
        }
        return " ";
    }

    @Override
    public String toString(){
        return  "\n---------------"+
                "\nTitulo: "+ getTitulo()+
                "\nAutor: " + getAutor() +
                "\nEditorial: "+getEditorial()+
                "\nStock: "+getNuneroDeEjemplaresTotales()+
                "\nEn prestamo: "+getNuneroDePrestados()+
                "\nPerdidos: "+getnumeroPerdidos()+
                "\n---------------";
    }


    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce el título del libro: ");
        String titulo = tec.nextLine();
        System.out.print("Introduce el autor del libro: ");
        String autor = tec.nextLine();
        System.out.print("Introduce la editorial del libro: ");
        String editorial = tec.nextLine();
        System.out.print("Cuantos libros quieres cojer? ");
        int prestamo = tec.nextInt();
        System.out.print("Cuantos libros quieres devolver? ");
        int numeroDevoluciones = tec.nextInt();
        tec.close();

        Activdad18 libroInformatica1 = new Activdad18(titulo, autor, editorial, 30, prestamo, 3, prestamo, numeroDevoluciones);
        System.out.println(libroInformatica1.toString());
        System.out.println("---------------");
        System.out.println(libroInformatica1.prestamo());
        System.out.println(libroInformatica1.devolucion());
        System.out.println(libroInformatica1.perdido());
        System.out.println("---------------");
        
        

    }
}
