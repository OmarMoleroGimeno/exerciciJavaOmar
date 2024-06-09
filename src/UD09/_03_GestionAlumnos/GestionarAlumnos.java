package UD09._03_GestionAlumnos;

import java.sql.*;

public class GestionarAlumnos {

    private static void mostrarAlumno(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nombre = rs.getString("nombre");
        int edad = rs.getInt("edad");

        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) throws SQLException{
        try(Connection con = DbConection.getInstance().getConnection();
            Statement st = con.createStatement()){
            
            ResultSet rs = st.executeQuery("SELECT * FROM alumnos ORDER BY edad");
            
            if (rs.first()) {
                System.out.println("Alumno más joven:");
                mostrarAlumno(rs);
            }

            if (rs.last()) {
                System.out.println("\nAlumno más viejo:");
                mostrarAlumno(rs);
            }

            System.out.println("\nAlumnos en orden inverso respecto a la edad:");
            if (rs.last()) {
                do {
                    mostrarAlumno(rs);
                } while (rs.previous());
            }
        }
    }
}