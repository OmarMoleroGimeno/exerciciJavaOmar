package UD04;

import java.util.Scanner;

public class Ejercicio19 {
    
    //Recursiva
    public static boolean esPalindromoRecursivo(String cadena) {
        
        if (cadena.length() <= 1) {
            return true;
        }
        if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            return esPalindromoRecursivo(cadena.substring(1, cadena.length() - 1));
        } else {
            return false;
        }
    }

    //Iterativa
    public static boolean palindromo(String cadena){
        String invertida = "";
        cadena = cadena.toLowerCase().replaceAll(" ", "");
        cadena = cadena.replaceAll(",", "");
        // cadena = cadena.toLowerCase();
        // String[] array = cadena.split(" ");
        // cadena = "";

        // for (int i = 0; i < array.length; i++) {
        //     cadena += array[i];
        // }

        for (int i = cadena.length() - 1; i >= 0; i--) {
			
			invertida += cadena.charAt(i);
		}

        if (cadena.equals(invertida)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce la frase: ");
        String cadena = tec.nextLine();
        System.out.println("¿La frase és un palídromo? " + palindromo(cadena));
        tec.close();
    }
}
