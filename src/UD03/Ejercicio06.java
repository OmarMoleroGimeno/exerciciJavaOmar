package UD03;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el dividendo: ");
        int x = entrada.nextInt();
        System.out.print("Introduce el divisor: ");
        int y = entrada.nextInt();

        do {
        int z = x/y;
        System.out.println("El resultado de la división es: "+z);

        System.out.println("");

        } while (y<0 && y>0);

        entrada.close();
    }
}
