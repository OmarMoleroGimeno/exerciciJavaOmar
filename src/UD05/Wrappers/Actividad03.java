package UD05.Wrappers;

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce un valor entero: ");
        String entero = tec.nextLine();

        Integer enteroWrapper = Integer.parseInt(entero);
        System.out.println("Entero de la case 'Integer': " + enteroWrapper);

        tec.close();
    }
}