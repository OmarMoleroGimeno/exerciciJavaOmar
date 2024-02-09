package UD06.GestorVuelos;

import java.io.FileNotFoundException;

public class GestorVuelos {
    public static void main(String[] args) {
        try {
            Compania compania = new Compania("airvostrum");

            compania.mostrarVuelosIncompletos("València", "Milán");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
            
    }
}
