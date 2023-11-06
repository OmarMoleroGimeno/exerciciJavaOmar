package EjerciciosUD1;

/*. La famosa ecuación de Einstein para la conversión de una masa m en energía viene dada por la fórmula
E=mc2, donde c es la velocidad de la luz que vale 2.997925 · 108 m/s. Escribir un programa que lea el valor
de la masa y obtenga la energía correspondiente según la anterior fórmula.*/

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la massa en kg: ");
        double massa = scanner.nextDouble();
        scanner.close();

        double operation = massa *2.997935 *Math.pow(10, 8);

        System.out.println("E= "+operation);
    }
}
