package UD08._04_centrocomercial;

public class TVLCD extends Televisor{

    private int resolAlto;
    private int resolAncho;

    public TVLCD(String marca, String modelo, double precio, int resolAlto, int resolAncho) {
        super(marca, modelo, precio);
        this.resolAlto = resolAlto;
        this.resolAncho = resolAncho;
    }

    @Override
    public String resolucion() {
        return this.resolAlto + "x" + this.resolAncho;
    }

    
}