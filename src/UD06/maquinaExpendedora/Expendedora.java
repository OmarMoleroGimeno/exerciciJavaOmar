package UD06.maquinaExpendedora;

public class Expendedora {

    private double credito;
    private int stock;
    private double precio;
    private double cambio;
    private double recaudacion;

    public Expendedora (double cambio, int stock, double precio){
        this.cambio = cambio;
        this.stock = stock;
        this.precio = precio;
        this.recaudacion = 0;
        this.credito = 0;
    }

    public double getCreditos() {
        return this.credito;
    }

    public void setCreditos(double creditos) {
        this.credito = creditos;
    }

    public int getStock() {
        return this.stock;
    }


    public double getPrecio(int producto) {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
        return  "Crédito: " + this.getCreditos() +
                "\nCámbio: " + this.getCambio() +
                "\nStock: " + this.getStock() +
                "\nRecaudación: " + this.getRecaudacion();
    }

    public double comprarProducto(int producto) throws NoHayCambioException, NoHayProductoException, CreditoInsuficienteException{
        
        if (this.stock > 0) {
            if (this.credito <= this.getPrecio(producto)) {
                if ((this.credito - this.precio) <= this.cambio) {
                    this.stock --;
                    this.recaudacion += this.precio;
                    double devolucion = this.credito - this.precio;
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