package UD02;

import java.util.Scanner;

public class Actividad11 {
    double kilometros;
    double litros;
    double vmed;
    double pgas;

    public Actividad11(){
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
        return this.litros *100  / this.pgas;
    }

    //Setters para actualizar la los kilometros, combustible usado, la velocidad media, euros de la gasolina
    public void setKms(double kms){
        this.kilometros = kms;
    }
    public void setLitros(double litros){
        this.litros = litros;
    }
    public void setVmed(double vmed){
        this.vmed = vmed;
    }
    public void setPgas(double pgas){
        this.pgas = pgas;
    }

    public static void main(String[] args) {

        //Usamos Scanner para guardar las siguientes variables
        Scanner entrada = new Scanner(System.in);
        Actividad11 actividad11 = new Actividad11();
        
        System.out.print("Introduce los kilometros totales recorridos: ");
        double kms = entrada.nextDouble();
        actividad11.setKms(kms);

        System.out.print("Introduce los litros de combustible usados: ");
        double litros = entrada.nextDouble();
        actividad11.setLitros(litros);

        System.out.print("Introduce la velocidad media del vehiculo durante el trayecto: ");
        double vmed = entrada.nextDouble();
        actividad11.setVmed(vmed);
        
        System.out.print("Introduce el precio en euros de la gasolina por litro: ");
        double pgas = entrada.nextDouble();
        actividad11.setPgas(pgas);

        System.out.printf("\nTiempo empleado en el viaje: %.2f horas", actividad11.getTiempo());
        System.out.printf("\nConsumo medio utilizado en litros/100 km es de: %.2f", actividad11.consumoMedio());
        System.out.printf("\nGasto en euros cada 100 km: %.2f euros", actividad11.consumoEuros());

        entrada.close();
    }
}
