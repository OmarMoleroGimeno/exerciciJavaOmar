package UD02;

import java.util.Scanner;

public class Actividad07 {
    //Variables
    private double pesoEnKg;

    //Contstructor que iguala a 0
    public Actividad07(){
        pesoEnKg = 0;
    }

    //Constructor
    public Actividad07(double pesoEnKg){
        this.pesoEnKg = pesoEnKg;
    }

    public double getLibras(){
        return this.pesoEnKg /0.453;
    }

    //Hacemos get/return de Lingotes
    public double getLingotes(){
        return this.pesoEnKg /14.59;
    }

    public Double getPeso(String unidad){

        if (unidad.equals("Kg")) {
        return this.pesoEnKg;
        } else if(unidad.equals("Lb")) {
        return this.getLibras();
        } else if (unidad.equals("Li")) {
        return this.getLingotes();
        } else if (unidad.equals("Oz")){
        return this.pesoEnKg / 0.02835;
        } else if (unidad.equals("P")){
        return this.pesoEnKg / 0.00155;
        } else if (unidad.equals("G")) {
        return this.pesoEnKg * 1000;
        } else if (unidad.equals("Q")){
        return this.pesoEnKg / 43.3;
        } else {
        System.out.println("no has introducido una unidad correcta.");
        return 0.0;}
    }

    public static void main(String[] args) {

        //Creacion de variables
        double pesoEnKg;
        String unidad;
        
        //Scanner para capturar información y guardarla en la variable pesoEnKg1
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nAñade el peso en kilogramos: ");
        pesoEnKg = entrada.nextDouble();
        Actividad07 masa = new Actividad07(pesoEnKg);

        //Otro Scanner para capturar en que unidad quiere el resultado
        System.out.println("\nAñade la unidad elegida: Kg(Kg), Lb(Lb), Lingotes(Li), Onzas(O), Peniques(P) y Quintales(Q)");
        unidad = entrada.next();

        System.out.println("\nEste seria el peso en kilogramos" + masa.pesoEnKg+" Kg");
        System.out.printf("El peso en %s es: %.2f %s\n", unidad, masa.getPeso(unidad), unidad);
        entrada.close();
    }
}
