package UD06.Lectura_Escritura;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ej09_EscribirFichero1 {
    public static void main(String[] args) {
        //Escribir a binario
        try (BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("nombres.log", true))) {
            String nombre = "Omar";
            bo.writeUTF(nombre);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
