package UD03;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");
        int nota = tec.nextInt();
        
        tec.close();
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Has sacado un INSUFICIENTE");
                break;
            case 5:
                System.out.println("Has sacado un SUFICIENTE");
                break;
            case 6:
                System.out.println("Has sacado un BIEN");
                break;
            case 7:
                
            case 8:
                System.out.println("Has sacado un NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("Has sacado un SOBRESALIENTE");
                break;
        
        }
    }
}
