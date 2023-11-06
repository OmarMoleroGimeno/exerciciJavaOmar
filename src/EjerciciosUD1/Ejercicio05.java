package EjerciciosUD1;

/* (Intercambio) Escribir un programa que …
1. Lea desde teclado dos valores enteros. Llama a las variables v1 y v2.
2. Muestre los valores introducidos por el usuario
3. Intercambie el valor de v1 y v2 (v1 pasa a valer lo que valía v2 y viceversa)
4. Muestre de nuevo los valores, ahora con su valor intercambiado
Ejemplo de ejecución:*/

import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese el primer valor: ");
        double v1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        double v2 = scanner.nextDouble();
        scanner.close();

        System.out.println("Estoos son los valores introducidos: "+v1+" "+v2);

    }
}
