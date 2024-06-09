package UD09._01_gestionEmpleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import UD09.Conexion;

public class GestionEmpleados {

    public static void listarEmpleados (Connection conn){

        try (Statement st = conn.createStatement()) {
            String sql = "SELECT * FROM empleados";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString(2) + " - " +  rs.getString(3));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }

    public static void actualizarSalarios (Connection conn){

        // Creamos un Statement scrollable y modificable
        try (Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            String sql = "SELECT * FROM empleados";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                double salario = rs.getDouble(3);
                salario += salario*0.1;
                rs.updateDouble(3, salario);
                rs.updateRow();
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }

    public static void eliminarEmpleados (Connection conn){
        // Creamos un Statement scrollable y modificable
        try (Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            String sql = "SELECT * FROM empleados";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getDouble(3) > 300) {
                    rs.deleteRow();
                }
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(Conexion.JDBC_URL, Conexion.USUARIO, Conexion.CONTRASEÑA)){
            listarEmpleados(conn);
            System.out.println();
            actualizarSalarios(conn);
            eliminarEmpleados(conn);
            listarEmpleados(conn);
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error de SQL: " + ex.getMessage());
        }
    }
}