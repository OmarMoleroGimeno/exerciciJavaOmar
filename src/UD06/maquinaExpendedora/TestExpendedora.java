package UD06.maquinaExpendedora;

public class TestExpendedora {
    public static void main(String[] args) {
        Expendedora expendedora1 = new Expendedora(5, 12, 3);
        System.out.println("\n*****Máquina expendedora 1*****");
        System.out.println(expendedora1);

        System.out.println("******************");
        expendedora1.introducirDinero(5);
        System.out.println(expendedora1);

        System.out.println("******************");
        

    }
}
