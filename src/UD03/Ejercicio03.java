package UD03;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los 3 números: ");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();

        if (numero1 >= numero2 && numero1 <= numero3) {
            System.out.println("Este es el número intermedio "+numero1);
        } else if (numero2 >= numero1 && numero2 <= numero3) {
            System.out.println("Este es el número intermedio "+numero2);
        } else {
            System.out.println("Este es el número intermedio "+numero3);
        }
        entrada.close();
    }
}
