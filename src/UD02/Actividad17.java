package UD02;

public class Actividad17 {
    private String titular;
    private double cantidad;

    // Primer constructor sin cantidad inicial
    public Actividad17(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    // Segundo constructor con cantidad inicial
    public Actividad17(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos get y set
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método mostrarDatos
    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + cantidad);
    }

    // Método ingresar
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Método retirar
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad -= cantidad;
            }
        }
    }

    public static void main(String[] args) {
        // Crear instancias
        Actividad17 cuentaParticular1 = new Actividad17("TitularParticular1");
        Actividad17 cuentaEmpresa1 = new Actividad17("TitularEmpresa1", 1500.0);

        // Mostrar datos
        System.out.println("Titular de cuentaParticular1: " + cuentaParticular1.getTitular());
        System.out.println("Saldo de cuentaEmpresa1: " + cuentaEmpresa1.getCantidad());

        // Realizar transacciones
        cuentaParticular1.ingresar(1000.0);
        cuentaEmpresa1.retirar(500.0);

        // Mostrar datos después de transacciones
        System.out.println("\nDespués de transacciones:");
        cuentaParticular1.mostrarDatos();
        cuentaEmpresa1.mostrarDatos();
    }
}