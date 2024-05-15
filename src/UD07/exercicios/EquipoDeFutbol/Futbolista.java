package UD07.exercicios.EquipoDeFutbol;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class Futbolista implements Deportista, Comparable<Futbolista>{
    
    private String nombre;
    private int edad;
    private Posicion posicion;

    private int anyosProfesional;
    private ArrayList<String> equipos;
    private int trofeos;

    public Futbolista(String nombre, int edad, Posicion posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.anyosProfesional = 0;
        this.equipos = new ArrayList<>();
        this.trofeos = 0;
    }

    public Futbolista(String nombre, int edad, Posicion posicion, int anyosProfesiona, int trofeos) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.anyosProfesional = anyosProfesiona;
        this.equipos = new ArrayList<>();
        this.trofeos = trofeos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void agregarEquipo(String equipo){
        this.equipos.add(equipo);
    }

    @Override
    public int compareTo(Futbolista o2) {
        if (prioridadPosicion(this.getPosicion()) - prioridadPosicion(o2.getPosicion()) == 0) {
            return this.getNombre().compareTo(o2.getNombre());
        } else{
            return prioridadPosicion(this.getPosicion()) - prioridadPosicion(o2.getPosicion());
        }
    }

    private int prioridadPosicion(Posicion posicion){
        switch (posicion) {
            case PORTERO:           return 1;
            case DEFENSA:           return 2;
            case CENTROCAMPISTA:    return 3;
            case DELANTERO:         return 4;
        } return 0;
    }

    @Override
    public String toString() {
        return String.format(" Futbolista --> Nombre: %-20s - edad: %2d - posicion: %-15s",
                            this.nombre, this.edad, this.posicion.getNombrePosicion());
    }

    public String mostrarInformacion(){
        String cadena = "";
        if (this.equipos.size()>=3) {
            for (int i = equipos.size() - 3; i < this.equipos.size() - 1; i++) {
                cadena += this.equipos.get(i) + " - ";
            }
            cadena += this.equipos.get(this.equipos.size() - 1);
        } else{
            Iterator<String> it = this.equipos.iterator();
            while (it.hasNext()) {
                cadena += it.next();
                if (it.hasNext()) {
                    cadena += ", ";
                }
            }
        }

        return String.format(" Futbolista --> Nombre: %-20s - edad: %2d - posicion: %-15s - años profesional: %2d - trofeos %2d",
                            this.nombre, this.edad, this.posicion.getNombrePosicion(), this.anyosProfesional, this.trofeos, cadena);
    }

    @Override
    public int getAnyosProfesional(){
        return anyosProfesional;
    }

    @Override
    public List<String> getListadoEquipos(){//Devolvemos una copia para no modificar la actual
        return new ArrayList<>(this.equipos);
    }

    @Override
    public int getTotalTrofeos(){
        return trofeos;
    }

    public static void main(String[] args) {
        
    }
    
}