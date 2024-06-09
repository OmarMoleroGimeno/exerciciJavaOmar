package UD09._10_GestionEmpleados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import UD09.DbConection;

public class GestionEmpleados {

    public static void verificarEmpleados(Connection con) {
        String sql = "SELECT id, nombre, salario FROM empleados";

        try (Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.isBeforeFirst()) {
                System.out.println("Hay empleados registrados en la base de datos.");
            } else if (rs.isAfterLast() || !rs.next()) {
                System.out.println("No hay empleados registrados en la base de datos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarPrimerEmpleado(Connection con) {
        String sql = "SELECT id, nombre, salario FROM empleados";

        try (Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.first()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double salario = rs.getDouble("salario");
                System.out.println("Primer empleado - ID: " + id + ", Nombre: " + nombre + ", Salario: " + salario);
            } else {
                System.out.println("No hay empleados registrados en la base de datos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException{

        try (Connection con = DbConection.getInstance().getConnection()) {

            // Llamar a los métodos
            verificarEmpleados(con);
            mostrarPrimerEmpleado(con);

        }
    }

}
