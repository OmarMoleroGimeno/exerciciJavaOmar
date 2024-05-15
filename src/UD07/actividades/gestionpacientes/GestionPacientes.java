package UD07.actividades.gestionpacientes;

import java.util.TreeSet;

public class GestionPacientes {
    public static void main(String[] args) {
        TreeSet<Paciente> archivador = new TreeSet<>();
        Paciente p1 = new Paciente("Molero Gimeno", "Omar", 18);
        archivador.add(p1);
        archivador.add(new Paciente("Gil Amor", "Pau", 17));
        archivador.add(new Paciente("Martinez Llorens", "Jorge", 18));
        System.out.println(archivador);
        archivador.remove(p1);
        System.out.println(archivador);
        
    }
}