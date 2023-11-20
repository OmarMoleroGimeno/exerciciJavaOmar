package UD03;
import java.util.Scanner;

public class Ejercicio45 {

    public static void dibRecNumeros3 (int ancho, int alto){
        for (int i = 0; i < alto ; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(j+" ");
            }for (int k = ancho; k >= 1; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
    public static void dibRecAsteriscos2(int ancho, int alto){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho/2; j++) {
                System.out.print(" * ");
                System.out.println(" + ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce el ancho: ");
        int ancho = tec.nextInt();
        System.out.print("Introduce el alto: ");
        int alto = tec.nextInt();

        //dibRecNumeros3(ancho, alto);
        dibRecAsteriscos2(ancho, alto);

        tec.close();
    }
}