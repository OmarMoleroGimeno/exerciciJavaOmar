package EjerciciosUD1;

// (Dados) Escribir un programa que simula el lanzamiento de dos dados

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {

        Random rand = new Random();
        
        //// Generar un número aleatorio entre 1 y 6
        int dado1 = rand.nextInt(6) +1;

        int dado2 = rand.nextInt(6) +1;

        int operation = dado1 + dado2;
        
        System.out.println("Dado 1: "+dado1);
        System.out.println("Dado 2: "+dado2);
        System.out.println("Puntuación total: "+operation);
    }
}
