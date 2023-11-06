package ud01;

import java.util.Scanner;

// Realiza un conversor de MiB a KiB.

public class Actividad6 {
    public static void main(String[] args){
        int cambio = 1024;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix els MiB: ");
        double miB = scanner.nextDouble();
        scanner.close();
        double kiB = miB * cambio;
        System.out.println(miB + " MiB equivalen a " + kiB + " KiB");

    }
}
