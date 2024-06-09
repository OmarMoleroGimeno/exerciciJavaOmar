package UD08._12_juego;

public class Dado extends Sorteo{

    @Override
    public void lanzar() {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println(num);
    }
    
}
