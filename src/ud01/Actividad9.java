package ud01;

import java.util.Random;

//Realiza un programa en Java que genere el número premiado del Cupón de la ONCE.

public class Actividad9 {
    public static void main(String[] args){
        Random num = new Random();
        int numeroRandom = num.nextInt(90000) + 10000;
        System.out.println("Este és el nombre premiat del cupó de la ONCE: " + numeroRandom);

    }
}
