package UD03;
import java.util.Scanner;

public class Ejercicio05 {
    String dni;
    char letra;

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return this.letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Ejercicio05(String dni){
        this.dni = dni;
    }

    @Override
    public String toString(){

        System.out.println(+getLetra());
        return null;
    }
    public static void main(String[] args) {

        Ejercicio05 ejercicio05 = new Ejercicio05(null);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu DNI: ");
        ejercicio05.dni = entrada.nextLine();
        char letra = ejercicio05.dni.charAt(0);

        
        
        ejercicio05.toString();
        


    }
}