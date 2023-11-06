package UD03;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu nota: ");
        int numero = entrada.nextInt();

        if (numero < 5) {
            System.out.println("Has sacado un insuficiente");
        } else if (numero >= 5 && numero <= 6 ) {
            System.out.println("Has sacado un suficiente");
        } else if (numero >= 7 && numero <=8 ) {
            System.out.println("Has sacado un notable");
        } else if (numero >= 9 && numero <= 10) {
            System.out.println("Has sacado un excelente");
        } else {
            System.out.println("El número introducio no es válido");
        }
        entrada.close();
    }
}