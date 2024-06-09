package UD08._15_mascotas;

public class Loro extends Animal {
    public Loro(String nombre) {
        super(nombre, "Loro");
    }

    @Override
    public String getDetalles() {
        return toString();
    }
}
