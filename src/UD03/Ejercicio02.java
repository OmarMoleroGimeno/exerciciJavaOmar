package UD03;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tres números enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Utilizamos operadores lógicos para encontrar el menor
        if (num1 < num2 && num1 < num3) {
            System.out.println("El numero más pequeño es: "+num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("El numero más pequeño es: "+num2);
        } else {
            System.out.println("El numero más pequeño es: "+num3);
        }

        scanner.close();
    }
}
