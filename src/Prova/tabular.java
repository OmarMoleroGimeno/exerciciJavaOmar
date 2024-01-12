package Prova;

public class tabular {
    public static void main(String[] args) {
        // Datos para tabular
        String nombre1 = "Alice";
        int edad1 = 25;
        double salario1 = 50000.50;

        String nombre2 = "Bob";
        int edad2 = 30;
        double salario2 = 60000.75;

        // Imprimir encabezados de la tabla
        System.out.printf("%-10s %-5s %-10s\n", "Nombre", "Edad", "Salario");
        System.out.println("----------------------------------");

        // Imprimir datos tabulados
        System.out.printf("%-10s %-5d %-10.2f\n", nombre1, edad1, salario1);
        System.out.printf("%-10s %-5d %-10.2f\n", nombre2, edad2, salario2);
    }
}
