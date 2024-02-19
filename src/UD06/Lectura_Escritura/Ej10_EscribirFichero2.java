package UD06.Lectura_Escritura;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej10_EscribirFichero2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try (FileWriter fr = new FileWriter("nombres.log")) {
            
            String nombre = tec.nextLine();
            fr.write(nombre);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("nombres.log")) {
            int cont = 0;
            while ((cont = fr.read()) != -1) {
                System.out.print((char)cont);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        tec.close();
    }
}
