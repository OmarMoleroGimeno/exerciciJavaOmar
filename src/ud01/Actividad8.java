package ud01;

import java.util.Random;

// Realiza un programa en Java que genere letras de forma aleatoria.

public class Actividad8 {
    public static void main (String[] args){
        Random num = new Random();
        char lletraAleatoria = (char) (num.nextInt(26) + 'A');
        System.out.println("Lletra aleatòria generada: " + lletraAleatoria);
    }
}
