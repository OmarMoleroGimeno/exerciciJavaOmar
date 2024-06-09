package UD09.DAO.comentario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import UD09.DAO.DbConnect;
import UD09.DAO.IRepository;

public class CommentsRepositoryImpl implements IRepository<Comentario>{

    private static final String INSERT_QUERY = ("INSERT INTO comments VALUES(?, ?, ?, ?, ?)");
    private static final String SELECT_BY_ID = ("SELECT * FROM  comments WHERE id=?");
    private static final String SELECT_ALL_QUERY = "SELECT * FROM comments";
    private static final String UPDATE_QUERY = "UPDATE comments SET text = ? WHERE id = ?";
    private static final String DELETE_QUERY = "DELETE FROM comments WHERE id = ?";

    @Override
    public void crear(Comentario comentario) throws SQLException {
        try(Connection con = DbConnect.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement(INSERT_QUERY, PreparedStatement.RETURN_GENERATED_KEYS);) {
            
            //Values
            pst.setInt(1, comentario.getId());
            pst.setInt(4, comentario.getUserId());
            pst.setInt(5, comentario.getPostId());
            pst.setString(2, comentario.getText());
            pst.setString(3, comentario.getDate());

            int filasInsertadas = pst.executeUpdate();
            if (filasInsertadas > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    comentario.setId(id);
                }
            }
        }
    }

    @Override
    public Comentario obtener(int id) throws SQLException {
        Comentario com = null;
        try(Connection con = DbConnect.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement(SELECT_BY_ID, PreparedStatement.RETURN_GENERATED_KEYS)) {
            
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int user_id = rs.getInt(2);
                int post_id = rs.getInt(3);
                String text = rs.getString(4);
                String date = rs.getString(5);
                com = new Comentario(id, user_id, post_id, text, date);
            }
        }
        return com;
    }

    @Override
    public ArrayList<Comentario> obtenerTodos() throws SQLException {
        ArrayList<Comentario> comentarios = null;
        try(Connection con = DbConnect.getInstance().getConnection();
            Statement st = con.createStatement()) {
            
            comentarios = new ArrayList<>();
            ResultSet rs = st.executeQuery(SELECT_ALL_QUERY);
            while (rs.next()) {
                int id = rs.getInt(1);
                int user_id = rs.getInt(2);
                int post_id = rs.getInt(3);
                String text = rs.getString(4);
                String date = rs.getString(5);
                comentarios.add(new Comentario(id, user_id, post_id, text, date));
            }
        }
        return comentarios;
    }

    @Override
    public void actualizar(Comentario comentario) throws SQLException {
        try(Connection con = DbConnect.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement(UPDATE_QUERY)) {
            
            pst.setInt(1, comentario.getId());
            pst.setString(2, comentario.getText());
            pst.executeUpdate();
        }
    }

    @Override
    public void eliminar(int id) throws SQLException {
        try(Connection con = DbConnect.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement(DELETE_QUERY)) {
            
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }
}