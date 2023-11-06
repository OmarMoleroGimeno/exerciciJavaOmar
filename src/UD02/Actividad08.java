package UD02;

import java.util.Scanner;

public class Actividad08 {
    private double valor;

    public Actividad08(){
        this.valor = 0.0;
    }
    public Actividad08(double valor){
        this.valor = valor;
    }
    public double millasAMetros(){
        return valor *1852;
    }
    public double millasAKilometros(){
        return valor *1.852;
    }

    public static void main(String[] args) {
        double millas;

        Scanner calculo = new Scanner(System.in);
        System.out.print("Introduce el valor en millas: ");
        millas = calculo.nextDouble();

        //Creamos un objeto llamado actividad para guardar la variable en millas i passarlo por los métodos de la classe Sctividad08
        Actividad08 actividad = new Actividad08(millas);
        new Actividad08(millas);
        System.out.println("Esto es lo que equivale en kilometros: "+ actividad.millasAKilometros()+" km");
        System.out.println("Esto es lo que equivale en metros: "+actividad.millasAMetros()+" m");
        calculo.close();
    }

}
