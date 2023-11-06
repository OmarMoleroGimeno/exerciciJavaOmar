package EjerciciosUD1;

/*(Círculo) Escribir un programa que calcule la longitud de la circunferencia y el área del círculo para un
valor del radio introducido por teclado. */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del circulo: ");
        double radio = scanner.nextDouble();
        scanner.close();

        double area = Math.PI * Math.pow(radio, 2);
        double longitud = 2 *radio *Math.PI;
        System.out.println("La longitud del circulo es de: "+longitud);
        System.out.print("El area del circulo es de: "+area);
    }
}
