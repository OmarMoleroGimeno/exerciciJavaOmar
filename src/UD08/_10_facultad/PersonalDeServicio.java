package UD08._10_facultad;

public class PersonalDeServicio extends Empleado{

    private String seccion;

    public PersonalDeServicio(String nombre, String apellidos, int id, String estadoCivil, int año, int numDespacho,
            String seccion) {
        super(nombre, apellidos, id, estadoCivil, año, numDespacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void cambioSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio:\n" +
                super.toString() +
                " sección=" + seccion;
    }

}