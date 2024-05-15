package Prova.FicherosDeTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFicheroTexto {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("EscribirTexto.txt"))) {
            bw.write(tec.nextLine());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        tec.close();
    }
}