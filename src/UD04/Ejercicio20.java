package UD04;

import java.util.Scanner;

public class Ejercicio20 {

    //Iteractiva
    public static String invertirCadena(String cadena){
        String aux = cadena;
        cadena = "";
        for (int i = aux.length() - 1; i >= 0; i--) {
			cadena += aux.charAt(i);
		}
        return cadena;
    }
    
    //Recursiva
    public static String invertirRecursivo(String cadena) {
        if (cadena.length() <= 1) {
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) + invertirRecursivo(cadena.substring(0, cadena.length() - 1));
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce la cadena: ");
        System.out.println("Array invertida: " + invertirCadena(tec.nextLine()));

        tec.close();
    }
}