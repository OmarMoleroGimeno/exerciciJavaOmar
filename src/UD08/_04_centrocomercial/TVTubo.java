package UD08._04_centrocomercial;

public class TVTubo extends Televisor{

    private int lineas;
    
    public TVTubo(String marca, String modelo, double precio, int lineas) {
        super(marca, modelo, precio);
        this.lineas = lineas;
    }

    @Override
    public String resolucion() {
        return String.valueOf(lineas);
    }

    @Override
    public String toString() {
        
    }

    
}