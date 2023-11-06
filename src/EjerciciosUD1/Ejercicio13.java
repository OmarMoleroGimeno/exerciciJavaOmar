package EjerciciosUD1;

/*(UltimaCifra) Escribir un programa que muestre la última cifra de un número entero que introduce el
usuario por teclado. Pista: ¿Qué devuelve a%10 ? */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cifra deseada: ");
        double cifra = scanner.nextDouble();
        scanner.close();
        double ultimaCifra = cifra % 10;

        System.out.println("La última cifra del número " + cifra + " es " + ultimaCifra);
        
    }
}
