package UD07.pruebaComparator;

public class Objeto {
    private int a;
    private int b;

    public Objeto(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "[ a: " + this.getA() + " | b: " + this.getB() + "]";
    }
    
}