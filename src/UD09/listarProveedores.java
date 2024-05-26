package UD09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;

public class listarProveedores {
    public static void main(String[] args) {
        try (Connection conexion = DriverManager.getConnection(Conexion.JDBC_URL, Conexion.USUARIO, Conexion.CONTRASEÑA)) {

            Statement st = conexion.createStatement();

            String sql = "SELECT * FROM empleados where salario >= 3000";
            ResultSet rs = st.executeQuery(sql);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
            String fecha = "";

            while (rs.next()) {
                System.out.printf("empleado %-3d %-20s%-8.2f",
                                    rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3));
            }
            rs.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }
    }
}