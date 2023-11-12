package Prova;

import java.util.Scanner;

public class adivinaElNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num_a_adivinar=(int)(Math.random()*100);
        int i;
        

        do {
            
            System.out.println("Adivina el número entre el 1 y 100");
            i = entrada.nextInt();

            if (i > num_a_adivinar && i>=1 && i<=100) {
                System.out.println("El número es menor a "+i);
            } else if(i < num_a_adivinar && i>=1 && i<=100){
                System.out.println("El número es mayor a "+i);
            } else if (i == num_a_adivinar && i>=1 && i<=100) {
                System.out.println("\n\nEl número introducido es CORRECTO!!!!!");
            } else {
                System.out.println("\nEl número introducido no esta entre 1 y 100");
            }
        } while (i != num_a_adivinar);

        entrada.close();
    }
}