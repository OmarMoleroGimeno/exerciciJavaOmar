package EjerciciosUD1;

/*(Fuerza) La fuerza de atracción entre dos masas m1 y m2
separadas por una distancia d, está dada por la fórmula:*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la primera masa en kg: ");
        double m1 = scanner.nextDouble();
        System.out.print("Introduce la segunda masa en kg: ");
        double m2 = scanner.nextDouble();
        System.out.print("Introduce la distáncia en metros entre las dos masas: ");
        double d = scanner.nextDouble();
        scanner.close();

        double constanteGravitación = 6.693 *Math.pow(10, -11);
        double operation = (constanteGravitación *m1 *m2)/Math.pow(d, 2);

        System.out.print("La fuerza de atracción es de: "+operation+ "N");
    }
}
