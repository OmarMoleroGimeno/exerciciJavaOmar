package UD04;

import java.util.Scanner;

public class SumasParciales05 {
    
    public static int[] sumaParcial(int[] v, int variable){

        int i = variable;
        int[] t=  new int[i];
        int numeroActual = 1;

        for (int j = 0; j < t.length; j++) {
            
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce la longitud de la array: ");
        int variable = tec.nextInt();

        SumasParciales05 array = new SumasParciales05();

        tec.close();
    }
}
