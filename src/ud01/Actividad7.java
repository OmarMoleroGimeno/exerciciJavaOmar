package ud01;

import java.util.Scanner;

// Realiza un conversor de MiB a KiB.

public class Actividad7 {
    public static void main(String[] args){
        double cambio = 1024;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix els KiB: ");
        double kiB = scanner.nextDouble();
        scanner.close();
        double miB = kiB / cambio;
        System.out.println(kiB + " KiB equivalen a " + miB + " MiB");

    }
}