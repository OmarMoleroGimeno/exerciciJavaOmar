package ud01;

import java.util.Scanner;

//Escribe un programa que calcule el área de un rectángulo.

public class Actividad3 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introdueix la base del rectàngle: ");
    double base = scanner.nextDouble();
    System.out.print("Introdueix la altura del rectàngle: ");
    double altura = scanner.nextDouble();
    scanner.close();
    double area = base * altura;
    System.out.println("El area del rectàngle es: " + area);

    }
}
    