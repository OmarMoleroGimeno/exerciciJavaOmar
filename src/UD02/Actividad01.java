package UD02;

import java.util.Scanner;

public class Actividad01 {

    // Método para convertir de Celsius a Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (1.8 * celsius) + 32;
    }

    // Método para convertir de Fahrenheit a Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Introduce grados en Celsius: ");
        celsius = entrada.nextDouble();
        System.out.printf("Grado en Fahrenheit es: %.2f", celsiusToFahrenheit(celsius));

        System.out.print("\nIntroduce grados en Fahrenheit: ");
        fahrenheit = entrada.nextDouble();
        System.out.printf("Grado en Celsius es: %.2f", fahrenheitToCelsius(fahrenheit));
        entrada.close();
    }
}