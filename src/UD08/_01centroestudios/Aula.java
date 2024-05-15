package UD08._01centroestudios;

public class Aula {
    // contador: atributo de clase
    private static int contador = 0;
    // generar codigo por contador
    protected int codigo;
    protected double longitud;
    protected double anchura;

    public Aula(double longitud, double anchura){
        this.codigo = ++contador;
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public int capacidad(){
        // redondear resultado para mostrar num. alumnos
        return (int)((longitud*anchura)/1.4);
    }

    private double superficie(){
        return this.longitud * this.anchura;
    }

    @Override
    public String toString() {
        return "\tcódigo: " + this.codigo +
               "\tsuperficie: " + this.superficie() +
               "\tcapacidad: " + this.capacidad();
    }
}
