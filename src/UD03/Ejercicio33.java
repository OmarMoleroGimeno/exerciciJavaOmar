package UD03;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        int alumnos = 0;
        int alumnosAprovados = 0;
        double notaTotal = 0;
        

        do {
            System.out.print("Introduce la nota "+(alumnos+1)+": ");
            nota= entrada.nextDouble();

            if (nota>=0 && nota <= 10) {
                if (nota>=5) {
                alumnosAprovados++;
            }
                notaTotal+=nota;
                alumnos++;

            } else{
                System.out.println("Saliendo...");
            }
            
            
            
        } while (nota>=0 && nota<=10);


        System.out.println("Números aprovado "+alumnos);
        System.out.println("Notas introducidas: "+alumnosAprovados);
        System.out.println("Nota media: "+notaTotal/alumnos);

        entrada.close();
    }
}