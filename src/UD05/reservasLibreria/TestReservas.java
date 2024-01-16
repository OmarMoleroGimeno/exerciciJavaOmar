package UD05.reservasLibreria;

import java.util.Scanner;

public class TestReservas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("***** RESERVA 1 *****");
        System.out.print("Introduzca el Nif: ");
        String Nif = entrada.next();
        System.out.print("Introduzca el nombre: ");
        String nombre = entrada.next();
        System.out.print("Introduzca el nº de teléfono: ");
        String telefono = entrada.next();
        System.out.print("Introduzca el código del libro: ");
        int código = entrada.nextInt();
        Reserva r1 = new Reserva(Nif, nombre, telefono, código);
        System.out.println();

        

        boolean encontrado = false;
        do {
            System.out.println("***** RESERVA 2 *****");
            System.out.print("Introduzca el Nif: ");
            Nif = entrada.next();
            System.out.print("Introduzca el nombre: ");
            nombre = entrada.next();
            System.out.print("Introduzca el nº de teléfono: ");
            telefono = entrada.next();
            System.out.print("Introduzca el código del libro: ");
            código = entrada.nextInt();
            Reserva r2 = new Reserva(Nif, nombre, telefono, código);
            System.out.println();

            if (r1.equals(r2)) {
                System.out.println("\nLas reservas no pueden ser iguales.\nVuelve a introducir la reserva");
                entrada.nextLine();
            } else {
                encontrado = true;
            }
        } while (encontrado!=true);

        System.out.println("+--------------------+");
        System.out.println("| Estado actual");

        entrada.close();
    }
}
