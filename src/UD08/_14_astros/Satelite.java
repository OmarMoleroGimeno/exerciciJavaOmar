package UD08._14_astros;

public class Satelite extends Astro{

    private double getDistanciaAlPlaneta;
    private double orbitaPlanetaria;
    
    public Satelite(String nombre, double masaDelCuerpo, double diametroMedio,
            double rotacionPeriodo, double traslacionPeriodo, double getDistanciaAlPlaneta,
            double orbitaPlanetaria) {
        super(nombre, masaDelCuerpo, diametroMedio, rotacionPeriodo, traslacionPeriodo);
        this.getDistanciaAlPlaneta = getDistanciaAlPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public double getGetDistanciaAlPlaneta() {
        return getDistanciaAlPlaneta;
    }

    public void setGetDistanciaAlPlaneta(double getDistanciaAlPlaneta) {
        this.getDistanciaAlPlaneta = getDistanciaAlPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("");
    }
    
}