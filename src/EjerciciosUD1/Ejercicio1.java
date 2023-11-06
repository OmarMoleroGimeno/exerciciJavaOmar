package EjerciciosUD1;

import java.util.Scanner;

// Probar la E/S elemental: Escribe el pequeño programa que aparece a continuación.


public class Ejercicio1 {
    public static void main (String arg[]){
        Scanner tec = new Scanner(System.in);
        int a, b;
        System.out.println("Introduce un número entero");
        a = tec.nextInt();
        System.out.println("Introduce otro número entero");
        b = tec.nextInt();
        System.out.println("Los números introducidos son " + a + " y " + b);
        tec.close();
        }
        
    
}
