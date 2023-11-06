package UD02;

import java.util.Scanner;

public class Actividad14 {
    private String CIF;
    private String nombreEmpresa;
    private String descripcion;
    private String sector;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String codPostal;
    private String correo;

    public Actividad14() {
    }

    public String getCIF() {
    return this.CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCodPostal() {
        return this.codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para verificar si el correo contiene "@"
    public boolean verificarCorreo(String correo) {
        return correo.contains("@");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Actividad14 actividad14 = new Actividad14();

        System.out.print("Introduce el CIF: ");
        actividad14.setCIF(entrada.nextLine());

        System.out.print("Introduce el Nombre de empresa: ");
        actividad14.setNombreEmpresa(entrada.nextLine());

        System.out.print("Introduce la Descripcion: ");
        actividad14.setDescripcion(entrada.nextLine());

        System.out.print("Introduce el Sector: ");
        actividad14.setSector(entrada.nextLine());

        System.out.print("Introduce la Direccion: ");
        actividad14.setDireccion(entrada.nextLine());

        System.out.print("Introduce el Telefono: ");
        actividad14.setTelefono(entrada.nextLine());

        System.out.print("Introduce la Poblacion: ");
        actividad14.setPoblacion(entrada.nextLine());

        System.out.print("Introduce el CodPostal: ");
        actividad14.setCodPostal(entrada.nextLine());

        System.out.print("Introduce el Correo: ");
        actividad14.setCorreo(entrada.nextLine());

        System.out.println("CIF: " + actividad14.getCIF());
        System.out.println("Nombre de empresa: " + actividad14.getNombreEmpresa());
        System.out.println("Descripcion: " + actividad14.getDescripcion());
        System.out.println("Sector: " + actividad14.getSector());
        System.out.println("Direccion: " + actividad14.getDireccion());
        System.out.println("Telefono: " + actividad14.getTelefono());
        System.out.println("Poblacion: " + actividad14.getPoblacion());
        System.out.println("CodPostal: " + actividad14.getCodPostal());
        System.out.println("Correo: " + actividad14.getCorreo());

        boolean correoValido = actividad14.verificarCorreo(actividad14.getCorreo());
        if (correoValido) {
            System.out.println("El correo es válido.");
        } else {
            System.out.println("El correo no es válido.");
        }

        entrada.close();
    }
}
