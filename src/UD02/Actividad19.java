package UD02;
import java.util.Scanner;

public class Actividad19 {
    int codHospital;
    String nombreHospital;
    String direccion;
    String telefono;
    String poblacion;
    int codPostal;
    int habitacionesTotales;
    int habitacionesOcupadas;
    
    public Actividad19(int codHospital, String nombreHospital, String direccion, String telefono, String poblacion,
            int codPostal, int habitacionesTotales, int habitacionesOcupadas) {
        this.codHospital = codHospital;
        this.nombreHospital = nombreHospital;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.codPostal = codPostal;
        this.habitacionesTotales = habitacionesTotales;
        this.habitacionesOcupadas = habitacionesOcupadas;
    }

    public Actividad19() {
    }

    public int getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(int codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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

    public int getHabitacionesTotales() {
        return habitacionesTotales;
    }

    public void setHabitacionesTotales(int habitacionesTotales) {
        this.habitacionesTotales = habitacionesTotales;
    }

    public int getHabitacionesOcupadas() {
        return habitacionesOcupadas;
    }

    public void setHabitacionesOcupadas(int habitacionesOcupadas) {
        this.habitacionesOcupadas = habitacionesOcupadas;
    }

    public String ingreso(){
        if (habitacionesOcupadas < habitacionesTotales){
            habitacionesOcupadas++;
            System.out.println("Opración realizada correctamente.");
        } else {
            System.out.println("No hay sitio, estamos llenos.");
        }
        return " ";
    }

    public String alta(){
        if (habitacionesOcupadas >= habitacionesTotales){
            System.out.println("No hay sitio, estamos llenos.");
        } else {
            habitacionesOcupadas--;
            System.out.println("Opración realizada correctamente.");
        }
        return " ";
    }

    @Override
    public String toString(){
        return "\n---------------"+
        "\nCodigo hospital: "+ getCodHospital()+
        "\nNombre del Hospital: " + getNombreHospital() +
        "\nDirección del hopital: "+getDireccion()+
        "\nTelefono: "+getTelefono()+
        "\nPoblación: "+getPoblacion()+
        "\nCodigo postal: "+getCodPostal()+
        "\nHbitaciones totales: "+getHabitacionesTotales()+
        "\nHabitaciones ocupadas: "+getHabitacionesOcupadas()+
        "\n---------------";
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce el nombre del hospital: ");
        String nombreHospital = tec.nextLine();
        System.out.print("Introduce la dirección: ");
        String direccion = tec.nextLine();
        System.out.print("Introduce el telefono: ");
        String telefono = tec.nextLine();
        System.out.print("Introduce la poblacion: ");
        String poblacion = tec.nextLine();
        System.out.print("Cuantas habitaciones desea ocupar? ");
        int habitacionesOcupadas = tec.nextInt();
        
        tec.close();
        Actividad19 hospital1 = new Actividad19(4352, nombreHospital, direccion, telefono, poblacion, 46195, 300, habitacionesOcupadas);
        hospital1.toString();
        System.out.println("---------------");
        System.out.println(hospital1.ingreso());
        System.out.println("---------------");
    }
}