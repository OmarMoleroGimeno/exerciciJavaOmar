package AceptaElReto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sedeMundial {


    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numVotos;
        String ganador = "";
        
        //recoje el numero de votos totales y vemos que no sea 0 y este entre 1 y 10000
        while (((numVotos = tec.nextInt()) >= 1 && numVotos <=10000)) {

            String pais = "";
            int numero = 0;
            int max = 0;
            tec.nextLine();
            //Array donde vamos a guardar los nombres, separandolos por "-"
            String[] listaPaises = tec.nextLine().split(" ");
            //Hash map para guardar los nombres de paises y la cantidad que aparecen
            HashMap<String, Integer> hash = new HashMap<>();

            /*Bucle para recorrer la array i ver si el valor ya esta en el hashmap,
            * si ya esta se incrementa la clave y se elimina ese dato y se introduce
            * el mismo dato con el numero incrementado, y si no esta se añade*/
            for (int i = 0; i < listaPaises.length; i++) {
                ganador = "";
                boolean encontrado = true;
                //Bucle para ver los caracteres de la cadena
                if(listaPaises[i].length() <= 40){
                    for (int j = 0; j < listaPaises[i].length(); j++) {
                        //Si el caracter es valido cambia el valor de encontrado
                        if (!((listaPaises[i].charAt(j) > 64 && listaPaises[i].charAt(j) < 91) ||
                            (listaPaises[i].charAt(j) > 96 && listaPaises[i].charAt(j) < 123) ||
                            listaPaises[i].charAt(j) == 45)) {
                                encontrado = false;
                        }
                    }
                }
                
                if (hash.containsKey(listaPaises[i]) && encontrado) {
                    Integer aux = (hash.get(listaPaises[i]));
                    aux++;
                    hash.remove(listaPaises[i]);
                    hash.put(listaPaises[i], aux);
                } else if (encontrado) {
                    hash.put(listaPaises[i], 1);
                }
            }

            /*For each para recorrer el hashmap y poder determinar que pais
            tiene más botos*/
            for (Map.Entry<String, Integer> entry : hash.entrySet()) {
                pais = entry.getKey();
                numero = entry.getValue();

                if (max == numero) {
                    ganador = "EMPATE";
                } else if (numero>max) {
                    max = numero;
                    ganador = pais;
                }
            }
            System.out.println(ganador);
        }
        tec.close();
    }
}