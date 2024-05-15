package UD06.StreamsParaInformaciónBinaria.Ej14;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class personas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        try (DataOutputStream dw = new DataOutputStream(
                                    new FileOutputStream("src/UD06/src/UD06/src/UD06/StreamsParaInformaciónBinaria/personas.dat"))){
            do {

                    System.out.print("Nombre: ");
                    nombre = entrada.nextLine();
                    if (!nombre.isEmpty()) {
                        dw.writeUTF(nombre);
                        System.out.print("Edad: ");
                        dw.writeInt(entrada.nextInt());
                        System.out.print("Peso: ");
                        dw.writeDouble(entrada.nextDouble());
                        System.out.print("Estatura: ");
                        dw.writeDouble(entrada.nextDouble());
                        entrada.nextLine();
                    }
            } while (!nombre.isEmpty());
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        entrada.close();
    }
}