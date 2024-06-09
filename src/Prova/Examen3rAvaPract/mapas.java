package Prova.Examen3rAvaPract;

import java.util.ArrayList;
import java.util.HashMap;

public class mapas {
    
    public static HashMap juntarDosListas(ArrayList<Integer> numeros, ArrayList<String> noms){
        if (numeros.size() >= noms.size()) {
            HashMap<Integer, String> listaCompleta = new HashMap<>();
            for (int i = 0; i < numeros.size(); i++) {
                listaCompleta.put(numeros.get(i), noms.get(i));
            }
            return listaCompleta;
        } else {
            HashMap<String, Integer> listaCompleta = new HashMap<>();
            for (int i = 0; i < noms.size(); i++) {
                listaCompleta.put(noms.get(i), numeros.get(i));
            }
            return listaCompleta;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        ArrayList<String> noms = new ArrayList<>();
        noms.add("Omar");
        noms.add("Arnau");
        noms.add("Alex");
        noms.add("Jorge");
        noms.add("Marco");

        System.out.println(juntarDosListas(numeros, noms));
    }
}