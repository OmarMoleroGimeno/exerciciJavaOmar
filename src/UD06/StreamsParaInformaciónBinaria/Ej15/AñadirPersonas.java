package UD06.StreamsParaInformaciónBinaria.Ej15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AñadirPersonas {
    public static void main(String[] args) {
        boolean sobreescrivir = false;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quieres anadir datos sobreescrivir? ");
        String anSob = entrada.nextLine();
        if (anSob.equals("anadir")) {
            sobreescrivir = true;
        } else if(anSob.equals("sobreescrivir")) {
            sobreescrivir = false;
        }
        try (DataOutputStream dw = new DataOutputStream(
                                    new FileOutputStream("src/UD06/src/UD06/src/UD06/src/UD06/StreamsParaInformaciónBinaria/personas.dat", sobreescrivir))){
            while (true) {
                System.out.print("Nombre: ");
                String nombre = entrada.nextLine();
                if (nombre.isEmpty()) {
                    break;
                }
                dw.writeUTF(nombre);
                System.out.print("Edad: ");
                dw.writeInt(entrada.nextInt());
                System.out.print("Peso: ");
                dw.writeDouble(entrada.nextDouble());
                System.out.print("Estatura: ");
                dw.writeDouble(entrada.nextDouble());
                entrada.nextLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        entrada.close();
    }
}
