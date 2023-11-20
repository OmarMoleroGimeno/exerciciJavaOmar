package UD03;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce el número entero: ");
        int numero = tec.nextInt();
        int num = numero;
        int contador = 0;

        for (int i = 0; i <= numero ; i++) {
            numero = numero/10;
            contador++;
        }

        System.out.println("El número "+num+" tiene "+contador+" cifras.");
        tec.close();
    }
    
}
