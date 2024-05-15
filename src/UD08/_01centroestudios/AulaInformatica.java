package UD08._01centroestudios;

public class AulaInformatica extends Aula{
    private int numOrdenadores;

    public AulaInformatica(double longitud, double anchura, int numOrdenadores) {
        super(longitud, anchura);
        this.numOrdenadores = numOrdenadores;
    }

    @Override
    public int capacidad() {
        return numOrdenadores * 2;
    }

    @Override
    public String toString() {
        return "Aula de Informática:\n" +
        super.toString() +
        "\tNum. Ordenadores: " + this.numOrdenadores;
    }

}