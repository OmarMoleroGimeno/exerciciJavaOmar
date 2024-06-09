package UD08._12_juego;

public class Moneda extends Sorteo{

    @Override
    public void lanzar() {
        int resultado = (int) (Math.random() * 2); // Genera 0 o 1
        if (resultado == 0) {
            System.out.println("Resultado de la moneda: Cara");
        } else {
            System.out.println("Resultado de la moneda: Cruz");
        }
    }
}