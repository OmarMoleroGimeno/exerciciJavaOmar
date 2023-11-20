package UD03;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, numBultos, peso=0;
        double precio=0.0;
        
        

        
        do {
            System.out.print("Introduce el día de la semana siendo el lunes 1 y sabado 6: ");
            dia = entrada.nextInt();
        } while (dia < 1 || dia > 6);

        do {
            System.out.print("Introduce la cantidad de bultos: ");
        numBultos = entrada.nextInt();
        } while (numBultos<0 || numBultos>=30);

        for (int i=1; i<=numBultos; i++) {
            System.out.print("Introduce el peso del paquete "+i+": ");
            peso += entrada.nextInt();
            if (peso>1000) {
                System.out.println("no se puede transportar más de 1000kg");
                return;
            }
        }

        if (dia==6) {
            precio += 60;
        }
        precio+=numBultos*30;
        if (peso > 300) {
            peso +=(peso-300)*0.9;
        }

        System.out.println("el precio final es: &.2f$\n"+precio);
        entrada.close();

    }
}