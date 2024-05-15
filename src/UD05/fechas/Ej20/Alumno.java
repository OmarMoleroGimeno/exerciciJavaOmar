package UD05.fechas.Ej20;

    import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Alumno {
    private int codigo;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private double calificacion;

    public Alumno(int codigo, String nombre, String apellidos, LocalDate fechaNacimiento, double calificacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.calificacion = calificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Alumno {" +
                "codigo = " + codigo +
                ", nombre = '" + nombre + '\'' +
                ", apellidos = '" + apellidos + '\'' +
                ", fecha = " + fechaNacimiento.format(formatter) +
                ", calificacion = " + calificacion +
                ", edad = " + calcularEdad() +
                '}';
    }

    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2005, 10, 3);
        Alumno alumno = new Alumno(1, "Omar", "Molero GImeno", fechaNacimiento, 10);
        System.out.println(alumno.toString());
    }
}