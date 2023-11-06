package Prova;
import java.util.Scanner;

public class provaActividad15 {
    //Atributos que pertenecen a Actividad 15
    private String codProducto;
    private String nombreProducto;
    private String descripcion;
    private String categoria;
    private int peso;
    private int precio;
    private int stock;

    public provaActividad15 (String codProducto, String nombreProducto, String descripcion, String categoria, int peso, int precio, int stock){
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.peso = peso;
        this.precio = precio;
        this.stock = stock;
    }

    public  void aumentaStock(int aumentoStock){
        this.stock += aumentoStock;
    }

    public void disminuyeStock(int disminuyeStock){
        this.stock -= disminuyeStock;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el código del producto: ");
        String codProducto = entrada.nextLine();

        System.out.print("Introduce el nombre del producto: ");
        String nombreProducto = entrada.nextLine();

        System.out.print("Introduce la descripción del producto: ");
        String descripcion = entrada.nextLine();

        System.out.print("Introduce la categoria del producto: ");
        String categoria = entrada.nextLine();

        System.out.print("Introduce el peso: ");
        int peso = entrada.nextInt();

        System.out.print("Introduce el precio: ");
        int precio = entrada.nextInt();
        
        System.out.print("Introduce stock: ");
        int stock = entrada.nextInt();

        System.out.print("Si quieres aumentar el stock presiona 1, si quieres disminuirlo presiona 2");
        int numero = entrada.nextInt();

        if (numero == 2) {
            System.out.println("Introduce la disminución de stock: ");
            int x = entrada.nextInt();
        } else if (numero == 1) {
            System.out.print("Introduce el aumento del stock: ");
        int x = entrada.nextInt();
        } else {
            System.out.println("Nos quieres ni disminuir ni aumentar el stock");
        }


        provaActividad15 actividad15 = new provaActividad15 (codProducto, nombreProducto, descripcion, categoria, peso, precio, stock);

        System.out.println("Información del producto:");
        System.out.println("Código: " + actividad15.codProducto);
        System.out.println("Nombre: " + actividad15.nombreProducto);
        System.out.println("Descripción: " + actividad15.descripcion);
        System.out.println("Categoría: " + actividad15.categoria);
        System.out.println("Peso: " + actividad15.peso);
        System.out.println("Precio: " + actividad15.precio);


        
        entrada.close();

    }
}
