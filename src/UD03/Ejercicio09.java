package UD03;

import java.util.Scanner;

public class Ejercicio09 {
    
    public boolean ano(int ano){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el año: ");
        int ano = entrada.nextInt();

        Ejercicio09 ejercicio09 = new Ejercicio09();
        boolean esBisiesto = ejercicio09.ano(ano);

        System.out.println(esBisiesto);

        entrada.close();
    }
}