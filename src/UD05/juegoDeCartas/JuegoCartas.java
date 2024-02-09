package UD05.juegoDeCartas;

import java.util.Scanner;


public class JuegoCartas {
    
    public static int ganadora( Carta c1, Carta c2, int triunfo){

        if(c1.equals(c2)) {
            return 0;
        }
        if ((c1.getPalo() - c2.getPalo()) == 0) {
            if (c1.getValor() == 1) {
                return -1;
            } else if (c2.getValor() == 1) {
                return 1;
            } else {
                return ((c1.compareTo(c2)<0) ? -1 : 1);
            }
        } else{
            if (c2.getPalo() == triunfo) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        //Crear una Carta aleatoriamente y mostrar sus datos por pantalla
        boolean valido = false;
        Carta c1 = new Carta();
        System.out.println(c1.toString());
        System.out.println();

        //representando el palo de triunfo, y mostrar por pantalla a qué palo corresponde
        int triunfo = (int) (Math.random()*4);

        //Crear una Carta a partir de un palo y un valor dados
        int  palo = 0;
        int  valor = 0;

        System.out.println();
        Carta c2 = null;
        

        do {
            System.out.print("Introduce 0 si es Oros, 1 sies Copas, 2 si es Espadas, 3 si es Bastos: ");
            palo = tec.nextInt();
            System.out.print("Introduce el valor de la carta: ");
            valor = tec.nextInt();
            try {
                c2 = new Carta(palo, valor);
                valido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
        }
        } while (!valido);

        if (ganadora(c1, c2, triunfo) < 0) {
            System.out.println("*** Carta ganadora ***");
            System.out.println(c1.toString());
        } else if (ganadora(c1, c2, triunfo) > 0) {
            System.out.println("*** Carta ganadora ***");
            System.out.println(c2.toString());
        } else {
            System.out.println("Lamentablemente no hay ganadora :/");
        }
        tec.close();
    }
}
