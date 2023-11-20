package UD04;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double[] estatura = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce la altura de la persona "+(i+1)+": ");
            estatura[i] = tec.nextDouble ();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Persona "+(i+1)+": "+estatura[i]+" m");
        }

        tec.close();
    }
}
