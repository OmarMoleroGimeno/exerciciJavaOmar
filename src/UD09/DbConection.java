package UD09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConection {
    //Variables para utilizarlas en el DriverManager
    private static final String URL = "jdbc:mysql://localhost:3306/omar";
    private static final String USUARIO = "omar";
    private static final String CONTRASENHA = "Servidor@24";

    //Variables necesarias para el método s+Singelton
    private static DbConection dbInstance;
    private static Connection con;

    //Clase vacia
    public DbConection(){
    }

    //Método para instanciar el DbConnect si no lo está
    public static DbConection getInstance(){
        if (dbInstance == null) {
            dbInstance = new DbConection();
        }
        return dbInstance;
    }

    //Crear la conexión si esta cerrada o no se habia abierto aún
    public Connection getConnection() throws SQLException{
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection(URL, USUARIO, CONTRASENHA);
        }
        return con;
    }
}
