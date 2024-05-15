package UD08._04_centrocomercial;


public abstract class Televisor {
    
    private String marca;
    private String modelo;
    private double precio;


    public Televisor(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        } else if (this.getClass() != o.getClass()) {
            return false;
        }
        Televisor other = (Televisor) o;
        if (this.modelo.equals(other.modelo) && this.marca.equals(other.marca)) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(){
        if (this.marca.compareTo(marca) == 0) {
            return this.modelo.compareTo(modelo);
        } else {
            return this.marca.compareTo(marca);
        }
    }

    public abstract String resolucion();

    @Override
    public String toString() {
        return  "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nPrecio: " + this.precio;
    }

}