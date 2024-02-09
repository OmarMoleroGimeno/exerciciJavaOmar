package UD05.juegoDeCartas;

public class Carta {
    
    private static final int OROS = 0;
    private static final int COPAS = 1;
    private static final int ESPADAS = 2;
    private static final int BASTOS = 3;
    private int valor;
    private int palo;

    public Carta(){
        this.palo = (int)(Math.random()*4);
        this.valor = (int)(Math.random()*12+1);
    }

    public Carta(int palo, int valor) throws IllegalArgumentException{
        if (palo < 0 || palo > 3 || valor < 1 || valor > 12) {
            throw new IllegalArgumentException("Los datos introducidos són incorrectos.");
        } else {
            this.palo = palo;
            this.valor = valor;
        }
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPalo() {
        return this.palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public int compareTo(Carta carta){
        int calculo;
        if (this.getPalo() != carta.getPalo()) {
            calculo = this.getPalo() - carta.getPalo();
        } else {
            calculo = this.getValor() - carta.getValor();
        }
        return calculo;
    }

    public boolean equals(Carta carta){
        if (this.palo == carta.getValor() && this.valor == carta.getValor()) {
            return true;
        } else {
            return false;
        }
    }

    public void sigoPalo(Carta carta){
        if (carta.palo > BASTOS) {
            carta.palo = OROS;
        }else{
            carta.palo++;
        }
    }
    
    @Override
    public String toString() {
        String palo = "";
        switch (this.getPalo()) {
            case 0:
                palo = "Oros";
                break;
            case 1:
                palo = "Copas";
                break;
            case 2:
                palo = "Espadas";
                break;
            case 3:
                palo = "Bastos";
                break;
        }
        return getValor() + " de " + palo;
    }
}