package UD03;

import java.util.Scanner;

public class Ejercicio19 {

    public String comprobarNombre(String nombre){

        char primeraLetra = Character.toLowerCase(nombre.charAt(0));
        char ultimaLetra = Character.toLowerCase(nombre.charAt(nombre.length() - 1));

        if (primeraLetra == ultimaLetra) {
            System.out.println("La primera y la última letra de '" + nombre + "' coinciden: '" + primeraLetra + "'");
        } else {
            System.out.println("La primera y la última letra de '" + nombre + "' no coinciden. Primera: '" + primeraLetra
                    + "', Última: '" + ultimaLetra + "'");
        }

        return nombre;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();

        entrada.close();
    }
}
