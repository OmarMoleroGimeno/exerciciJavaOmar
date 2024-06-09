package UD08._12_juego;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Dado y Moneda
        Dado dado = new Dado();
        Moneda moneda = new Moneda();

        // Lanzar el dado y la moneda
        System.out.println("\nLanzamiento del dado:");
        dado.lanzar();

        System.out.println("\nLanzamiento de la moneda:");
        moneda.lanzar();
    }
}