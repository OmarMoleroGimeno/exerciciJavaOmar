package UD02;

public class Actividad09 {
    
    //Creación de variables
    private String marca;
    private String modelo;

    // Constructor con parametros null
    public Actividad09(){
        this.marca = null;
        this.modelo = null;
    }

    // Constructor con parámetros
    public Actividad09(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para obtener la marca del coche
    public String getMarca(){
        return marca;
    }

    // Método para obtener el modelo del coche
    public String getModelo(){
        return modelo;
    }
    public static void main(String[] args) {

        // Crear un objeto Coche usando el constructor sin parámetros
        Actividad09 coche1 = new Actividad09();

        // Crear un objeto Coche usando el constructor con parámetros
        Actividad09 coche2 = new Actividad09("Ford", "Focus");

        //Muestra por pantalla los dos coches
        System.out.println("Coche 1: Marca "+ coche1.getMarca() +", Modelo " + coche1.getModelo());
        System.out.println("Coche 2:Marca "+ coche2.getMarca() +", Modelo "+ coche2.getModelo());
    }
}
