package UD07.exercicios.Academia;

public class Aula implements Comparable<Aula>{

    private int codigoAula;


    public Aula(int codigoAula) {
        this.codigoAula = codigoAula;
    }
    
    public int getcodigoAula() {
        return codigoAula;
    }

    @Override
    public int compareTo(Aula o) {
        return this.codigoAula-o.codigoAula;
    }

    @Override
    public String toString() {
        return "Codigo de Aula: " + getcodigoAula();
    }

}
