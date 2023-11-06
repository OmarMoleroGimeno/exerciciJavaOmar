package ud01;

import java.util.Scanner;

//Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.

public class Activitat5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix les hores treballades: ");
        double hores = scanner.nextDouble();
        scanner.close();
        double operation = hores * 12;
        operation = Math.round(operation * 100.0) / 100.0;
        System.out.println("El salario es de: " + operation + " euros");
    }
    
}
