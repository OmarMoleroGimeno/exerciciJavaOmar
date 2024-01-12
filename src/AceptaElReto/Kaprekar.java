package AceptaElReto;
import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {
    
    //metodo para invertir la array
    public static int convertirArrayInv(int[] v){
        //variable para introducir el numero invertido de la array
        int resu = 0;
        //bucle para sacar los numeros de la array i ponerlos invertidos, jugando con el 10 elevado
        for (int i = 0; i < v.length; i++) {
            resu+=v[i]*(Math.pow(10, i));
        }
        
        return resu;
    }

    //metodo para converit la array a número
    public static int convertirArray(int[] v){
        int resu = 0;
        int cont = 0;
        
        for (int i = v.length-1; i >= 0; i--) {
            resu+=v[i]*(Math.pow(10, cont));
            cont++;
        }
        return resu;
    }

    //método para convertir el número a array
    public static int[] convertirNumeroAArray(int numero) {

        // Crear un array para almacenar los dígitos
        int[] arrayDeDigitos = new int[4];

        // Llenar el array con los dígitos del número
        for (int i = 4 - 1; i >= 0; i--) {
            arrayDeDigitos[i] = numero % 10;
            numero /= 10;
        }

        return arrayDeDigitos;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[] numIni= new int[4];
        
        
        System.out.println("introduce el numero");
        int num = tec.nextInt();
        
        if (num == 6174) {
            System.out.println("0");
        }else{
            numIni = convertirNumeroAArray(num);
            Arrays.sort(numIni);
            int ini = convertirArrayInv(numIni);
            int inv = convertirArray(numIni);
            int cont = 0;
        do {
            //metodo de Arrays sort para ordenar la array de menor a mayor
            Arrays.sort(numIni);
            //llamada al método para convertir la array
            ini = convertirArray(numIni);
            //llamada al método para invertir la array
            inv = convertirArrayInv(numIni);
            
            ini = inv - ini;
            //hay que tener en cuenta que al dar la resta menos de 4 números hay que tener en cuenta el 0 para la ordenación del número
            if (ini <= 999) {
                ini = ini*10;
            } else if(ini <= 99){
                ini = ini*100;
            }else if(ini <= 9){
                ini = ini*1000;
            }

            System.out.println(ini);
                cont++;
            } while (ini != 6174);
            System.out.println(cont);
        }
        tec.close();
    }
}