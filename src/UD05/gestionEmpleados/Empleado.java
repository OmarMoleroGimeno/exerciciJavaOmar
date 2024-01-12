package UD05.gestionEmpleados;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private String dni;
    private int anoDeIngreso;
    private double sueldoBrutoAnual;

    public Empleado(String nombre, String dni, int anoDeIngreso, double sueldoBrutoAnual) {
        this.nombre = nombre;
        this.dni = dni;
        this.anoDeIngreso = anoDeIngreso;
        this.sueldoBrutoAnual = sueldoBrutoAnual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAnoDeIngreso(int anoDeIngreso) {
        this.anoDeIngreso = anoDeIngreso;
    }

    public void setSueldoBrutoAnual(double sueldoBrutoAnual) {
        this.sueldoBrutoAnual = sueldoBrutoAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getAnoDeIngreso() {
        return anoDeIngreso;
    }

    public double getSueldoBrutoAnual() {
        return sueldoBrutoAnual;
    }

    public int antiguedad(){
        int anoActual = 2023;
        if ((anoActual - getAnoDeIngreso()) > 0) {
            return (anoActual - getAnoDeIngreso());
        } else {
            return 0;
        }
    }

    public void incrementarSueldo(double porcentaje){
        this.sueldoBrutoAnual = getSueldoBrutoAnual()*(1+porcentaje/100);
    }

    @Override
    public String toString() {

        return "\nNombre: \r\t\t\t"+ getNombre() +
                "\nDNI: \r\t\t\t" + getDni() +
                "\nAño de ingreso: \r\t\t\t" + getAnoDeIngreso() +
                "\nSueldo bruto anual: \r\t\t\t" + getSueldoBrutoAnual();
    }

    public boolean equals(Object o){

        if (this == o) {
            return true;
        } else if(o == null){
            return false;
        } else if(this.getClass() != o.getClass()){
            return false;
        }
        final Empleado other = (Empleado) o;
        return Objects.equals(this.dni, other.dni);
    }

    public int compareTo(Empleado o){
        return this.getDni().compareTo(o.getDni());
    }

    public static double calcularIRPF(double salario){
        int irpf;
        if (salario>=0 && salario<800) {
            irpf = 3;
        } else if(salario>=800 && salario<1000){
            irpf = 10;
        }else if(salario>=1000 && salario<1500){
            irpf = 15;
        }else if(salario>=1500 && salario<2100){
            irpf = 20;
        }else {
            irpf = 30;
        }
        return salario*irpf/100;
    }

    public static void main(String[] args) {
        Empleado e = new Empleado("Omar", "23319777", 2022, 1200);
        System.out.println(e.toString());
    }
}