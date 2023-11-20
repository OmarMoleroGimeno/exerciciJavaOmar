package Prova;

import java.util.Scanner;

public class PotenciaSinMathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        double resultado = calcularPotencia(base, exponente);

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }

    static double calcularPotencia(double base, int exponente) {
        if (exponente < 0) {
            System.out.println("Exponente debe ser no negativo para este ejemplo.");
            return 0; // Manejo de caso no soportado (exponente negativo)
        }

        double resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}

