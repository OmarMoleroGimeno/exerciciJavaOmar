package UD08._14_astros;

import java.util.ArrayList;

public class Planeta extends Astro{

    private double distanciaAlSol;
    private double orbitaAlSol;
    private ArrayList<Astro> satelites;

    public Planeta(String nombre, double masaDelCuerpo, double diametroMedio, double rotacionPeriodo,
                    double traslacionPeriodo, double distanciaAlSol, double orbitaAlSol) {
        super(nombre, masaDelCuerpo, diametroMedio, rotacionPeriodo, traslacionPeriodo);
        this.distanciaAlSol = distanciaAlSol;
        this.diametroMedio = diametroMedio;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public void setOrbitaAlSol(double orbitaAlSol) {
        this.orbitaAlSol = orbitaAlSol;
    }

    public void setSatelites(ArrayList<Astro> satelites) {
        this.satelites = satelites;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public double getOrbitaAlSol() {
        return orbitaAlSol;
    }

    public ArrayList<Astro> getSatelites() {
        return satelites;
    }
    
    @Override
    public void mostrarDatos() {
        String str = "Nombre: " + this.getNombre() +
                     "\nMasa: " + this.getMasaDelCuerpo() +
                     "\nDiametro: " + this.getDiametroMedio() +
                     "\nPeriodo de rotación: " + getRotacionPeriodo() +
                     "\nPeriodo de Translación: " + getRotacionPeriodo() +
                     "\nDistancia respecto al son: " + getDistanciaAlSol() +
                     "\nDiametro: " + getDiametroMedio();
        System.out.println(str);
    }

}