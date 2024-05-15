package programame;

import java.util.Scanner;

public class ProblemaB {

    public static int contar0(String cadena){
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 1) {
                cont++;
            }
        }
        return cont;
    }

    public static int contar1(String cadena){
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int cant;
        boolean comprovado = false;
        String str = "";

        //Nombre cadenes
        cant = tec.nextInt();
        tec.nextLine();
        //Introduccio de cadenes
        for (int i = 0; i <= cant; i++) {
            str = tec.nextLine();
            if ((str.length()%2) == 0) {
                //Bucle per a veure la cadena si es cap i cua
                for (int j = 0; j < str.length()/2; j++) {
                    if (str.charAt(j) != (str.charAt(str.length() - (j+1)))) {
                        comprovado = true;
                    }
                }
                if (comprovado) {
                    String primeraParte = str.substring(0, (str.length()/2));
                    String segundaParte = str.substring(str.length()/2);
                    if (contar0(primeraParte) == contar0(segundaParte) && contar1(primeraParte) == contar1(segundaParte)) {
                        System.out.println("EQUILIBRADA");
                    }
                }
            } else{
                System.out.println("ERROR");
            }
            
        }
        tec.close();
    }
}