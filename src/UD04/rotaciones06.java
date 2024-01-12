package UD04;

import java.util.Scanner;

public class rotaciones06 {

    public static int generarNum(int inicio, int fin){
        int numero;
            numero = (int)(Math.random()*(fin-inicio+1)+inicio);
            return numero;
    }

    public static void rotarDerecha(int[]v){
        int valor = v[0];
        for (int i = 0; i < v.length; i++) {
            int aux = v[i+1%v.length];
            v[i+1%v.length] = v[i];
            valor = aux;
        }
    }

    public static String mostrarArray (int[] v){
        String cadena = " ";
        for (int i = 0; i < v.length; i++) {
            cadena += i + " ";
        }
        return cadena;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Pedir longitud i crear array v con la longitud solicitada
        System.out.print("Introduce la longitud de la array: ");
        int v[] = new int[entrada.nextInt()];
        entrada.close();
        
        rotarDerecha(v);


    }
}
