package UD08._14_astros;

abstract class Astro {

    protected String nombre;
    protected double masaDelCuerpo;
    protected double diametroMedio;
    protected double rotacionPeriodo;
    protected double traslacionPeriodo;
    
    public Astro(String nombre, double masaDelCuerpo, double diametroMedio, double rotacionPeriodo,
            double traslacionPeriodo) {
        this.nombre = nombre;
        this.masaDelCuerpo = masaDelCuerpo;
        this.diametroMedio = diametroMedio;
        this.rotacionPeriodo = rotacionPeriodo;
        this.traslacionPeriodo = traslacionPeriodo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMasaDelCuerpo(double masaDelCuerpo) {
        this.masaDelCuerpo = masaDelCuerpo;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public void setRotacionPeriodo(double rotacionPeriodo) {
        this.rotacionPeriodo = rotacionPeriodo;
    }

    public void setTraslacionPeriodo(double traslacionPeriodo) {
        this.traslacionPeriodo = traslacionPeriodo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMasaDelCuerpo() {
        return masaDelCuerpo;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public double getRotacionPeriodo() {
        return rotacionPeriodo;
    }

    public double getTraslacionPeriodo() {
        return traslacionPeriodo;
    }

    public abstract void mostrarDatos();

}