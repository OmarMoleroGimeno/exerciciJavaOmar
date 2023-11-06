package ud01;

import java.util.Scanner;

/* Realiza un programa en Java que tenga las variables edad, nivel de estudios e ingresos y almacene en una
variable llamada jasp el valor verdadero si la edad es menor o igual a 28 y el nivel de estudios es mayor a
3, o bien la edad es menor de 30 y los ingresos superiores a 28000. En caso contrario almacenar el valor
falso.
*/

public class Actividad15{
    public static void main(String[]args){

        //Entrada de datos: edad, nivel estudios, ingresos
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la edad del supuesto jasp: ");
        int edad = entrada.nextInt();
        System.out.print("Introduce el nivel de estudios: ");
        int nivelEstudios = entrada.nextInt();
        System.out.print("Introduce los ingresos: ");
        double ingresos = entrada.nextDouble();
        entrada.close();
        boolean jasp = (edad <= 28 && nivelEstudios > 3) || (edad < 30 && ingresos > 28000);
        if (jasp) {
            System.out.println("Eres Jasp");
            
        } else {
            System.out.println("No eres Jasp");
            
        }
    }
}