package UD09;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToMySql {
    // JDBC URL, usuario y contraseña de la base de datos
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/omar";
    private static final String USUARIO = "omar";
    private static final String CONTRASEÑA = "Servidor@24";

    public static void main(String[] args) {
        try {
        // Dependiendo de a qué tipo de SGBD queramos conectar cargaremos un controlador u otro

            // Paso 1: Cargar el controlador JDBC de MySQL
            Class<?> c = Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Cargado: " + c.getName());

            //Definir la url de conexión y los parámetros de usuario y contraseña
            // Paso 2: Establecer la conexión con la base de datos
            Connection conexion = DriverManager.getConnection(JDBC_URL, USUARIO, CONTRASEÑA);
            System.out.println("Conexión completada");

            // Paso 3: Aquí puedes realizar operaciones en la base de datos
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM proveedores";
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                Date fecha_ingreso = rs.getDate("fecha_ingreso");
                double salario = rs.getDouble("salario");
                System.out.println(id + " " + nombre + " " + fecha_ingreso + " " + salario);
            }
            // Paso 4: Cerrar la conexión
            conexion.close();
            System.out.println("Conexión cerrada correctamente.");

        } catch (ClassNotFoundException cnfe) {
            System.out.println("ERROR al no encontrarse la clase controlador JDBC: " + cnfe.getMessage());
        } catch (SQLException ex) {
            System.out.println("ERROR al conectar: " + ex.getMessage());
        }
    }
}
