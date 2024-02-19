package Prova.FicherosBinarios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFicheroBinario {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("EscribirBinario.dat", true))) {
            dos.writeUTF(tec.nextLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        tec.close();
    }
}
