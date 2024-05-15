package UD08._09_supermercado;

public class Detergente implements conDescuento, esLiquido{

    private String marca;
    private double precio;
    private double precioDescuento;
    
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
        return this.getPrecioDescuento();
    }

    @Override
    public String toString() {
        return  "\n" + this.getClass().getSimpleName() +
                "\nNombre " + this.getPrecio() +
                "\nPrecio " + this.getPrecio() +
                "\nPrecio descuento " + this.getPrecioDescuento() +
                "\n" +;
    }

}
