package Prova;
import java.util.Scanner;

public class toLoweCase {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce el texto:\t ");
        String texto = tec.nextLine();
        tec.close();
        System.out.print("Texto normal:\t\t "+texto);
        System.out.println("Texto minuscula:\t "+texto.toLowerCase());
        System.out.println("Texto en mayuscula:\t "+texto.toUpperCase());
        
    }
}