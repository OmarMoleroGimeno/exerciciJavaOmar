package Prova;

import java.util.Scanner;
public class Actividad15 {
    private int codProducto;
    private String nombreProducto;
    private String descripcion;
    private String categoria;
    private double peso;
    private double precio;
    private int stock;

    //constructor por defecto
    public Actividad15(){

    }

    //constructor sin valor asignado
    public Actividad15(int codProducto, String nombreProducto, String descripcion, String categoria, double peso, double precio, int stock){
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.peso = peso;
        this.precio = precio;
        this.stock = stock;
    }

    //metodos para aumentar y disminuir el stock
    public void aumentaStock(int aumento){
        stock += aumento;
    }

    public void disminuyeStock(int disminuye){
        stock += disminuye;
    }

    //metodo para añadir el IVA al producto
    public void ivaProducto(int iva){
        precio = (precio + precio * iva);
    }

    public void mostarDatos(){
        System.out.println("Codigo: " + codProducto);
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoria: " + categoria);
        System.out.println("Peso: " + peso);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Codigo: ");
        int codProducto = escaner.nextInt();
        System.out.println("Nombre: " );
        String nombreProducto = escaner.nextLine();
        System.out.println("Descripción: " );
        String descripcion = escaner.nextLine();
        System.out.println("Categoria: ");
        String categoria = escaner.nextLine();
        System.out.println("Peso: ");
        double peso = escaner.nextDouble();
        System.out.println("Precio: ");
        double precio = escaner.nextDouble();
        System.out.println("Stock: ");
        int stock = escaner.nextInt();

        Actividad15 productoHardware = new Actividad15(codProducto, nombreProducto, descripcion, categoria, peso, precio, stock);
        System.out.println(productoHardware);




        escaner.close();
    }
}