package UD07.actividades;

import java.util.ArrayList;

public class actividad02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int tamano = ((int)(Math.random()*51));
        double resultado = 0;
        for (int i = 0; i < tamano; i++) {
            int edad = (int)((Math.random()*56)+5);
            if (edad >= 5 && edad <= 10) {
                resultado += 5;
            } else if (edad >= 11 && edad <= 17) {
                resultado += 7.5;
            } else {
                resultado += 9.5;
            }
            lista.add(edad);
        }
        System.out.println("\nHay un total de " + tamano + " personas en la cola");
        System.out.println("El precio total es de " + resultado + " euros");
        System.out.println(lista);
    }
}
