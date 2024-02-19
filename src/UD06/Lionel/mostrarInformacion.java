package UD06.Lionel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mostrarInformacion {

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException{
        
        if (!ruta.exists()) {
            throw new FileNotFoundException();
        }
        if (ruta.isFile()) {
            System.out.println("Nombre del archivo: " + ruta.getName());
        } else {
            File[] lista = ruta.listFiles();

            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isDirectory()) {
                    System.out.println("[*] " + lista[i].getName());
                }
            }

            for (int j = 0; j < lista.length; j++) {
                if (!lista[j].isDirectory()) {
                    System.out.println("[4] " + lista[j].getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String rutaIntroducida = "";
        do {
            try {
                System.out.println("Introduce la ruta del documento/carpeta");
                rutaIntroducida = tec.nextLine();
                if (!rutaIntroducida.equals("")) {
                    File f = new File(rutaIntroducida);
                    muestraInfoRuta(f);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (!rutaIntroducida.equals(""));
        tec.close();
    }
}
