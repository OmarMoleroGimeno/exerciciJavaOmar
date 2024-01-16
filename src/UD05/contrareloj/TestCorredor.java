package UD05.contrareloj;

import UD05.contrareloj.Corredor.IllegalArgumentException;

public class TestCorredor {
    public static void main(String[] args) {
        Corredor c1 = new Corredor("Arnau");
        Corredor c2 = new Corredor("Ismael");

        try {
            c1.setTiempo(300);
            c2.setTiempo(400);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: "+e.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
