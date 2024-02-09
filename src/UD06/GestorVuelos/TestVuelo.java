package UD06.GestorVuelos;

import java.time.LocalTime;

import UD06.GestorVuelos.Vuelo.PreferenciaNoValidaException;
import UD06.GestorVuelos.Vuelo.VueloCompletoException;

public class TestVuelo {
    public static void main(String[] args) {
        Vuelo v1 = new Vuelo("IB101", "Valencia", "Paris", LocalTime.of(19, 5), LocalTime.of(21, 0));

        try {
            v1.reservarAsiento("kiney", 'v');
            v1.reservarAsiento("Omar", 'v');
            v1.reservarAsiento("Arnau", 'v');
        } catch (VueloCompletoException | PreferenciaNoValidaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(v1);
    }
}
