package UD02;

/*Realiza una clase minumero que proporcione el doble, triple y cuádruple de
un número proporcionado en su constructor (realiza un método para doble , otro para
triple y otro para cuádruple ). Haz que la clase tenga un método main y comprueba los
distintos métodos.*/

public class Actividad05 {
    private double numero;

    public Actividad05(){

    }
    public Actividad05(double numero) {
        this.numero = numero;
    }

    // Método para calcular el doble
    public double doble() {
        return numero * 2;
    }

    // Método para calcular el triple
    public double triple() {
        return numero * 3;
    }

    // Método para calcular el cuádruple
    public double cuadruple() {
        return numero * 4;
    }

    public static void main(String[] args) {
        double numero = 5.34; // Proporciona el número que deseas

        Actividad05 actividad05 = new Actividad05(numero);

        System.out.println("Número deseado: " + numero);
        System.out.println("Doble: " + actividad05.doble());
        System.out.println("Triple: " + actividad05.triple());
        System.out.println("Cuádruple: " + actividad05.cuadruple());
    }
}

