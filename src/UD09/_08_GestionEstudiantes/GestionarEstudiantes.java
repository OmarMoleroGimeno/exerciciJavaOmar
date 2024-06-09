package UD09._08_GestionEstudiantes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import UD09.DbConection;

public class GestionarEstudiantes {

    public static void mostrarPosicionEstudiante(Connection con) {
        String sql = "SELECT id, nombre, edad, promedio FROM estudiantes";

        try (Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                int posicion = rs.getRow();
                System.out.println("Posición actual del estudiante: " + posicion);
            } else {
                System.out.println("No hay estudiantes en la base de datos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void validarPosicionCursor(Connection con) {
        String sql = "SELECT id, nombre, edad, promedio FROM estudiantes";

        try (Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.isBeforeFirst()) {
                System.out.println("El cursor está antes del primer registro.");
            }

            if (rs.next()) {
                if (rs.isFirst()) {
                    System.out.println("El cursor está en el primer registro.");
                }

                rs.last();
                if (rs.isLast()) {
                    System.out.println("El cursor está en el último registro.");
                }
            }

            rs.afterLast();
            if (rs.isAfterLast()) {
                System.out.println("El cursor está después del último registro.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void main(String[] args) throws SQLException{
        try (Connection con = DbConection.getInstance().getConnection()) {

            mostrarPosicionEstudiante(con);
            validarPosicionCursor(con);

        }
    }

}
