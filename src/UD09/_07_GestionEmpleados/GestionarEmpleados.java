package UD09._07_GestionEmpleados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import UD09.DbConection;

public class GestionarEmpleados {

    public static void mostrarEmpleadoPorID(Connection con, int id) {
        String sql = "SELECT id, nombre, salario FROM empleados WHERE id = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.absolute(1)) {
                int empId = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double salario = rs.getDouble("salario");
                System.out.println("ID: " + empId + ", Nombre: " + nombre + ", Salario: " + salario);
            } else {
                System.out.println("Empleado con ID " + id + " no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void buscarEmpleadosPorSalario(Connection con, double salarioMin, double salarioMax) {
        String sql = "SELECT id, nombre, salario FROM empleados WHERE salario BETWEEN ? AND ? ORDER BY salario";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setDouble(1, salarioMin);
            pstmt.setDouble(2, salarioMax);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double salario = rs.getDouble("salario");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Salario: " + salario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException{

        try (Connection con = DbConection.getInstance().getConnection()){

            mostrarEmpleadoPorID(con, 1);
            buscarEmpleadosPorSalario(con, 200, 400);

        }
    }
}