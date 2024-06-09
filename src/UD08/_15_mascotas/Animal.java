package UD08._15_mascotas;

public abstract class Animal {
    private String nombre;
    private String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Nombre: " + nombre;
    }

    public abstract String getDetalles();
}