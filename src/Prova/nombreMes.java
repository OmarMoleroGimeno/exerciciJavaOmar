package Prova;
import java.util.Scanner;

public class nombreMes {

    public static String nomMes(int mes){

        String[] nombre = {"enero", "febrero", "marzo", "abril",
                            "mayo", "junio", "julio","agosto",
                            "septiembre", "octubre", "noviembre", "diciembre"};

        return nombre[--mes];
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int mes;

        System.out.print("introduce mes: ");
        mes = tec.nextInt();
        System.out.println(nomMes(mes));

        tec.close();
    }
}
