package EjerciciosUD1;

/* (Redondear1) Math.round(x) redondea x de manera que este queda sin decimales.
( Math.round(35.5289) da como resultado 36 )
Trata de escribir un programa en el que el usuario introduzca un número real y a continuación se muestre
redondeado a un decimal. Pista : combinar productos, divisiones y Math.round() */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número real: ");
        double decimal = scanner.nextDouble();
        scanner.close();

        double operation = Math.round(decimal);
        System.out.println("El número " +decimal+ ", redondeado a un decimal es "+operation);
    }
}
