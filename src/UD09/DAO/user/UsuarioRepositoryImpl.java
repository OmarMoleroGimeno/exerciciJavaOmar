package UD09.DAO.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import UD09.DAO.DbConnect;
import UD09.DAO.IRepository;

public class UsuarioRepositoryImpl implements IRepository<Usuario> {
    private static final String INSERT_QUERY = "INSERT INTO post (id, usuario_id, titulo, contenido, fecha) VALUES (?, ?)";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM users WHERE id = ?";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM users";
    private static final String UPDATE_QUERY = "UPDATE users SET name = ?, lastName = ? WHERE id = ?";
    private static final String DELETE_QUERY = "DELETE FROM users WHERE id = ?";

    @Override
    public void crear(Usuario usuario)  throws SQLException {
        try (Connection con = DbConnect.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement(INSERT_QUERY, PreparedStatement.RETURN_GENERATED_KEYS) ) {
            
            //Values(?, ?)
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getApellido());

            int filasInsertadas = pst.executeUpdate();
            if (filasInsertadas > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    usuario.setId(id);
                }
            }
        }
    }

    @Override
    public Usuario obtener(int id)  throws SQLException {
        Usuario usuario = null;
        try (Connection con = DbConnect.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement(SELECT_BY_ID_QUERY)) {

            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("name");
                String apellido = rs.getString("lastName");
                usuario = new Usuario(id, nombre, apellido);
            }
        }
        return usuario;
    }

    @Override
    public ArrayList<Usuario> obtenerTodos()  throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try (Connection con = DbConnect.getInstance().getConnection();
             Statement pst = con.createStatement();
             ResultSet rs = pst.executeQuery(SELECT_ALL_QUERY)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("name");
                String apellido = rs.getString("lastName");
                Usuario usuario = new Usuario(id, nombre, apellido);
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }

    @Override
    public void actualizar(Usuario usuario)  throws SQLException {
        try (Connection con = DbConnect.getInstance().getConnection();
             PreparedStatement pst = con.prepareStatement(UPDATE_QUERY)) {

            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getApellido());
            pst.setInt(3, usuario.getId());

            pst.executeUpdate();
        }
    }

    @Override
    public void eliminar(int id)  throws SQLException {
        try (Connection con = DbConnect.getInstance().getConnection();
             PreparedStatement pst = con.prepareStatement(DELETE_QUERY)) {

            pst.setInt(1, id);

            pst.executeUpdate();
        }
    }
}