package UD02;

/*. Actividad 04 - Realiza una clase finanzas que convierta dólares a euros y viceversa. Codifica
los métodos dolaresToEuros y eurosToDolares . Prueba que dicha clase funciona
correctamente haciendo conversiones entre euros y dólares.*/

public class Actividad04 {
    
    private double cambioDolarEuro;

    // Constructor por defecto que establece el cambio Dólar-Euro en 1.02
    public Actividad04() {
        this.cambioDolarEuro = 1.02;
    }

    // Constructor que permite configurar el cambio Dólar-Euro a una cantidad personalizada
    public Actividad04(double cambio) {
        this.cambioDolarEuro = cambio;
    }

    // Método para convertir dólares a euros
    public double dolaresToEuros(double dolares) {
        return dolares / cambioDolarEuro;
    }

    // Método para convertir euros a dólares
    public double eurosToDolares(double euros) {
        return euros * cambioDolarEuro;
    }

    public static void main(String[] args) {
        // Crear una instancia de Finanzas con el constructor por defecto
        Actividad04 finanzas1 = new Actividad04();

        // Convertir 100 dólares a euros
        double euros1 = finanzas1.dolaresToEuros(100);
        System.out.println("100 dólares equivalen a " + euros1 + " euros.");

        // Crear una instancia de Finanzas con un cambio personalizado (1.05)
        Actividad04 finanzas2 = new Actividad04(1.05);

        // Convertir 100 dólares a euros usando el cambio personalizado
        double euros2 = finanzas2.dolaresToEuros(100);
        System.out.println("100 dólares equivalen a " + euros2 + " euros.");

        // Convertir 100 euros a dólares usando el cambio personalizado
        double dolares = finanzas2.eurosToDolares(100);
        System.out.println("100 euros equivalen a " + dolares + " dólares.");
    }
}
    
    
