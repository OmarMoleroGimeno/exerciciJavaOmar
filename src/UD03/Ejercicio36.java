package UD03;
import java.util.Scanner;

public class Ejercicio36 {
    private final static int A=3;
    private final static int S=4;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= A; i++) {
            System.out.println("Alumno "+i);

            for (int j = 1; j <= S; j++) {
            System.out.print("Introduce la nota de la asignatura "+j+":");
            entrada.nextInt();
            }
            
        }
        
        entrada.close();
    }


    
}
