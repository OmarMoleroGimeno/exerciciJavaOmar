package UD08._10_facultad;

public class Test {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        personas[0] = new Estudiante("Juan", "Gómez", 1, "Soltero", "1º");
        personas[1] = new Profesor("María", "López", 2, "Casado", "Lenguajes");
        personas[2] = new Empleado("Pedro", "Martínez", 3, "Soltero", 2015, 101);
        personas[3] = new PersonalDeServicio("Ana", "Rodríguez", 4, "Viudo", 2010, 201, "Biblioteca");
        personas[4] = new Persona("Omar", "Molero Gimeno", 0, "Con pareja");

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }

        // Probar los diferentes métodos
        personas[0].cambiarEstadoCivil("soltero");
        ((Profesor) personas[1]).cambioDepartamento("Matemáticas");
        ((Estudiante) personas[0]).matriculaNuevoCurso("2º");
        ((Empleado) personas[2]).reasignarDespacho(102);
        ((PersonalDeServicio) personas[3]).cambioSeccion("Secretaría");
        System.out.println();
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
}
