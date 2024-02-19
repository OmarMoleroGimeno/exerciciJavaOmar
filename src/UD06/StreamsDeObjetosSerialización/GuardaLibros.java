package UD06.StreamsDeObjetosSerialización;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GuardaLibros {
    public static void main(String[] args) {
        Autor a1 = new Autor("Santiago Segura", 1975, "Española");
        Autor a2 = new Autor("Omar", 2005, "Española");

        Libro l1 = new Libro("La vida es vella", 2022, a1);
        Libro l2 = new Libro("Dalmatas", 2020, a2);
        Libro l3 = new Libro("Micky", 2002, a1);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.obj"));
            oos.writeObject(l1);
            oos.writeObject(l2);
            oos.writeObject(l3);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("biblioteca.obj"));
            while (true) {
                Libro lx = (Libro) ois.readObject();
                System.out.println(lx);
            }
        } catch (EOFException e) {
            
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}