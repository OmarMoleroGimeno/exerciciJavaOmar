package UD05.contrareloj;

import java.util.Scanner;

import UD05.contrareloj.Corredor.IllegalArgumentException;
import UD05.contrareloj.ListaCorredores.ElementoDuplicadoException;
import UD05.contrareloj.ListaCorredores.ListaLlenaException;

public class ContraReloj {

    static ListaCorredores hanSalido = new ListaCorredores();
    static ListaCorredores hanLlegado = new ListaCorredores();
    static Scanner teclado = new Scanner(System.in);
    public static String menu() {
        String resultado = "";
        resultado += "**********************************\n";
        resultado += "*     C O N T R A R R E L O J    *\n";
        resultado += "**********************************\n";
        resultado += "* 1) Salida                      *\n";
        resultado += "* 2) Llegada                     *\n";
        resultado += "* 3) Clasificación               *\n";
        resultado += "* 4) Han salido                  *\n";
        resultado += "* 5) Salir                       *\n";
        resultado += "**********************************\n";
        resultado += "Elige una opción (1-5): ";
        return resultado;
    }

    public static void menuSalida() {

        System.out.println("REGISTRO DE SALIDA:");
        System.out.print("Introduzca el nombre del corredor: ");
        String nombre = teclado.next();
        try {
            hanSalido.anyadir(new Corredor(nombre));
        } catch (ElementoDuplicadoException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void menuLlegada() {
        // Scanner teclado = new Scanner(System.in);
        System.out.println("REGISTRO DE LLEGADA:");
        System.out.print("Introduzca el dorsal del corredor: ");
        int dorsal = teclado.nextInt();
        System.out.printf(
                "Introduzca el tiempo de llegada para el dorsal %d en segundos: ",
                dorsal);
        double tiempo = teclado.nextDouble();
        try {
            Corredor c = hanSalido.quitar(dorsal);
            try {
                c.setTiempo(tiempo);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: "+ e.getMessage());
            }
            try {
                hanLlegado.insertarOrdenado(c);
            } catch (ListaLlenaException e) {
                System.out.println("ERROR: "+ e.getMessage());
            }
        } catch (ListaCorredores.ElementoNoEncontradoException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.print(menu());
        while ((opcion = teclado.nextInt()) != 5) {
            switch (opcion) {
                case 1:
                    menuSalida();
                    break;
                case 2:
                    menuLlegada();
                    break;
                case 3:
                    System.out.println(hanLlegado.toString());
                    break;
                case 4:
                    System.out.println("Corredores que no han llegado:");
                    System.out.println(hanSalido.toString());
                    break;
                default:
                    System.out.println("\nOpción incorrecta, inténtelo de nuevo");
            }
            System.out.print(menu());
        }
        System.out.println("Ha seleccionado Salir, que pase buen dia!");
    }
}
