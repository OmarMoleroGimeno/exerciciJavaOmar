package Prova.FicherosBinarios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerFicheroBinario {
    public static void main(String[] args) {

        try (DataInputStream dos = new DataInputStream(new FileInputStream("EscribirBinario.dat"))) {
            
            while (true) {
                System.out.println(dos.readUTF());
            }

        } catch (EOFException e) {

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
