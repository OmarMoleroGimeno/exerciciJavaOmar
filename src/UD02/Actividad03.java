package UD02;

/*Crea una clase Rebajas con un método descubrePorcentaje() que descubra
el descuento aplicado en un producto. El método recibe el precio original del producto y el
rebajado y devuelve el porcentaje aplicado. Podemos calcular el descuento realizando la
operación:*/

import java.util.Scanner;

public class Actividad03 {

    public static int descubrePorcentaje(double orign, double rebaj){
        return (int) (100*((orign-rebaj)/orign));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double original, rebajado;
        

        System.out.println("Introduce el precio original: ");
        original = entrada.nextDouble();
        System.out.println("Introduce el precio rebajado: ");
        rebajado = entrada.nextDouble();

        System.out.println("El porcentaje aplicado es: " + descubrePorcentaje(original, rebajado) + "%");
        entrada.close();
    }
    
}