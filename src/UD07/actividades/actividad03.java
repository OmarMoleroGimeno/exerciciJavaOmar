package UD07.actividades;

import java.util.ArrayList;

public class actividad03 {

    private int cantidad;
    private double precio;
    private String nombre;
    

    private static int contador;

    public actividad03() {
        this.cantidad = (int) ((Math.random()*101));
        this.precio = (double)((int)((Math.random()*20000) + 1))/100;
        this.nombre = "producto " + contador++;
    }

    public int getCantidad() {
        return cantidad;
    }



    public double getPrecio() {
        return precio;
    }



    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {

        return String.format("producto: %-12s %3d %5.2f$",
                            this.getNombre(), this.getCantidad(),
                            this.getPrecio());
    }

    public static void main(String[] args) {
        ArrayList<actividad03> listaProductos = new ArrayList<>();
        double total = 0;
        int numProductos = (int)(Math.random()*11) + 1;

        for (int i = 0; i < numProductos; i++) {
            listaProductos.add(new actividad03());
        }

        System.out.println("\n****** TICKET ******");
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i));
            total += ((listaProductos.get(i).getPrecio())* listaProductos.get(i).getCantidad());
        }
        System.out.println("---------------------------------");
        System.out.printf("%25s %7.2f\n", "total:", total);

    }
}
