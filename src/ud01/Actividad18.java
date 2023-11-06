package ud01;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el importe en euros
        System.out.print("Ingrese el importe en euros: ");
        double importeEuros = scanner.nextDouble();

        // Definir los valores de los billetes
        int[] billetes = {500, 200, 100, 50, 20, 10, 5, 1};

        // Inicializar las variables para contar los billetes y la cantidad sobrante
        int[] billetesUtilizados = new int[billetes.length];
        double cantidadSobrante = importeEuros;

        // Iterar a través de los billetes para contar cuántos se necesitan
        for (int i = 0; i < billetes.length; i++) {
            if (cantidadSobrante >= billetes[i]) {
                billetesUtilizados[i] = (int)(cantidadSobrante / billetes[i]);
                cantidadSobrante %= billetes[i];
            }
        }

        // Imprimir el resultado
        System.out.println("Mínimo número de billetes:");
        for (int i = 0; i < billetes.length; i++) {
            if (billetesUtilizados[i] > 0) {
                System.out.println(billetesUtilizados[i] + " billetes de " + billetes[i] + " euros");
            }
        }

        System.out.println("Cantidad sobrante de euros: " + cantidadSobrante);

        // Cerrar el objeto Scanner
        scanner.close();

    }
    
}
