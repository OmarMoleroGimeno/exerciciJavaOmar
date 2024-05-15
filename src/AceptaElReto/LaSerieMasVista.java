package AceptaElReto;

import java.util.HashMap;
import java.util.Scanner;

public class LaSerieMasVista {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cantidad = 0;
        Integer numMinutos = 1;
        String nombreSerie = "";
        

        while ((cantidad = tec.nextInt()) != 0 && ( cantidad > 1) && (cantidad <1000)) {
            HashMap<String, Integer> hash;
            tec.nextLine();
            hash = new HashMap<>();
            String[] series =  new String[cantidad];
            //Bucle para recorrer la información
            for (int i = 0; i < cantidad; i++) {
                series[i] = tec.nextLine();
                //Vemos a partir de que posición esta el primer espacio para luego separar los minutos de la serie
                int primerEspacio = series[i].indexOf(" ");
                /*Creamos un objeto integer para poder meterlo en el HashMap, y a este
                * Le pasamos los minutos vistos que serian desde el principio de la
                * cadena hasta el primer espacio*/

                numMinutos = Integer.parseInt(series[i].substring(0,primerEspacio));
                nombreSerie = series[i].substring(primerEspacio + 1);
    
                boolean encontrado = true;
                //Bucle para ver los caracteres de la cadena
                if(nombreSerie.length() <= 100){
                    for (int j = 0; j <nombreSerie.length(); j++) {
                        //Si el caracter es valido cambia el valor de encontrado
                        if (!((nombreSerie.charAt(j) > 64 && nombreSerie.charAt(j) < 91) ||
                            (nombreSerie.charAt(j) > 96 && nombreSerie.charAt(j) < 123) ||
                            (nombreSerie.charAt(j)) == 0)) {
                                encontrado = false;
                        }
                    }
                } else {
                    encontrado = false;
                }
                    
                if (hash.containsKey(nombreSerie) && encontrado) {
                    Integer aux = (hash.get(nombreSerie));
                    aux += numMinutos;
                    hash.put(nombreSerie, aux);
                } else if (encontrado  && numMinutos <= 200 && numMinutos > 0) {
                    hash.put(nombreSerie, numMinutos);
                }
            }
            System.out.println(hash);
        }
        tec.close();
    }
}