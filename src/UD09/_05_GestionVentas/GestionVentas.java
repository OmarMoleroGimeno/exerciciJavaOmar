package UD09._05_GestionVentas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import UD09.DbConection;

public class GestionVentas {
    public static void calcularTotalVentas(Connection con) {
        String sql = "SELECT total FROM ventas";
        double totalVentas = 0;

        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                totalVentas += rs.getDouble("total");
            }

            System.out.println("Total general de ventas: " + totalVentas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void buscarVentasPorProducto(Connection con, String producto) {
        String sql = "SELECT id, producto, cantidad, total FROM ventas WHERE producto LIKE ?";
        String productoPattern = "%" + producto + "%";

        try (PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            pstmt.setString(1, productoPattern);
            ResultSet rs = pstmt.executeQuery();

            if (rs.last()) {
                int numFilas = rs.getRow();
                rs.beforeFirst();
                for (int i = 0; i < numFilas; i++) {
                    if (rs.relative(1)) {
                        int id = rs.getInt("id");
                        String nombreProducto = rs.getString("producto");
                        int cantidad = rs.getInt("cantidad");
                        double total = rs.getDouble("total");
                        System.out.println("ID: " + id + ", Producto: " + nombreProducto + ", Cantidad: " + cantidad + ", Total: " + total);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException{
        try (Connection con = DbConection.getInstance().getConnection()) {

            calcularTotalVentas(con);
            buscarVentasPorProducto(con, "ProductoEjemplo");

        }
    }

}