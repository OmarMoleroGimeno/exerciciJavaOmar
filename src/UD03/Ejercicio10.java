package UD03;

import java.util.Scanner;

public class Ejercicio10 {

    public void fechaMenor( ){
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la primera fecha");
        System.out.print("Introduce el dia: ");
        int dia1 = entrada.nextInt();
        System.out.print("Introduce el mes: ");
        int mes1 = entrada.nextInt();
        System.out.print("Introduce el año: ");
        int ano1 = entrada.nextInt();

        System.out.println();
        
        System.out.println("Introduce la segunda fecha");
        System.out.print("Introduce el dia: ");
        int dia2 = entrada.nextInt();
        System.out.print("Introduce el mes: ");
        int mes2 = entrada.nextInt();
        System.out.print("Introduce el año: ");
        int ano2 = entrada.nextInt();

        if ((ano1>ano2) ||
            ((ano1 == ano2)  && (mes1 > mes2))||
            ((ano1 == ano2)  && (mes1 == mes2) && (dia1 > dia2))) {
                System.out.printf("La fecha menor es: %02d-%02d-04d",dia1,"/",mes1,"/",ano1);

        } else {
            System.out.printf("La fecha menor es: %02d-%02d-04d",dia2,"/",mes2,"/"+ano2);
        }


        entrada.close();
    }
}
