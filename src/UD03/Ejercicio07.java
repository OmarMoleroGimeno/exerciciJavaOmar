package UD03;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numero deseado: ");
        double x = entrada.nextInt();

        if (x < 0) {
            System.out.println("No se puede hacer la raíz cuadrada debido a que es un número negativo");
        } else {
            System.out.println("La raiz cuadrada de "+x+" es: "+Math.sqrt(x));
        }
        entrada.close();
    }
}
