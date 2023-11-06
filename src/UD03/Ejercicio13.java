package UD03;

import java.util.Scanner;

public class Ejercicio13 {

    private static final int ORDINARIAS = 6;
    private static final int EXTRAORDINARIAS = 10;
    private static double sueldo;

    public static double salarioNeto(int horas){
        if (horas>40) {
            sueldo=40*ORDINARIAS+(horas - 40)*EXTRAORDINARIAS;
        } else {
            sueldo=horas*ORDINARIAS;
        }


        if (sueldo<=350) {
            sueldo=sueldo-(sueldo*2/100);
        } else {
            sueldo=sueldo-(sueldo*10/100);
        }

        return sueldo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        int horas = entrada.nextInt();

        System.out.println("Tu salario neto es: " + salarioNeto(horas));

        entrada.close();
    }
}