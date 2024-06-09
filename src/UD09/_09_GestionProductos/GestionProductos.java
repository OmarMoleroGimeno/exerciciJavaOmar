package UD09._09_GestionProductos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import UD09.DbConection;

public class GestionProductos {

    public static void mostrarNumeroTotalProductos(Connection con) {
        String sql = "SELECT COUNT(*) AS total FROM productos";

        try (Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                int totalProductos = rs.getInt("total");
                System.out.println("Número total de productos: " + totalProductos);
            } else {
                System.out.println("No hay productos en la base de datos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void verificarDisponibilidadProductos(Connection con) {
        String sql = "SELECT id, nombre, precio FROM productos";

        try (Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.isBeforeFirst()) {
                System.out.println("Hay productos disponibles en la base de datos.");
            } else if (rs.isAfterLast() || !rs.next()) {
                System.out.println("No hay productos disponibles en la base de datos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException{

        try (Connection con = DbConection.getInstance().getConnection()) {

            mostrarNumeroTotalProductos(con);
            verificarDisponibilidadProductos(con);

        }
    }
}