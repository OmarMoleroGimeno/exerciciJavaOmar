package EjerciciosUD1;

/*(Segundos) Escribir un programa que, dada una cantidad de segundos, introducida por teclado, la
desglose en días, horas, minutos y segundos. */

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce cantidad de segundos: ");
        double segundos = scanner.nextDouble();
        scanner.close();

        double minutos = segundos /60;
        double horas = minutos /60;
        double dias = horas /24;

        System.out.println(+segundos + " segundos son");
        System.out.println(+dias +" dias");
        System.out.println(+horas +" horas");
        System.out.println(+minutos +" minutos");
    }
}
