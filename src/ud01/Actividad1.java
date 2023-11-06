package ud01;

import java.util.Scanner;

/*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser
introducida por teclado. */

public class Actividad1{
    public static void main(String[] args) {
        double cambio = 166.386;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de Euros: ");
        double euros = scanner.nextDouble();
        scanner.close();
        double pesetas = euros * cambio;
        System.out.println(euros + "euros equivalen a " + pesetas + " pesetas.");
    }
}
