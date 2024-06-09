package UD07.exercicios._09_sistemaAnalisisTextos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Prova.prueba;

public class AnalizadoDeTexto {
    private String texto;
    private HashMap<String, Integer> listaPalabras;

    public AnalizadoDeTexto(String texto) {
        this.texto = texto;
        this.listaPalabras = new HashMap<>();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public HashMap<String, Integer> getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(HashMap<String, Integer> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

    //método que procese el texto, cuente la frecuencia de cada palabra y 
    //almacene los resultado en el atributo palabras. Ignora las diferencias 
    //entre mayúsculas y minúsculas.
    public void contarPalabras(){
        String[] palabras = this.texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i].toLowerCase();
            if(this.listaPalabras.containsKey(palabra)){
                int numRep = this.listaPalabras.get(palabra) + 1;
                this.listaPalabras.put(palabra, numRep);
            } else {
                this.listaPalabras.put(palabra, 1);
            }
        }
    }

    // método que devuelva una lista de las n palabras más frecuentes en 
    //ele texto, junto con su frecuencia.
    // public HashMap<String, Integer> palabrasMasFrecuentes(int n){
    //     HashMap<String, Integer> palabrasMasFrecuentes = new HashMap<>();
    //     Integer[] todasLasRepeticiones = new Integer[this.listaPalabras.size()];
    //     String[] listaOrdenada = new String[this.listaPalabras.size()];
    //     int cont = 0;
    //     for (Map.Entry<String, Integer> entry : this.listaPalabras.entrySet()) {
    //         todasLasRepeticiones[cont] = entry.getValue();
    //         cont++;
    //     }
        
        
    // }

    public static void main(String[] args) {
        AnalizadoDeTexto an = new AnalizadoDeTexto("Hola ola hola hola");
        an.contarPalabras();
        System.out.println(an.getListaPalabras());
    }

}