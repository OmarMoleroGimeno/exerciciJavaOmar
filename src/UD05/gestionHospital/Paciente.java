package UD05.gestionHospital;

public class Paciente {

    private String nombre;
    private int edad;
    private int estado;

    //Constructor que se le passan el nombre y la edad
    public Paciente (String n, int e){
        this.nombre = n;
        this.edad = e;
        this.estado = (int)(Math.random()*5+1);
    }

    public int getEdad(){
        return edad;
    }

    public int getEstado(){
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void mejorar() throws MaximoEstadoException{
        if (estado<6) {
            this.estado++;
        } else {
            throw new MaximoEstadoException("El estado del paciente no se puede mejorar.");
        }
        
    }

    static class MaximoEstadoException extends Exception{
        public MaximoEstadoException(String m){
            super(m);
        }
    }

    public void empeorar() throws MinimoEstadoException{
        if (estado>1) {
            estado--;
        } else {
            throw new MinimoEstadoException("El estado del paciente no se puede mejorar.");
        }
    }

    static class MinimoEstadoException extends Exception{
        public MinimoEstadoException(String m){
            super(m);
        }
    }

    @Override
    public String toString() {
        return  "\nNombre: \t" + getNombre() +
                "\nEdad: \t\t" + getEdad() +
                "\nEstado: \t" + getEstado();
    }

    public int compareTo(Paciente o){
        //Comparar la gravedad
        int compararEstado = this.estado - o.estado;
        if (compararEstado != 0) {
            //Si la operación no es igual a 0
            return compararEstado;
        } else {
            //Si es igual a 0 vemos la edad
            return this.edad - o.edad;
        }
    }
}