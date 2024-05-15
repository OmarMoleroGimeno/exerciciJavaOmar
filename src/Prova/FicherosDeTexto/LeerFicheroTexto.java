package Prova.FicherosDeTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto {
    public static void main(String[] args) {
        
        String str = "";
        try (BufferedReader br = new BufferedReader(new FileReader("EscribirTexto.txt"))) {
            
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
