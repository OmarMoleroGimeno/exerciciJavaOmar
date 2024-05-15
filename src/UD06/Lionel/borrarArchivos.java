package UD06.Lionel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class borrarArchivos {

    public static boolean borraTodo(File f) throws FileNotFoundException{

        boolean borrado = false;
        if (!f.exists()) {
            throw new FileNotFoundException();
        } else {
            if (f.isDirectory()) {
                File[] lista= f.listFiles();
                for (int i = 0; i < lista.length; i++) {
                    borraTodo(lista[i]);
                }
                f.delete();
            } else {
                f.delete();
                borrado = true;
            }
        }
        return borrado;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce la ruta donde quieres eliminar el arcchivo/directorio: ");
        File f = new File(tec.nextLine());
        borraTodo(f);
        tec.close();
    }
}