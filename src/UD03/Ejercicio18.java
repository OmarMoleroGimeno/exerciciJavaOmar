package UD03;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la hora a la que se realizó el trayecto: ");
        int hora = entrada.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos = entrada.nextInt();
        System.out.println("Introduce el dia en que se realizó siendo el 1 el Lunes y el 7 el Domingo: ");
        int dia = entrada.nextInt();
        System.out.println("Introduce el trayecto recorrido en kilometros: ");
        double recorrido = entrada.nextDouble();

        if (hora >= 6 && hora <= 22 && dia >= 1 && dia <= 5) {
            double diurna = recorrido *0.73;
            System.out.println("El coste es: "+diurna);

        } else if(hora >= 6 && hora <= 22 && dia == 6 && dia == 7) {
            System.out.println("El coste es: "+recorrido *0.93);

        } else if(hora < 6 || hora > 22) {
            double nocturna = recorrido *0.93;
            System.out.println("El coste es: "+nocturna);

        } else {
            System.out.println("No has introducido un valor correcto");
        }

        entrada.close();
    }
}
