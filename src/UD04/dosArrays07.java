package UD04;
import java.util.Scanner;

public class dosArrays07 {

    public static int generarNum(int inicio, int fin){
        int numero;
            numero = (int)(Math.random()*10);
            return numero;
    }

    public static double[] sumaArraysIguales (double[] a, double[] b){
        double[] suma = new double[a.length];
        
        for (int i = 0; i < a.length; i++) {
            suma[i] = a[i] + b[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        sumaArraysIguales(null, null);
        tec.close();
    }
}
