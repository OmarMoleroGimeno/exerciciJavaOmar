package UD05.gestionHospital;
import UD05.gestionHospital.Paciente.MaximoEstadoException;

public class TestPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Antonio", 20);
        Paciente p2 = new Paciente("Miguel", 30);
        System.out.println("+-------------------------------+");
        System.out.println("Estados de los pacientes:");
        System.out.println("Estado paciente 1: " + p1.getEstado());
        System.out.println("Estado paciente 2: "+ p2.getEstado());
        System.out.println();
        System.out.println("Paciente con menor gravedad");

        System.out.println(p1.compareTo(p2)<0?p1.toString():p2.toString());
        System.out.println();
        System.out.println("Datos de los pacientes actualizados");
        while (p1.getEstado() != p2.getEstado()) {
            
            if (p1.getEstado() < p2.getEstado()) {
                try {
                    p1.mejorar();
                } catch (MaximoEstadoException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            } else {
                try {
                    p2.mejorar();
                } catch (MaximoEstadoException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("+-------------------------------+");
    }
}