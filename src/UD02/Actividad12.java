package UD02;

import java.util.Scanner;

public class Actividad12 {
    int kgPatatas;
    int kgCarne;

    public Actividad12(){
        this.kgPatatas = 0;
        this.kgCarne = 0;
    }

    public void setKgPatatas(int kgPatatas) {
        this.kgPatatas = kgPatatas;
    }

    public void setKgCarne(int kgCarne) {
        this.kgCarne = kgCarne;
    }

    public int calcularClientesAtendidos(int kgPatatas, int kgCarne) {

        // Calcular cuántos clientes pueden ser atendidos
        int clientesAtendidos = Math.min(kgPatatas / 2, kgCarne);
        clientesAtendidos = Math.min(clientesAtendidos, (kgPatatas / 2) * 3);

        return clientesAtendidos;
    }


    public static void main(String[] args){

        Actividad12 actividad12 = new Actividad12();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la cantidad en kg de patatas: ");
        int kgPatatas = entrada.nextInt();
        actividad12.setKgPatatas(kgPatatas);
        
        System.out.print("Introduce la cantidad en kg de carne: ");
        int kgCarne = entrada.nextInt();
        actividad12.setKgCarne(kgCarne);

        
        System.out.println("El restaurante puede atender a "+ actividad12.calcularClientesAtendidos(kgPatatas, kgCarne)+" clientes");

        entrada.close();

    }
}


