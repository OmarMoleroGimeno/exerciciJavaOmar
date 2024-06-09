package UD08._09_supermercado;

public class Detergente implements esLiquido, conDescuento{

    private String marca;
    private double precio;
    private double precioDescuento;
    private double volumen;
    private String tipoDeEnvase;
    
    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescuento(double des) {
        this.precioDescuento = des;
    }

    @Override
    public double getDescuento() {
        return ((this.getPrecioDescuento()*100)/this.getPrecio());
    }

    @Override
    public double getPrecioDescuento() {
        return this.precioDescuento;
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return this.volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoDeEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoDeEnvase;
    }

    @Override
    public String toString() {
        return  "\n" + this.getClass().getSimpleName() +
                "\nNombre " + this.getPrecio() +
                "\nPrecio " + this.getPrecio() +
                "\nPrecio descuento " + this.getPrecioDescuento() +
                "\nVolumen " + this.getVolumen() +
                "\nTipo de envase " + this.getTipoEnvase() +
                "\n";
    }

}