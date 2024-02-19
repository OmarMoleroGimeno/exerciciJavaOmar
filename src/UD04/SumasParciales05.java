package UD04;

import java.util.Scanner;

public class SumasParciales05 {
    
    public static int[] sumaParcial(int[] v){
        int cont = 0;
        int [] sumaParcial = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            cont += v[i];
            sumaParcial[i] = cont;
        }
        return sumaParcial;
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce la longitud de la array: ");
        int [] v = new int[tec.nextInt()];

        for ( int i = 0; i < v.length; i++) {
            System.out.print("Introduce el número de pa pos " + i + ": ");
            v[i] = tec.nextInt();
        }

        int[] res = sumaParcial(v);

        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "] = " + res[i]);
        }

        tec.close();
    }
}