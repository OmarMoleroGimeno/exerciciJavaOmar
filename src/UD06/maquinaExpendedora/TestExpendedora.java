package UD06.maquinaExpendedora;

import UD06.maquinaExpendedora.Expendedora.CreditoInsuficienteException;
import UD06.maquinaExpendedora.Expendedora.NoHayCambioException;
import UD06.maquinaExpendedora.Expendedora.NoHayProductoException;

public class TestExpendedora {
    public static void main(String[] args) {
        Expendedora expendedora1 = new Expendedora(5, 12, 3.75);
        Expendedora expendedora2 = new Expendedora(20, 12, 2);
        Expendedora expendedora3 = new Expendedora(30, 0, 3);
        Expendedora expendedora4 = new Expendedora(0, 20, 1);
        System.out.println("\n**Máquina expendedora 1**");
        System.out.println(expendedora1);

        System.out.println("******");
        expendedora1.introducirDinero(5);
        System.out.println(expendedora1);

        System.out.println("******");
        try {
            expendedora1.comprarProducto(0);
        } catch (NoHayCambioException | NoHayProductoException | CreditoInsuficienteException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(expendedora1);

        System.out.println("******");
        System.out.println("Máquina 2");
        System.out.println(expendedora2);
        System.out.println("******");
        System.out.println("Introducir dinero");
        expendedora2.introducirDinero(2);
        System.out.println(expendedora2);
        System.out.println("******");
        System.out.println("Devolución");
        expendedora2.solicitarDevolucion();
        System.out.println(expendedora2);

        System.out.println("******");
        System.out.println("Ingreso del dinero");
        expendedora2.introducirDinero(1);
        System.out.println(expendedora2);
        System.out.println("******");
        System.out.println("Compra sin saldo uficiente");
        try {
            expendedora2.comprarProducto(0);
        } catch (NoHayCambioException | NoHayProductoException | CreditoInsuficienteException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(expendedora2);

        System.out.println("******");
        System.out.println("Máquina 3");
        System.out.println(expendedora3);
        System.out.println("******");
        System.out.println("Ingreso del dinero");
        expendedora3.introducirDinero(3);
        System.out.println(expendedora3);
        System.out.println("******");
        System.out.println("Compramos sin stock");
        try {
            expendedora3.comprarProducto(0);
        } catch (NoHayCambioException | NoHayProductoException | CreditoInsuficienteException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(expendedora3);

        System.out.println("******");
        System.out.println("Máquina 4");
        System.out.println(expendedora4);
        System.out.println("******");
        System.out.println("Ingreso del dinero");
        expendedora4.introducirDinero(3);
        System.out.println(expendedora4);
        System.out.println("******");
        System.out.println("Compramos sin cambio");
        try {
            expendedora4.comprarProducto(0);
        } catch (NoHayCambioException | NoHayProductoException | CreditoInsuficienteException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(expendedora4);


    }
}
