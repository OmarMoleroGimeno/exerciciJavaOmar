package UD03;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        n1 = entrada.nextInt();

        System.out.print("Introduce el primer número: ");
        n2 = entrada.nextInt();

        if (n1 < n2) {
            System.out.println("Este es el número más pequeño: "+n1);
        } else {
            System.out.println("Este es el número más pequeño: "+n2);
        }
        entrada.close();
    }
}