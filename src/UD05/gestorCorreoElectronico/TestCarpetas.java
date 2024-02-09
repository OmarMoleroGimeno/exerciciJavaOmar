package UD05.gestorCorreoElectronico;

import UD05.gestorCorreoElectronico.Carpeta.ElementoNoEncotradoException;
import UD05.gestorCorreoElectronico.Carpeta.ListaLlenaException;

public class TestCarpetas {
    public static void main(String[] args) {
        Carpeta c1 = new Carpeta("Mensajes recibidos");
        Carpeta c2 = new Carpeta("Mensajes eliminados respectivamente");

        Mensaje m1 = new Mensaje("Kiney@gmail.com", "Arnau", "PR", "Sas fer l'activitat 1?");
        Mensaje m2 = new Mensaje("Arnau@gmail.com", "Kiney", "PR", "No :(");

        try {
            c1.añadir(m1);
            c1.añadir(m2);
        } catch (ListaLlenaException e) {
        }

        
        try {
            c1.moverMensaje(c1, c2, 1);
        } catch ( ListaLlenaException e) {
        } catch (ElementoNoEncotradoException e) {
        }

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        

    }
}
