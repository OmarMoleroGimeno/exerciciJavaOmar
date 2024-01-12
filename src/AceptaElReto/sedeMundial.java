package AceptaElReto;
import java.util.Scanner;

public class sedeMundial {


    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce el numero de votos");
        //recoje el numero de votos totales
        int i = tec.nextInt();
        //Creamos una array con los votos totales
        String[] paises = new String[i];
        tec.nextLine();

        //Bucle para poner los paises
        System.out.println();
        for (int j = 0; j < i; j++) {
            paises[j] = tec.nextLine();
        }

        //Array para guardar los paises concursantes
        String [] concursantes = new String[i];

        //Bucle para guardar los paises
        boolean cont = false;
        for (int j = 0; j < paises.length; j++) {
            for (int k = 0; k < concursantes.length; k++) {
                if (paises[j].equals(concursantes[k])) {
                    cont = true;
                    if (cont = true) {
                        j++;
                        cont = false;
                    }
                } else {
                    String aux = null;
                    aux = paises[j] ;
                    concursantes [k] = aux;
                }
            }

        System.out.println();
        }
        
        //Para mostrar
        for (int j = 0; j < concursantes.length; j++) {
            System.out.println(concursantes[j]);
        }

        tec.close();
    }
}
