package programame;

import java.util.Scanner;

public class PA {

    public static boolean comprobarCadena(String cadenaNums, int[] numeros){
        boolean vale = true;
        String[] numerosCadena = cadenaNums.split(" ");
        for (int i = 0; i < numerosCadena.length; i++) {
            numeros[i] = Integer.parseInt(numerosCadena[i]);
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            
            //Si el numero es positivo
            if (numeros[i] > 0) {
                //Comprobamos si el numero es mayor al que le sigue o el valor absoluto del segundo es menor al primero o que el siguiente sea negativo
                if (numeros[i] > numeros[i + 1] || Math.abs(numeros[i + 1]) < Math.abs(numeros[i]) || (numeros[i + 1] > 0 && numeros[i + 1] > numeros[i])) {
                    vale = false;
                }
            }
            //Si el numero es negativo
            else {
                //Comprobamos si el numero es menor al de despues o que el siguiente sea positivo
                if (numeros[i] < numeros[i + 1] || Math.abs(numeros[i + 1]) > Math.abs(numeros[i]) || (numeros[i + 1] < 0 && numeros[i + 1] < numeros[i])) {
                    vale = false;
                }
            }
        }

        return vale;
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Cantitat de casos a realitzar
        int cantDeCasos = tec.nextInt();
        tec.nextLine();

        //Bucle per a saber quants numeros anem a fer en cada iteració
        for (int i = 0; i < cantDeCasos; i++) {
            int cantDeNums = tec.nextInt();
            tec.nextLine();
            String cadenaNums = tec.nextLine();
            int[] numeros = new int[cantDeNums];

            System.out.println(comprobarCadena(cadenaNums, numeros) ? "CORRECTA" : "INCORRECTA");
        }

        tec.close();
    }
}
