package ud01;

import java.util.Scanner;

/*Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen
cuenta el 40% y la del segundo examen un 60%.
Ejemplo 1: */

public class Actividad17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota1examen = scanner.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notamedia = scanner.nextDouble();
        scanner.close();
        
        double calculo = (notamedia - 0.4 * nota1examen) / 0.6 ;
        calculo = Math.round(calculo * 100.0) / 100.0;

        System.out.println("Para tener un " + notamedia + " en el trimestre necesitas sacar un " + calculo + " en el segundo examen.");
    }
}
