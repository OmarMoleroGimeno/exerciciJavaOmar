package UD04;

import java.util.Scanner;

public class Ejercicio22 {

    public static int maximoComunDivisor(int m, int n){
        int aux = 0;
        while (n != 0) {
            aux = n;
            n = m % n;
            m = aux;
        }
        return m;
    }

    public static int maximoComunDivisorRecursivo(int m, int n) {
        if (n == 0) return m;
        return maximoComunDivisorRecursivo(n, m % n);
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int m = tec.nextInt();
        System.out.print("Introduce el primer número: ");
        int n = tec.nextInt();

        System.out.println("El MCD es: " + maximoComunDivisor(m, n) + " - Método iterativo");
        System.out.println("El MCD es: " + maximoComunDivisorRecursivo(m, n) + " - Método recursivo");

        tec.close();
    }
}