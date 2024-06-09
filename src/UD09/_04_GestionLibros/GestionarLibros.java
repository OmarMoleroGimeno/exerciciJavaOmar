package UD09._04_GestionLibros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarLibros {
    public static void mostrarLibrosPorDecada(Connection con, int decada) {
        String sql = "SELECT id, titulo, autor, anio_publicacion FROM libros WHERE anio_publicacion BETWEEN ? AND ? ORDER BY anio_publicacion DESC";
        int startYear = decada;
        int endYear = decada + 9;
    
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, startYear);
            pstmt.setInt(2, endYear);
            ResultSet rs = pstmt.executeQuery();
    
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int anio_publicacion = rs.getInt("anio_publicacion");
                System.out.println("ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Año: " + anio_publicacion);
            }
    
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static void buscarLibroPorAutor(Connection con, String autor) {
        String sql = "SELECT id, titulo, autor, anio_publicacion FROM libros WHERE autor LIKE ?";
        String autorPattern = "%" + autor + "%";
    
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, autorPattern);
            ResultSet rs = pstmt.executeQuery();
    
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autorLibro = rs.getString("autor");
                int anio_publicacion = rs.getInt("anio_publicacion");
                System.out.println("ID: " + id + ", Título: " + titulo + ", Autor: " + autorLibro + ", Año: " + anio_publicacion);
            }
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
