package UD03;
import java.util.Scanner;

public class Ejercicio45 {

    //cadena de numeros normal e invertida
    public static void dibRecNumeros3 (int ancho, int alto){
        for (int i = 0; i < alto ; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(j+" ");
            }
            System.out.print("|| ");
            for (int k = ancho; k >= 1; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    //*+*+*+
    public static void dibRecAsteriscos2(int ancho, int alto){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (j%2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    //Cubo hueco
    public static void dibRectAsteriscos3 (int ancho, int alto){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i==0 || i == (alto-1)|| j==0 || j==(ancho-1)) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //media piramide
    public static void dibTriangulo1 (int base){
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //media piramide invertida
    public static void dibTriangulo2 (int ancho){
        for (int i = 1; i <= ancho; i++) {
            for (int j = ancho; j >= 1; j--) {
                if (i<j) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    //piramide entera
    public static void dibTriangulo3(int alto){
        
        int cont = 0;
        int aux;
        int i;

        for (i = 1; i <= alto; i++) {
            for (int j = alto; j >= 1; j--) {
                if (i<j) {
                    System.out.print("  ");
                } else if (i==j){
                    //veces que necesitamos que se repita
                    aux = i*2-1;
                    cont= 1;
                    do {
                        //printeamos
                        System.out.print("* ");
                        cont++;
                    } while (cont<=aux);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        // System.out.print("Introduce el ancho: ");
        // int ancho = tec.nextInt();
        // System.out.print("Introduce el alto: ");
        // int alto = tec.nextInt();
        // System.out.print("Introduce la base: ");
        // int base = tec.nextInt();

        //cadena de numeros normal e invertida
        // dibRecNumeros3(ancho, alto);

        //*+*+*+
        //dibRecAsteriscos2(ancho, alto);

        //Cubo hueco
        //dibRectAsteriscos3(ancho, alto);

        //media piramide
        //dibTriangulo1(base);

        //media piramide
        //dibTriangulo2(ancho);

        //piramide entera
        // dibTriangulo3(alto);
        tec.close();
    }
}