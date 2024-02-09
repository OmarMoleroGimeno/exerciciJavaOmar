package AceptaElReto;
import java.util.Scanner;

public class sedeMundial {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String cadenaCompleta = null;

        System.out.print("Introduce el numero de votos");
        //recoje el numero de votos totales
        int i = tec.nextInt();
        tec.next();
        String[] array = new String[i+1];
        
        //Recojer toda la información, en un Srting para poder
        //introducir los nombres en un hash map con el metodo
        //.split de la clase String
        cadenaCompleta = tec.nextLine();

        //ponemos los nombres separados por un espacio en la array
        array = cadenaCompleta.split(" ");
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        
        tec.close();
    }
}