package UD06.Lectura_Escritura;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ej09_EscribirFichero1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try ( FileOutputStream fo = new FileOutputStream("nombres.log", true)) {

            String nombre = tec.nextLine();
            fo.write(nombre.getBytes());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (FileInputStream fi = new FileInputStream("nombres.log")) {
            int cont = 0;
            while ((cont = fi.read()) != -1) {
                System.out.print((char)cont);
            }
            
        } catch (EOFException e) {
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        tec.close();
    }
}
