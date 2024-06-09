package UD08._15_mascotas;

public class Canario extends Animal {
    public Canario(String nombre) {
        super(nombre, "Canario");
    }

    @Override
    public String getDetalles() {
        return toString();
    }
}
