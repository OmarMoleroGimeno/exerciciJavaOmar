package ud01;

import java.util.Scanner;

//Escribe un programa que calcule el área de un triángulo.

public class Actividad4 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introdueix la base del triàngle: ");
    double base = scanner.nextDouble();
    System.out.print("Introdueix la altura del triàngle: ");
    double altura = scanner.nextDouble();
    scanner.close();
    double area = base * altura / 2;
    System.out.println("El area del triangle es: " + area);

    }
}
