package UD06.prova;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ordenarAlumnos {

    //Método per a contar els elements q hi han i fer una array de eixa llongitud
    public static int longitudArray(alumnos[] lista) {
        int cont = 0;
        //BufferedReader per a llegir en block
        try (DataInputStream di = new DataInputStream(new FileInputStream("alumnosdaw.dat"))) {
            while (true) {
                di.readInt();
                di.readUTF();
                di.readUTF();
                di.readUTF();
                cont++;
            }
        } catch (EOFException e) {
            //per a tratar lúltim byte
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: no se encuentra el fitchero");
        } catch (IOException e) {
            System.out.println("Error: no se encuentra el fitchero");
        }
        return cont;
    }

    public void ordenarLista(alumnos[] lista){

        //Bucle per a canviar la posició mínima
        for (int i = 0; i < lista.length-1; i++) {
            int posMin = lista[i].getNia();

            //Bucle per a comparar les posicions
            for (int j = i+1; j < lista.length; j++) {
                if (lista[j].getNia()<lista[posMin].getNia()) {
                    posMin = j;
                }
                //Al guardar la información de la pos min necessitamos un aux para cambiar la pos min
                alumnos aux = lista[posMin];
                lista[posMin] = lista[j];
                lista[j] = aux;
            } 
        }
    }

    public static String mostrar(alumnos[] lista){
        String str = "";
        for (int i = 0; i < lista.length; i++) {
            str += "\n"+lista[i];
        }
        return str;
    }
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        try (DataInputStream fin = new DataInputStream(
                                    new BufferedInputStream(
                                        new FileInputStream("alumnons.txt")))) {
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: no se encuentra el fitchero");
        } catch (IOException e) {
            System.out.println("Error: no se encuentra el fitchero");
        }
    }
}