package UD02;

import java.util.Scanner;

public class Actividad13 {
    int kgPatatas;
    int kgCarne;

    public Actividad13(){
        this.kgPatatas = 0;
        this.kgCarne = 0;
    }

    public void setKgPatatas(int kgPatatas) {
        this.kgPatatas = kgPatatas;
    }

    public void setKgCarne(int kgCarne) {
        this.kgCarne = kgCarne;
    }
    public void addCarne(int x){
        this.kgCarne += x;
    }
    public void addPatatas(int y){
        this.kgPatatas += y;
    }
    public int calcularClientesAtendidos(int y, int x) {

        // Calcular cuántos clientes pueden ser atendidos
        int clientesAtendidos = Math.min(y / 2, x);
        clientesAtendidos = Math.min(clientesAtendidos, (y / 2) * 3);

        return clientesAtendidos;
    }


    public static void main(String[] args){

        Actividad13 actividad13 = new Actividad13();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la cantidad en kg de patatas: ");
        int kgPatatas = entrada.nextInt();
        actividad13.setKgPatatas(kgPatatas);
        
        System.out.print("Introduce la cantidad en kg de carne: ");
        int kgCarne = entrada.nextInt();
        actividad13.setKgCarne(kgCarne);

        System.out.print("Añade mas kg de carne: ");
        int x = entrada.nextInt();
        actividad13.addCarne(x);

        System.out.print("Añade mas kg de patatas: ");
        int y = entrada.nextInt();
        actividad13.addPatatas(y);

        System.out.println("El restaurante puede atender a "+ actividad13.calcularClientesAtendidos(y, x)+ " clientes");

        entrada.close();

    }
}
