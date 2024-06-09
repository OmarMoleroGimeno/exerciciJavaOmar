package UD09._06_GestionPedidos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import UD09.DbConection;

public class GestionPedidos {
    public static void listarPedidosPorCliente(Connection con, String cliente) {
        String sql = "SELECT id, cliente, producto, cantidad, fecha FROM pedidos WHERE cliente LIKE ?";
        String clientePattern = "%" + cliente + "%";

        try (PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            pstmt.setString(1, clientePattern);
            ResultSet rs = pstmt.executeQuery();

            if (rs.last()) {
                int numFilas = rs.getRow();
                rs.beforeFirst();
                for (int i = 0; i < numFilas; i++) {
                    if (rs.relative(1)) {
                        int id = rs.getInt("id");
                        String nombreCliente = rs.getString("cliente");
                        String producto = rs.getString("producto");
                        int cantidad = rs.getInt("cantidad");
                        Date fecha = rs.getDate("fecha");
                        System.out.println("ID: " + id + ", Cliente: " + nombreCliente + ", Producto: " + producto + ", Cantidad: " + cantidad + ", Fecha: " + fecha);
                    }
                }
            }

        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static void buscarPedidosPorFecha(Connection con, String fecha) {
        String sql = "SELECT id, cliente, producto, cantidad, fecha FROM pedidos WHERE fecha=?";

        try (PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            pstmt.setDate(1, java.sql.Date.valueOf(fecha));
            ResultSet rs = pstmt.executeQuery();

            if (rs.last()) {
                do {
                    int id = rs.getInt("id");
                    String cliente = rs.getString("cliente");
                    String producto = rs.getString("producto");
                    int cantidad = rs.getInt("cantidad");
                    Date fechaPedido = rs.getDate("fecha");
                    System.out.println("ID: " + id + ", Cliente: " + cliente + ", Producto: " + producto + ", Cantidad: " + cantidad + ", Fecha: " + fechaPedido);
                } while (rs.previous());
            }


        } catch (SQLException e) {
            e.getMessage();
        }
    }
    public static void main(String[] args) throws SQLException{

        try (Connection con = DbConection.getInstance().getConnection()) {

            listarPedidosPorCliente(con, "ClienteEjemplo");
            buscarPedidosPorFecha(con, "2023-06-09");

        }
    }

    
}
