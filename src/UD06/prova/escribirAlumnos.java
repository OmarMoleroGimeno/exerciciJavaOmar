package UD06.prova;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class escribirAlumnos {
    public static void main(String[] args) {
        //BufferedReader per a llegir en block
        try (BufferedReader br = new BufferedReader(new FileReader(new File("alumnos.txt")));
            //Per a introduir dades en un fitxer binari
            DataOutputStream dw = new DataOutputStream(new FileOutputStream("alumnosdaw.dat", true))) {
            String cadena;
            while ((cadena = br.readLine()) != null) {
                System.out.println("nia: " + cadena);
                String nombre = br.readLine();
                String apellidos = br.readLine();
                String curso = br.readLine();
                if (curso.indexOf("daw") != -1) {
                    //Escribint al binari
                    int nia = Integer.parseInt(cadena);
                    dw.writeInt(nia);
                    dw.writeUTF(nombre);
                    dw.writeUTF(apellidos);
                    dw.writeUTF(curso);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: no se encuentra el fitchero");
        } catch (IOException e) {
            System.out.println("Error: no se encuentra el fitchero");
        }
    }
}
