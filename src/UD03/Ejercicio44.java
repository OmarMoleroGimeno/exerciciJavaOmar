package UD03;

import java.util.Scanner;

public class Ejercicio44 {

    public static void dibRecAsteriscos (int ancho, int alto){
        for (int i = 0; i < alto ; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void dibRecNumeros1 (int ancho, int alto){
        for (int i = 0; i < alto ; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void dibRecNumeros2 (int ancho, int alto){
    for (int i = 1; i <= alto ; i++) {
            for (int j = ancho; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void dibRecNumeros3 (int ancho, int alto){
        int numero = 1;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (numero<10) {
                    System.out.print("0"+numero+" ");
                }else{
                    System.out.print(numero+" ");
                }
                numero++;
            }
            System.out.println();
        }
    }

    public static void dibDiagonal (int ancho, int alto){
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                if (i==j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void dibRecLetras (int ancho, int alto){
        int letra = 97;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                char caracter = (char) letra;
                System.out.print(caracter+" ");
            }
            System.out.println();
            letra++;
        }
    }

    public static void dibRecLetras2 (int ancho, int alto){
        int letra = 122-26+alto;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                char caracter = (char) letra;
                System.out.print(caracter+" ");
            }
            System.out.println();
            letra--;
        }
    }

    public static void dibRecLetras3 (int ancho, int alto){
        char letra='a';

        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(letra++ + " ");
            }
            System.out.println();
        }
    }

    public static void menu(){
        System.out.println("1) asteriscos");
        System.out.println("2) cuenta");
        System.out.println("3) cuenta atras");
        System.out.println("4) cuenta seguida");
        System.out.println("5) diagonal");
        System.out.println("---------");
        System.out.println("Salir");
        System.out.println("---------");
        System.out.print("Elige opción: ");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int altura;
        int anchura;

        System.out.print("Introduce la altura del rectangulo: ");
        altura = entrada.nextInt();
        System.out.print("Introduce la anchura del rectangulo: ");
        anchura = entrada.nextInt();

        dibRecAsteriscos(anchura, altura);
        dibRecNumeros1(anchura, altura);
        dibRecNumeros2(anchura, altura);
        dibRecNumeros3(anchura, altura);
        dibDiagonal(anchura, altura);
        dibRecLetras(anchura, altura);
        dibRecLetras2(anchura, altura);
        dibRecLetras3 (anchura ,altura);

        do {
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: dibRecAsteriscos(anchura, altura);
                    break;
                case 2: dibRecNumeros1(anchura, altura);
                    break;
                case 3: dibRecNumeros2(anchura, altura);
                    break;
                case 4: dibRecNumeros3(anchura, altura);
                    break;
                case 5: dibDiagonal(anchura, altura);
                    break;
                case 6: dibRecLetras(anchura, altura);
                    break;
                case 7: dibRecLetras2(anchura, altura);
                    break;
                case 8: dibRecLetras3(anchura, altura);
                    break;
                default: System.out.println("Opción no válida.\nVuelva a introducir opción");
            }
        } while (opcion!= 0);

        entrada.close();
    }
}