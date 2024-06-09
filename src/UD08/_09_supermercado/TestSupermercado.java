package UD08._09_supermercado;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestSupermercado {
    public static void main(String[] args) {

        Cereales cereal1 = new Cereales("Kellogg's", 4.99, "maíz");
        cereal1.setCaducidad(LocalDate.of(2025, 6, 1));

        Cereales cereal2 = new Cereales("Nestlé", 5.49, "trigo");
        cereal2.setCaducidad(LocalDate.of(2025, 9, 15));

        Cereales cereal3 = new Cereales("General Mills", 3.99, "espelta");
        cereal3.setCaducidad(LocalDate.of(2024, 12, 31));

        Detergente detergente1 = new Detergente("Ariel", 10.99);
        detergente1.setDescuento(8.99);
        detergente1.setVolumen(2.0);
        detergente1.setTipoEnvase("Plástico");

        Detergente detergente2 = new Detergente("Tide", 11.49);
        detergente2.setDescuento(9.49);
        detergente2.setVolumen(1.5);
        detergente2.setTipoEnvase("Cartón");

        Vino vino1 = new Vino("Torres", "Tinto", 13.5, 15.99);
        vino1.setCaducidad(LocalDate.of(2026, 12, 31));
        vino1.setDescuento(14.99);

        Vino vino2 = new Vino("Marqués de Riscal", "Blanco", 12.0, 12.99);
        vino2.setCaducidad(LocalDate.of(2027, 11, 30));
        vino2.setDescuento(11.99);

        ArrayList<esAlimento> alimentos = new ArrayList<>();
        alimentos.add(cereal1);
        alimentos.add(cereal2);
        alimentos.add(cereal3);
        alimentos.add(vino1);
        alimentos.add(vino2);

        int totalCalorias = 0;
        for (esAlimento alimento : alimentos) {
            totalCalorias += alimento.getCalorias();
        }

        System.out.println("=== Lista de Alimentos ===");
        for (esAlimento alimento : alimentos) {
            System.out.println(alimento);
        }
        System.out.println("Suma total de calorías: " + totalCalorias);
    }
}