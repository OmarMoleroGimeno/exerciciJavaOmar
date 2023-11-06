package Prova;

import java.util.Scanner;

public class decrementacio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("introduce el número: ");
        numero = entrada.nextInt();

        for(int i = numero; i>=0; i -=2){
        System.out.print(i+"-");
    }
    entrada.close();
    }
    
}
