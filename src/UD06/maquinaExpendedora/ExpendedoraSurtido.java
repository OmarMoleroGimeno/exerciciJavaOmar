package UD06.maquinaExpendedora;

import java.io.FileNotFoundException;

public class ExpendedoraSurtido {

    private double credito;
    private double cambio;
    private double recaudacion;
    private Surtido surtido;

    public ExpendedoraSurtido (double cambio){
        this.cambio = cambio;
        this.recaudacion = 0;
        this.credito = 0;
        try {
            this.surtido = new Surtido();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public double getCreditos() {
        return this.credito;
    }

    public void setCreditos(double creditos) {
        this.credito = creditos;
    }

    public int getStock(int producto) {
        return this.surtido.getProducto(producto).getStock();
    }


    public double getPrecio(int producto) {
        return this.surtido.getProducto(producto).getPrecio();
    }

    public double getCambio() {
        return this.cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public double getRecaudacion() {
        return this.recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public void introducirDinero(double importe){
        this.credito += importe;
    }

    public double solicitarDevolucion(){
        double devolucion = this.credito;
        this.credito = 0;
        return devolucion;
    }

    @Override
    public String toString() {
        String str = "";
        str +=  "Crédito: " + this.getCreditos() +
                "\nCambio: " + this.getCambio() +
                "\nRecaudación: " + this.getRecaudacion() +
                "\nProductos:\n ";
        for (int i = 1; i <= this.surtido.numProductos(); i++) {
            str +=  "\n Nombre: " + this.surtido.getProducto(i).getNombre() +
                    "\n  Precio: " + this.surtido.getProducto(i).getPrecio() +
                    "\n  Stock: " + this.surtido.getProducto(i).getStock() + "\n";
        }
        return str;
    }

    public double comprarProducto(int producto) throws NoHayCambioException, NoHayProductoException, CreditoInsuficienteException{
        
        if (this.surtido.getProducto(producto).getStock() > 0) {
            if (this.credito <= this.getPrecio(producto)) {
                if ((this.credito - this.surtido.getProducto(producto).getPrecio()) <= this.cambio) {
                    this.surtido.getProducto(producto).decrementarStock();
                    this.recaudacion += this.surtido.getProducto(producto).getPrecio();
                    double devolucion = this.credito - this.surtido.getProducto(producto).getPrecio();
                    this.cambio -= devolucion;
                    this.credito = 0;
                    return devolucion;
                } else {
                    throw new NoHayCambioException();
                }
            } else {
                throw new CreditoInsuficienteException();
            }
        } else {
            throw new NoHayProductoException();
        }
        
        
    }

    static class NoHayCambioException extends Exception{
        public NoHayCambioException(){
            super("No queda cambio en la máquina.");
        }
    }

    static class NoHayProductoException extends Exception{
        public NoHayProductoException(){
            super("No queda stock.");
        }
    }

    static class CreditoInsuficienteException extends Exception{
        public CreditoInsuficienteException(){
            super("Saldo insuficiente.");
        }
    }
}