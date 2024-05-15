package UD07.exercicios.Varios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Varios {

    public static int[] quitarDuplicados (int[] v){

        TreeSet<Integer> ts = new TreeSet<>();
        for (int item : v) {
            ts.add(item);
        }

        int[] arraySinDuplicados = new int[ts.size()];
        
        int cont = 0;
        for (int i : ts) {
            arraySinDuplicados[cont++] = i;
        }
        return arraySinDuplicados;
    }

    public static int[] union1(int[] v1, int[] v2){

        TreeSet<Integer> ts = new TreeSet<Integer>();
        for (int item : v1) {
            ts.add(item);
        }

        for (int item : v2) {
            ts.add(item);
        }

        int[] arraySinDuplicados = new int[ts.size()];
        
        int cont = 0;
        for (int i : ts) {
            arraySinDuplicados[cont++] = i;
        }
        return arraySinDuplicados;
    }

    public static int[] unión2(int v1[], int v2[]){

        ArrayList<Integer> al = new ArrayList<>();
        for (Integer item : v1) {
            al.add(item);
        }

        for (Integer item : v2) {
            al.add(item);
        }

        int[] lista = new int[al.size()];
        int cont = 0;
        for (int i : al) {
            lista[cont++] = i;
        }

        return lista;
        
    }

    public static int[] interseccion(int v1[], int v2[]){

        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();

        for (Integer item1 : v1) {
            hs1.add(item1);
        }

        for (Integer item2 : v2) {
            hs2.add(item2);
        }

        hs1.retainAll(hs2);
        int[] lista = new int[hs1.size()];
        int cont = 0;
        for (int i : hs1) {
            lista[cont++] = i;
        }

        return lista;
    }

    public static int[] diferencia1 (int v1[], int v2[]){
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (Integer item1 : al1) {
            al1.add(item1);
        }
        for (Integer item2 : al2) {
            al2.add(item2);
        }
        al1.removeAll(al2);
        int cont = 0;
        int[] lista = new int[al1.size()];
        for (int i : al1) {
            lista[cont++] = i;
        }
        return lista;
    }

    public static int[] diferencia2 (int v1[], int v2[]){
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for (Integer integer : v1) {
            hs1.add(integer);
        }
        for (Integer integer : v2) {
            hs2.add(integer);
        }
        hs1.remove(hs2);
        int cont = 0;
        int[] lista = new int[hs1.size()];
        for (int i : hs1) {
            lista[cont++] = i;
        }
        return lista;
    }

}
