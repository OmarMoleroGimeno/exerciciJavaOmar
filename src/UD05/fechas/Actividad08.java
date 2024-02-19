package UD05.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Actividad08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la fecha inicial con formato dd/mm/yyyy: ");
        String fechaInicialStr = scanner.nextLine();
        LocalDate fechaInicial = LocalDate.parse(fechaInicialStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Introduce la fecha final con formato dd/mm/yyyy: ");
        String fechaFinalStr = scanner.nextLine();
        LocalDate fechaFinal = LocalDate.parse(fechaFinalStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Period periodo = Period.between(fechaInicial, fechaFinal);

        System.out.println("La fecha inicial es: " + fechaInicial);
        System.out.println("La fecha final es: " + fechaFinal);
        System.out.println("Entre la fecha inicial y la final hay un periodo de: " + periodo);
        System.out.println("dias: " + periodo.getDays());
        System.out.println("meses: " + periodo.getMonths());
        System.out.println("años: " + periodo.getYears());

        scanner.close();
    }
}
