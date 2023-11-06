package EjerciciosUD1;

/*7. (Superficie) Escribir un programa que solicite al usuario la longitud y la anchura de una habitación y a
continuación muestre su superficie (longitud por anchura). */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce la longitud de la habitación: ");
        double longitud = scanner.nextDouble();
        System.out.print("Introduce la anchura de la habitación: ");
        double anchura = scanner.nextDouble();
        scanner.close();

        double calculo = anchura * longitud;
        System.out.println("La superficie de la habitación es: "+calculo);
    }
}