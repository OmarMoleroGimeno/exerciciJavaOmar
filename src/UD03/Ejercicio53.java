package UD03;
import java.util.Scanner;

//la opción correcta era la C
public class Ejercicio53 {
    public static void main(String[] args) {
    double desc = 0.0;
    Scanner entrada = new Scanner(System.in);

    System.out.print("Introduce el total: ");
    double total = entrada.nextDouble();

    if (total <= 2000){
    if (total >= 500) desc = 30.0;
    } else desc = 50.0;
    total = total * desc / 100.0;

    entrada.close();

    }
    
}
