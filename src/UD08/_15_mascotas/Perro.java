package UD08._15_mascotas;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre, "Perro");
    }

    @Override
    public String getDetalles() {
        return toString();
    }
}