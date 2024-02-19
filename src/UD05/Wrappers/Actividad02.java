package UD05.Wrappers;

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce un valor entero: ");
        String entero = tec.nextLine();

        int num = Integer.parseInt(entero);
        System.out.println("Casteo: " + num);

        tec.close();
    }
}
