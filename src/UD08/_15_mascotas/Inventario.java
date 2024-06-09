package UD08._15_mascotas;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Animal> animales;

    public Inventario() {
        animales = new ArrayList<>();
    }

    public void mostrarListaAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal.getTipo() + " - " + animal.getNombre());
        }
    }

    public void mostrarDatosAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                System.out.println(animal.getDetalles());
                return;
            }
        }
        System.out.println("Animal no encontrado.");
    }

    public void mostrarTodosLosDatos() {
        for (Animal animal : animales) {
            System.out.println(animal.getDetalles());
        }
    }

    public void insertarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void eliminarAnimal(String nombre) {
        animales.removeIf(animal -> animal.getNombre().equals(nombre));
    }

    public void vaciarInventario() {
        animales.clear();
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.insertarAnimal(new Perro("Rex"));
        inventario.insertarAnimal(new Gato("Mittens"));
        inventario.insertarAnimal(new Loro("Polly"));
        inventario.insertarAnimal(new Canario("Tweety"));

        System.out.println("Lista de animales:");
        inventario.mostrarListaAnimales();

        System.out.println("\nDatos de un animal concreto (Rex):");
        inventario.mostrarDatosAnimal("Rex");

        System.out.println("\nDatos de todos los animales:");
        inventario.mostrarTodosLosDatos();

        System.out.println("\nEliminando el animal Mittens:");
        inventario.eliminarAnimal("Mittens");
        inventario.mostrarTodosLosDatos();

        System.out.println("\nVaciando el inventario:");
        inventario.vaciarInventario();
        inventario.mostrarTodosLosDatos();
    }
}
