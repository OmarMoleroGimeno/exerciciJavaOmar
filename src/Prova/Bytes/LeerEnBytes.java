package Prova.Bytes;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerEnBytes {
    public static void main(String[] args) {
        try (FileInputStream fos = new FileInputStream("EscribirByte.dat")) {
            int caracter;
            
            //Bucle donde le asignamos un entero a la variable caracter
            while ((caracter = fos.read()) != -1) {
                //Casteamos el entero recogido en un caracter
                System.out.print((char)caracter);
            }
    
        } catch (EOFException e) {
    
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}