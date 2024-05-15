package UD05.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Actividad16 {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaFutura = fechaActual.plusYears(10).plusMonths(4).plusDays(5);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'del' yyyy");

        String fechaActualFormateada = fechaActual.format(formatter);
        String fechaFuturaFormateada = fechaFutura.format(formatter);

        System.out.println("Hoy es: " + fechaActualFormateada);
        System.out.println("Dentro de 10 años, 4 meses y 5 días será: " + fechaFuturaFormateada);
    }
}
