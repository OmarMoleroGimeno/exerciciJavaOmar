package UD03;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numPersona;
        int edad;
        int infancia=0, pubertad=0, adolescencia=0, adultez=0, vejez=0;

        System.out.println("Introduce el número de personas: ");
        numPersona = tec.nextInt();

        for (int i=1; i<=numPersona; i++){
            System.out.println("Introduce edad de la persona "+i+":");
            edad = tec.nextInt();

            if (edad<=10) {
                infancia++;
            } else if (edad>=11 && edad<=14){
                pubertad++;
            } else if (edad>=15 && edad<=21) {
                adolescencia++;
            }else if (edad>=22 && edad<=55) {
                adultez++;
            } else {
                vejez++;
            }
        }

        tec.close();
    }
}
