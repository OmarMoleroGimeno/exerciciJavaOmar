package UD05.Wrappers;

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int resultado;

        System.out.print("Introduce el primer valor numérico: ");
        int num1 = tec.nextInt();
        System.out.print("Introduce el segundo valor numérico: ");
        int num2 = tec.nextInt();
        tec.nextLine();
        System.out.print("Introduce la operación a realizar: ");
        String operacion = tec.nextLine();

        if (operacion.equals("suma")) {

            resultado = num1 + num2;
            String binario = Integer.toBinaryString(resultado);
            String octal = Integer.toOctalString(resultado);
            String hexadecimal = Integer.toHexString(resultado);
            System.out.println("Resultado:");
            System.out.println("  en binario: " + binario);
            System.out.println("  en octal: " + octal);
            System.out.println("  en hexadecimal: " + hexadecimal);

        } else if (operacion.equals("resta")) {

            resultado = num1 - num2;
            String binario = Integer.toBinaryString(resultado);
            String octal = Integer.toOctalString(resultado);
            String hexadecimal = Integer.toHexString(resultado);
            System.out.println("Resultado:");
            System.out.println("  en binario: " + binario);
            System.out.println("  en octal: " + octal);
            System.out.println("  en hexadecimal: " + hexadecimal);

        } else if (operacion.equals("multiplicación")) {

            resultado = num1 * num2;
            String binario = Integer.toBinaryString(resultado);
            String octal = Integer.toOctalString(resultado);
            String hexadecimal = Integer.toHexString(resultado);
            System.out.println("Resultado:");
            System.out.println("  en binario: " + binario);
            System.out.println("  en octal: " + octal);
            System.out.println("  en hexadecimal: " + hexadecimal);

            System.out.println("  en binario: ");
        } else if (operacion.equals("división")) {

            resultado = num1 / num2;
            String binario = Integer.toBinaryString(resultado);
            String octal = Integer.toOctalString(resultado);
            String hexadecimal = Integer.toHexString(resultado);
            System.out.println("Resultado:");
            System.out.println("  en binario: " + binario);
            System.out.println("  en octal: " + octal);
            System.out.println("  en hexadecimal: " + hexadecimal);

            System.out.println("  en binario: ");
        }

        tec.close();
    }
}
