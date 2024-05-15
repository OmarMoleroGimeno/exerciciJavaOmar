package UD06.Lionel;

import java.io.File;
import java.util.Scanner;

public class Renombrar {

    /*Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS quitándole
    la extensión. Por ejemplo, astronauta.jpg pasará a llamarse astronauta .*/
    public static void quitarExtension(File archivoViejo){

        File[] lista = archivoViejo.listFiles();

            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isFile()) {
                    
                    //Agarre el nom en la extensió
                    String nombre = lista[i].getName();
                    //Cree una array per a separar el nom de la extensió
                    String[] array = nombre.split("\\.");
                    //Li asigne el nom sense extensió a una variable
                    nombre = array[0];
                    //Creee un objecte File auxiliar per a renombrar
                    File aux = new File(nombre);
                    //Canvie el nom
                    lista[i].renameTo(aux);
                    System.out.println("[A] " + lista[i].getName());
                }
            }
    }

    /*Cambiar el nombre de la carpeta Documentos a DOCS , el de la carpeta Fotografias a
    FOTOS y el de la carpeta Libros a LECTURAS .*/
    public static void renombrar(File archivoNuevo ,File archivoViejo){

        if(archivoViejo.renameTo(archivoNuevo)){
            System.out.println("Operación con éxito");
        } else {
            System.out.println("ERROR");
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String str = "clase";
        File archivoViejo = new File(str);

        System.out.print("introduce el nuevo nombre: ");
        str = tec.nextLine();
        File archivoNuevo = new File(str);

        renombrar(archivoNuevo, archivoViejo);
        quitarExtension(archivoViejo);


        tec.close();
    }
}
