package UD09.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/redes";
    private static final String USUARIO = "omar";
    private static final String PASSWORD = "Servidor@24";

    private static DbConnect dbInstance; // Variable para almacenar la única instancia de la clase
    private static Connection con;

    // Constructor vacío privado para evitar la instanciación directa
    private DbConnect() {
    }

    // Método estático para obtener la instancia única (Singleton)
    public static DbConnect getInstance() {
        if (dbInstance == null) {
            dbInstance = new DbConnect();
        }
        return dbInstance;
    }

    // Método estático para obtener la conexión a la base de datos
    public Connection getConnection() throws SQLException {
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection(JDBC_URL, USUARIO, PASSWORD);
        }
        return con;
    }
}