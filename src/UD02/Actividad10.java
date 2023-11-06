package UD02;

import java.util.Scanner;

public class Actividad10 {
    private double kilometros;
    private double litros;
    private double vmed;
    private double pgas;

    public Actividad10(){
        this.kilometros = 0.0;
        this.litros = 0.0;
        this.vmed = 0.0;
        this.pgas = 0.0;
    }

    public Actividad10(double kilometros, double litros, double vmed, double pgas){
        this.kilometros = kilometros;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    //Método para obtener el tiempo del viaje
    public double getTiempo(){
        return this.kilometros / this.vmed;
    }

    //Método para obtener el consumo medio del viaje cada 100km
    public double consumoMedio(){
        return (this.litros / this.kilometros)*100;
    }

    //Método para obtener el gasto en euros de la gasolina del viaje cada 100km
    public double consumoEuros(){
        return (this.litros *pgas * 100);
    }

    public static void main(String[] args) {

        //Usamos Scanner para guardar las siguientes variables
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce los kilometros totales recorridos: ");
        double kilometros = entrada.nextDouble();
        System.out.print("Introduce los litros de combustible usados: ");
        double litros = entrada.nextDouble();
        System.out.print("Introduce la velocidad media del vehiculo durante el trayecto: ");
        double vmed = entrada.nextDouble();
        System.out.print("Introduce el precio en euros de la gasolina por litro: ");
        double pgas = entrada.nextDouble();

        //Ejemplo de uso de la clase Actividad10
        Actividad10 actividad10 = new Actividad10(kilometros, litros, vmed, pgas);
        System.out.println();
        System.out.println("Tiempo empleado en el viaje: " + actividad10.getTiempo() + " horas");
        System.out.println("Consumo medio utilizado es de: " + actividad10.consumoMedio() + " litros/100 km");
        System.out.println("Gasto en euros cada 100 km: " + actividad10.consumoEuros() + " euros");

        entrada.close();

    }
}
