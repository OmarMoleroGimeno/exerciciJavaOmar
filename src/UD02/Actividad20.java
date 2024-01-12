package UD02;

import java.util.Scanner;

public class Actividad20 {
    private int codMedico;
    private String nombre;
    private String dni;
    private String direccion;
    private int telefono;
    private String poblacion;
    private int codPostal;
    private String fechaNacimiento;
    private String especialidad;
    private double sueldo;
    private static final double retencion1 = 0.19;
    private static final double retencion2 = 0.24;
    private static final double retencion3 = 0.30;
    private static final double retencion4 = 0.37;

    public Actividad20(int codMedico, String nombre, String dni, String direccion, int telefono, String poblacion, int codPostal, String fechaNacimiento, String especialidad, double sueldo) {
        this.codMedico = codMedico;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.codPostal = codPostal;
        this.fechaNacimiento = fechaNacimiento;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public int getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(int codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double retencionMedico(double sueldo){
        
        if (sueldo < 12450) {
            sueldo -= sueldo*retencion1;
        } else if(sueldo >= 12450 && sueldo <= 20199){
            sueldo -= sueldo*retencion2;
        }else if(sueldo >= 20200 && sueldo <= 35199){
            sueldo -= (sueldo*retencion3);
        }else{
            sueldo -= sueldo*retencion4;
        }

        return sueldo;
    }

    @Override
    public String toString(){
        return  "\n+---------------------------+" +
                "\nCódigo médico: "+ getCodMedico()+
                "\nNombre: "+ getNombre()+
                "\nDNI: "+ getDni()+
                "\nDirección: "+ getDireccion()+
                "\nTeléfono: "+ getTelefono()+
                "\nPoblación: "+ getPoblacion()+
                "\nCódigo postal: "+ getCodPostal()+
                "\nFecha de nacimiento: "+ getFechaNacimiento()+
                "\nEspecialidad: "+ getEspecialidad()+
                "\nSueldo bruto anual: "+ getSueldo()+
                "\nSueldo neto anual: "+ retencionMedico(sueldo)+
                "\n+---------------------------+";
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce el sueldo anual del Traumatologo: ");
        double sueldo = tec.nextDouble();
        tec.nextLine();
        System.out.print("Introduce el dni del médico digestivo: ");
        String dni = tec.nextLine();

        tec.close();

        Actividad20 medicoTraumatologo = new Actividad20(423123, "Daniel", "23449787D", "Calle Bailén", 645663489, "Madrid", 3491, "11/03/1989", "Traumatologia", sueldo);
        Actividad20 medicoDigestivo = new Actividad20(231438, "Leonardo", dni, "Plaza España", 678987537, "Cantábria", 134523, "08/03/200", "Digestivo", 45700);

        System.out.println(medicoTraumatologo.toString());
        System.out.println();
        System.out.println(medicoDigestivo.toString());
    }
}