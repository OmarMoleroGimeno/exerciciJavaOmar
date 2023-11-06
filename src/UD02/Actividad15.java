package UD02;
import java.util.Scanner;

class Actividad15 {
    private String codProducto;
    private String nombreProducto;
    private String descripcion;
    private String categoria;
    private double peso;
    private double precio;
    private int stock;

    public Actividad15(String codProducto, String nombreProducto, String descripcion, String categoria, double peso, double precio, int stock) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.peso = peso;
        this.precio = precio;
        this.stock = stock;
    }

    public void aumentaStock(int unidadesAumentar) {
        this.stock += unidadesAumentar;
    }

    public void disminuyeStock(int unidadesDisminuir) {
        this.stock -= unidadesDisminuir;
    }

    public double ivaProducto(double porcentajeIVA) {
        return (precio * porcentajeIVA) / 100;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codProducto);
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoria);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos para el productoHardware:");

        System.out.print("Código del producto: ");
        String codProductoHardware = scanner.nextLine();
        System.out.print("Nombre del producto: ");
        String nombreProductoHardware = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcionProductoHardware = scanner.nextLine();
        System.out.print("Categoría: ");
        String categoriaProductoHardware = scanner.nextLine();
        System.out.print("Peso (kg): ");
        double pesoProductoHardware = scanner.nextDouble();
        System.out.print("Precio: ");
        double precioProductoHardware = scanner.nextDouble();
        System.out.print("Stock: ");
        int stockProductoHardware = scanner.nextInt();

        Actividad15 productoHardware = new Actividad15(codProductoHardware, nombreProductoHardware, descripcionProductoHardware, categoriaProductoHardware, pesoProductoHardware, precioProductoHardware, stockProductoHardware);

        // Repite el mismo proceso para productoSoftware
        // ...

        System.out.println("Datos de productoHardware:");
        productoHardware.mostrarDatos();

        // Realiza las operaciones de aumento y disminución del stock
        productoHardware.aumentaStock(12);
        //productoSoftware.disminuyeStock(5); // Descomenta esto si tienes un productoSoftware

        double porcentajeIVA = 21.0; // Porcentaje de IVA (ejemplo: 21%)
        double ivaProductoHardware = productoHardware.ivaProducto(porcentajeIVA);
        //double ivaProductoSoftware = productoSoftware.ivaProducto(porcentajeIVA);

        System.out.println("\nCálculo del IVA (21%) para productoHardware: $" + ivaProductoHardware);
        //System.out.println("Cálculo del IVA (21%) para productoSoftware: $" + ivaProductoSoftware);

        System.out.println("\nPrecio final de productoHardware: $" + (productoHardware.precio + ivaProductoHardware));
        //System.out.println("Precio final de productoSoftware: $" + (productoSoftware.precio + ivaProductoSoftware));
        scanner.close();
    }
}

