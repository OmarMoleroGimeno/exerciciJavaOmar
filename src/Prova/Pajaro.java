package Prova;

public class Pajaro {
    String nombre;
    int posX;
    int posY;

    // Constructor por defecto
    public Pajaro() {
        this.nombre = "";
        this.posX = 0;
        this.posY = 0;
    }

    // Constructor con parámetros
    public Pajaro(String nombre, int posX, int posY) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    public double volar(int posX, int posY) {
        double desplazamiento;

        // Corregir el cálculo de desplazamiento
        desplazamiento = Math.sqrt(Math.pow(posX - this.posX, 2) + Math.pow(posY - this.posY, 2));
        this.posX = posX;
        this.posY = posY;

        return desplazamiento;
    }

    public static void main(String[] args) {
        Pajaro pajaro1 = new Pajaro();
        Pajaro pajaro2 = new Pajaro("Pajaro", 3, 12);

        System.out.println("\nPajaro1:");
        System.out.println("Nombre: " + pajaro1.nombre);
        System.out.println("Posición X: " + pajaro1.posX);
        System.out.println("Posición Y: " + pajaro1.posY);

        System.out.println("\nPajaro2:");
        System.out.println("Nombre: " + pajaro2.nombre);
        System.out.println("Posición X: " + pajaro2.posX);
        System.out.println("Posición Y: " + pajaro2.posY);

        System.out.printf("Desplazamiento del pájaro 2: %.2f", pajaro2.volar(10, 7));
    }
}

