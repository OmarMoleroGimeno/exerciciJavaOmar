package EjerciciosUD1;

/*(PenultimaCifra) Escribir un programa que muestre la penúltima cifra de un número entero que introduce
el usuario por teclado. */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Intrudueix un nombre enter: ");
        int numero = scanner.nextInt();
        int penultimaCifra;

        if (numero < 0) {
            
            numero = Math.abs(numero);
        }

        if (numero < 10) {
            
            penultimaCifra = -1;
        } else {
            
            int temp = numero / 10;
            penultimaCifra = temp % 10;
        }

        if (penultimaCifra != -1) {
            System.out.println("La penúltima xifra del nombre " + numero + " es " + penultimaCifra);
        } else {
            System.out.println("El nombre " + numero + " no té penúltima xifra, ja que és d'una sola xifra.");
        }

        scanner.close();
    }
}
