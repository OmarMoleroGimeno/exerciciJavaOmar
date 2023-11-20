package UD03;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Introduce un num entero: ");
        n = entrada.nextInt();

        n = n/2;

        System.out.println("2^"+n);

        entrada.close();

    }
    
    
}
