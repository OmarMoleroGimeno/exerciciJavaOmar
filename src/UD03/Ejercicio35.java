package UD03;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumaEdades=0;
        
        do {
            for (int i = 1; i < 6; i++) {
            System.out.print("Introduce la edad de la persona "+i+": ");
            int edad = entrada.nextInt();
            sumaEdades += edad;
        }
        } while (sumaEdades<200);
        

        entrada.close();
    }
}
