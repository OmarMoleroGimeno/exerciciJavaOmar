package EjerciciosUD1;

//4. Muestre de nuevo los valores, ahora con su valor intercambiado
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese el primer valor: ");
        double v1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        double v2 = scanner.nextDouble();
        scanner.close();

        System.out.println("Antes de intercanciar: v1: "+v1+" v2: "+v2);
        System.out.println("Después de intercambiar: v1: "+v2+" v2: "+v1);

    }
}
