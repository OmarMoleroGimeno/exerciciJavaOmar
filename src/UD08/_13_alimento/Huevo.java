package UD08._13_alimento;

public class Huevo {

    private String tamanho;

    public Huevo(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "\nTamaño: " + this.tamanho;
    }
}
