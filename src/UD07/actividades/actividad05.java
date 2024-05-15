package UD07.actividades;

import java.util.HashMap;
import java.util.Map;

public class actividad05 {
    public static void main(String[] args) {
        HashMap<String, Double> divisas = new HashMap<>();
        divisas.put("Dólar Americano", 0.8);
        divisas.put("Franco Suizo", 0.85);
        divisas.put("Libra Esterlina", 1.14);
        divisas.put("Corona Danesa ", 0.13);
        divisas.put("Peso Mexicano ", 0.04);
        divisas.put("Dólar Singapur", 0.62);
        divisas.put("Real Brasil", 0.24);

        //Mostrar el valor de la Libra Esterlina.
        System.out.println("\nLibra Esterlina: " + divisas.get("Libra Esterlina"));

        //Mostrar todas las divisas con las que se opera y su valor
        for (Map.Entry<String, Double> entry : divisas.entrySet()) {
            System.out.println(String.format("Moneda-> %-15s   Valor en €-> %-10.2f  ", entry.getKey(), entry.getValue()));
        }

        //Indicar el número de divisas del Map.
        System.out.println("\nNum divisas: " + divisas.size() + "\n");

        //Eliminar la divisa Real Brasil y mostrar los datos del Map.
        divisas.remove("Real Brasil");
        for (Map.Entry<String, Double> entry : divisas.entrySet()) {
            System.out.println(String.format("Moneda-> %-15s   Valor en €-> %-10.2f  ", entry.getKey(), entry.getValue()));
        }

        //Mostrar si existe la divisa Peso Mexicano.
        System.out.println("\nExiste Peso Megicano? " + divisas.containsKey("Peso Mexicano"));

        //Mostrar si existe la divisa Euro.
        System.out.println("Existe el Euro? " + divisas.containsKey("Euro"));

        //Mostrar si existe el valor al cambio 0.85 €.
        System.out.println("Existe el valor 0.85? " + divisas.containsValue(0.85));

        //Mostrar si existe el valor a cambio de 0.33?
        System.out.println("Existe el valor 0.33? " + divisas.containsValue(0.33));
        
        //Indicar si el Map divisas está vacío.
        System.out.println("Divisas esta vacio? " + divisas.isEmpty());

        //Borra todos los componentes del Map divisas.
        divisas.clear();
        System.out.println("Divisas vacio");
        
        //Volver a indicar si el Map divisas está vacío.
        System.out.println("Divisas esta vacio? " + divisas.isEmpty());

    }
}
