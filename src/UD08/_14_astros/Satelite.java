package UD08._14_astros;

public class Satelite extends Astro{

    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    
    public Satelite(String nombre, double masaDelCuerpo, double diametroMedio,
            double rotacionPeriodo, double traslacionPeriodo, double distanciaAlPlaneta,
            double orbitaPlanetaria) {
        super(nombre, masaDelCuerpo, diametroMedio, rotacionPeriodo, traslacionPeriodo);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    @Override
    public void mostrarDatos() {
        String str = "Nombre: " + this.getNombre() +
                     "\nMasa: " + this.getMasaDelCuerpo() +
                     "\nDiametro: " + this.getDiametroMedio() +
                     "\nPeriodo de rotación: " + getRotacionPeriodo() +
                     "\nPeriodo de Translación: " + getRotacionPeriodo() +
                     "\nDistancia al planeta: " + getDistanciaAlPlaneta() +
                     "\nOrbita planetaria: " + getOrbitaPlanetaria();
        System.out.println(str);
    }
    
}