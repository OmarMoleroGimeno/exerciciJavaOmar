package UD02;

public class Actividad06 {
    private int valor;

    public Actividad06() {
        this.valor = 0;
    }

    public Actividad06(int valor) {
        this.valor = valor;
    }

    public void anade(int numero) {
        this.valor += numero;
    }

    public void resta(int numero) {
        this.valor -= numero;
    }

    public int getValor() {
        return valor;
    }

    public int getDoble() {
        return valor * 2;
    }

    public int getTriple() {
        return valor * 3;
    }

    public void setNumero(int numero) {
        valor = numero;
    }

    public static void main(String[] args) {
        Actividad06 actividad06 = new Actividad06();

        actividad06.anade(5);
        System.out.println("Valor después de sumar 5: " + actividad06.getValor());

        actividad06.resta(3);
        System.out.println("Valor después de restar 3: " + actividad06.getValor());

        actividad06.setNumero(10);
        System.out.println("Valor después de establecerlo a 10: " + actividad06.getValor());

        System.out.println("Doble del valor: " + actividad06.getDoble());
        System.out.println("Triple del valor: " + actividad06.getTriple());
    }
}

