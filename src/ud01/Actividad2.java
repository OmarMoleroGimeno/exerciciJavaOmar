package ud01;

import java.util.Scanner;

/*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser
introducida por teclado. */

public class Actividad2{
    public static void main(String[] args) {
        double cambio = 1 / 166.386;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de pesetas: ");
        double pesetas = scanner.nextDouble();
        scanner.close();
        double euros = pesetas * cambio;
        euros = Math.round(euros * 100.0) / 100.0;
        System.out.println(pesetas + "pesetas equivalen a " + euros + " euros.");
    }
}
