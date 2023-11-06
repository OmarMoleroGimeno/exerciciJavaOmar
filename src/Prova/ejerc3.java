package Prova;

import java.util.Scanner;

public class ejerc3 {
    private int original;
    private int rebajado;

    public  int descubrePorcentaje(int original, int rebajado){
        this.original = original;
        this.rebajado = rebajado;
        
        int operation = (100*((original-rebajado)/original));
        return operation;
    }



    public static void main(String[] args) {
        ejerc3 ejerc3 = new ejerc3();
        

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el precio original: ");
        int original = entrada.nextInt();
        System.out.println("Introduce el precio rebajado: ");
        int rebajado = entrada.nextInt();

        
        System.out.println("El porcentaje aplicado es del: "+ejerc3.descubrePorcentaje(original, rebajado));
        entrada.close();
        
    }
}
