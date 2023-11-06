package EjerciciosUD1;

/* Escribir un programa que lea un entero desde teclado, lo multiplique por 2, y a continuación
escriba el resultado en la pantalla */

import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Escribe un número: ");
        double numero = scanner.nextDouble();
        scanner.close();

        double calculo = numero * numero;

        System.out.println("El doble de "+numero+" es "+calculo);

    }
}
