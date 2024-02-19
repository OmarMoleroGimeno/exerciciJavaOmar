package UD05.Wrappers;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce el numero decimal: ");
        double decimal = tec.nextDouble();

        // Convertir el decimal en un objeto de la clase Wrapper Double
        Double decimalWrapper = Double.valueOf(decimal);
        System.out.println("Wrapper: " + decimalWrapper);

        tec.close();
    }
}
