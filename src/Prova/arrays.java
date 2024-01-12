package Prova;

import java.util.Scanner;

public class arrays {
    public static void crearArray(){
        int x = 5;
        int[] v = new int[x];
        for (int i = 0; i < v.length; i++) {
            int y = 0;
            v[y] = (int)(Math.random()*20+1) ;
            y++;
        }
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("introduce la largaria de la array: ");
        int x = tec.nextInt();
        tec.close();

        int[] v = new int[x];
        int y = 1;
        for (int i = 0; i < v.length; i++) {
            v[i] = y ;
            y++;
        }
        //Recorrer array
        for (int i = 0; i < v.length; i++) {
            System.out.println("Elemento " + i + ": " + v[i]);
        }
        System.out.println();
        //Recorrer aray al reves
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.println("Elemento " + i + ": " + v[i]);
        }
    }
}
