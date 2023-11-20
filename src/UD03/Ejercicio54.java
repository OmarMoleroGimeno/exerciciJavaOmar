package UD03;
import java.util.Scanner;
//cuando platos vale 1 te saca el primer plato, el segundo, la bebida y el postre porque el break esta
//despues del postre, al poner 3 te saca el case 3 y se sale en el break y por último al poner 0 te saca el default.

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Inrtroduce un número del 1 al 3: ");
        int platos = entrada.nextInt();
        
        switch (platos ) {
            case 1: System.out.println("\nPrimer plato");
            case 2: System.out.println ("\nSegundo plato");
            case 3: System.out.println ("\nBebida");
            System.out.println ("\nPostre");
            break;
            default: System.out.println("\nCafé");

            entrada.close();
            }
    }
}
