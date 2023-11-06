package UD03.Excepciones;
import java.util.Scanner;

public class Ejercicio572 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        int suma = 0;

        try {
            for (int i=1; i<=5; i++){
                do {
                    
                } while (edad<0 );
            }
        } catch (Exception e) {
        }
        System.out.printf("\n\nLa media de edad es: %.2f", (double)(suma/5));

        entrada.close();
    }
}
