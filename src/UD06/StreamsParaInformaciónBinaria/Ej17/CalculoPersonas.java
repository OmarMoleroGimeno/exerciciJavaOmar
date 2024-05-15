package UD06.StreamsParaInformaciónBinaria.Ej17;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class CalculoPersonas {
    public static void main(String[] args) {
        int cont = 0;
        double estatura = 0;
        try (DataInputStream di = new DataInputStream(
                                    new BufferedInputStream(
                                        new FileInputStream("src/UD06/src/UD06/StreamsParaInformaciónBinaria/personas.dat")))) {
            while (true) {
                di.readUTF();
                int edad = di.readInt();
                di.readDouble();
                estatura = di.readDouble();
                if (edad >= 20 && edad <= 30) {
                    int aux = 0;
                    aux += estatura;
                    cont++;
                }
            }
        } catch (EOFException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Estatura media entre las personas de 20 y 30 años: " + estatura/(double)cont);
    }
}