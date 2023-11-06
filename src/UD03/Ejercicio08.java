package UD03;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe la hora: ");
        int hora = entrada.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = entrada.nextInt();

        if (hora < 12) {
            System.out.println(+hora);
        } else if(hora > 12 && hora < 24 && minutos > 0 && minutos < 60) {
            int operation = hora -12;
            System.out.println("La hora es: "+operation+":"+minutos);
        } else{
            System.out.println("La hora introdia es incorrecta");
        }


        entrada.close();
    }
}
