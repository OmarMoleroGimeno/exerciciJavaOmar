package UD06.prova;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leerAlumno {
    public static void main(String[] args) {

        //BufferedReader per a llegir en block
        try (BufferedReader br = new BufferedReader(new FileReader(new File("alumnos.txt")))) {
            String cadena;
            int cont = 0;
            while ((cadena = br.readLine()) != null) {
                System.out.println("Alumno " + (++cont) + ":");
                System.out.println("nia: " + cadena);
                System.out.println("Nombre: " + br.readLine());
                System.out.println("Apellidos: " + br.readLine());
                System.out.println("Curso: " + br.readLine());
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: no se encuentra el fitchero");
        } catch (IOException e) {
            System.out.println("Error: no se encuentra el fitchero");
        }
    }
}
