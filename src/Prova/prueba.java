package Prova;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("introduce el número: ");
        numero = entrada.nextInt();

        System.out.println("Divisibles entre 3: ");
        for(int i = 1; i<=numero; i++){
            if(i%3==0){
                System.out.println(i);
            }
    }entrada.close();
    }
}
