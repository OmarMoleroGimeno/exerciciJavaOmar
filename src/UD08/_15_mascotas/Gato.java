package UD08._15_mascotas;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre, "Gato");
    }

    @Override
    public String getDetalles() {
        return toString();
    }
}
