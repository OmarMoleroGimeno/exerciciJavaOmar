package Prova.Bytes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EscribirEnBytes {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Escribir bytes en un fichero binario
        try (FileOutputStream fos = new FileOutputStream("EscribirByte.dat", true)) {
            System.out.print("Introduzca datos: ");
            //Creamos una variable tipo String para poder escribir los carácteres que son ints
            String read = tec.nextLine();
            //Bucle para escribir los carácteres que son ints
            for (int i = 0; i < read.length(); i++) {
                fos.write(read.charAt(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        tec.close();
    }
}
