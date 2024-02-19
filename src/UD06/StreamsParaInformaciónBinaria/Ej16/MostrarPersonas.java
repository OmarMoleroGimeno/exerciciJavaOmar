package UD06.StreamsParaInformaciónBinaria.Ej16;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class MostrarPersonas {
    public static void main(String[] args) {

        try (DataInputStream di = new DataInputStream(new BufferedInputStream(new FileInputStream("src/UD06/src/UD06/src/UD06/StreamsParaInformaciónBinaria/personas.dat")))) {
            while (true) {
                System.out.println("Nombre: " + di.readUTF());
                System.out.println("Edad: " + di.readInt());
                System.out.println("Peso: " + di.readDouble());
                System.out.println("Estatura: " + di.readDouble());
            }
        } catch (EOFException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}