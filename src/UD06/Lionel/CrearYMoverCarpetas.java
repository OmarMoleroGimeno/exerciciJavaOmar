package UD06.Lionel;

import java.io.File;

public class CrearYMoverCarpetas {

    public static void moverCarpeta(File ubicacionFinal, File ubicacionActual){
        String str = "";
        char aux = 'A';
        if(ubicacionActual.renameTo(ubicacionFinal)){
            System.out.println("Operación con éxito");
            str = ubicacionFinal.getPath();
        } else {
            System.out.println("ERROR");
        }

        for (int i = 0; i < 25; i++) {
            File carpeta = new File(str + "\\" + aux);
            aux++;
        }
    }
}