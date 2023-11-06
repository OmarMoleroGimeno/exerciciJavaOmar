package EjerciciosUD1;

/*. (Medidas) Escribir un programa que convierta una medida dada en pies a sus equivalentes en yardas,
pulgadas, centímetros y metros, sabiendo que 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm,
1 m = 100 cm */
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce la medida en pies: ");
        double pies = scanner.nextDouble();
        double yardas = pies *3;
        double pulgadas  = pies *12;
        double cm = pulgadas *2.54;
        double m = cm /100;
        scanner.close();

        System.out.println("Esta es la medida en yardas: "+yardas);
        System.out.println("Esta es la medida en pulgadas: "+pulgadas);
        System.out.println("Esta es la medida en centímetros: "+cm);
        System.out.println("Esta es la medida en metros: "+m);
    }
}
