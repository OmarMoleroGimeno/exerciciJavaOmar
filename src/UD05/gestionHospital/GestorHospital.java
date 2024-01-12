package UD05.gestionHospital;

import UD05.gestionHospital.Hospital.HospitalLlenoException;

public class GestorHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital();
        
        try {
            h1.ingresarPaciente("Omar", 0);
            h1.ingresarPaciente("Arnau", 0);
            h1.ingresarPaciente("Jorge", 0);
            h1.ingresarPaciente("Ismael", 0);
        } catch (HospitalLlenoException e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        while (h1.getNumLibres()<198) {
            h1.darAltas();
        }
    }
}