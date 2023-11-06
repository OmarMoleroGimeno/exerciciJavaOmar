package UD03.Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        int suma = 0;

        for (int i=1; i <= 5; i++){
            do {
                System.out.println("Introduce la edad de la persona: " +i);
                try {
                    edad = entrada.nextInt();
                    suma += edad;
                } catch (InputMismatchException e) {
                    edad = 0;
                    i = 5;
                    System.out.println("La edad introducida no es válida");
                }
                if (edad >= 0 && edad <= 110) {
                    suma += edad;
                }
            } while (edad < 0 || edad > 110);
        }
        System.out.printf("\n\nLa media de edad es: %.2f", (double)(suma/5));

        entrada.close();
    }
}