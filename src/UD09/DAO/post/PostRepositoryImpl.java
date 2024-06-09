package UD09.DAO.post;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import UD09.DAO.DbConnect;
import UD09.DAO.IRepository;

public class PostRepositoryImpl implements IRepository<Post> {

    private static final String INSERT_QUERY = "INSERT INTO posts (userId, texto) VALUES (?, ?)";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM posts WHERE id = ?";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM posts";
    private static final String UPDATE_QUERY = "UPDATE posts SET texto = ? WHERE id = ?";
    private static final String DELETE_QUERY = "DELETE FROM posts WHERE id = ?";
    private static final String DELETE_POSTS = "DELETE FROM posts WHERE userId = ?";

    //Método para crear un insert a traves de un post
    @Override
    public void crear(Post post) throws SQLException {
        try (Connection con = DbConnect.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement(INSERT_QUERY, PreparedStatement.RETURN_GENERATED_KEYS)) {
            
            //Values(?, ?)
            pst.setInt(1, post.getUsuario_id());
            pst.setString(2, post.getText());

            int filasInsertadas = pst.executeUpdate();
            if (filasInsertadas > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    post.setId(id);
                }
            }
        }
    }

    //Sacar la información de un post a traves del id
    @Override
    public Post obtener(int id) throws SQLException {
        Post post = null;
        try (Connection con = DbConnect.getInstance().getConnection();
            PreparedStatement pst = con.prepareStatement(SELECT_BY_ID_QUERY)) {
            
            //Meter el id en la ? de la query
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int usuario_id = rs.getInt("userId");
                int likes = rs.getInt("likes");
                String fecha = rs.getString("fecha");
                String text = rs.getString("texto");
                post = new Post(id, usuario_id, likes, fecha, text);
            }
        }
        return post;
    }

    //Método para sacar todos los datos que hay en la tabla
    @Override
    public ArrayList<Post> obtenerTodos() throws SQLException {
        Post post = null;
        ArrayList<Post> posts = new ArrayList<>();
        try (Connection con = DbConnect.getInstance().getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(SELECT_ALL_QUERY)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                int usuario_id = rs.getInt("userId");
                int likes = rs.getInt("likes");
                String fecha = rs.getString("fecha");
                String text = rs.getString("texto");
                post = new Post(id, usuario_id, likes, fecha, text);
                posts.add(post);
            }
        }
        return posts;
    }

    @Override
    public void actualizar(Post post) throws SQLException {
        try (Connection con = DbConnect.getInstance().getConnection();
             PreparedStatement pst = con.prepareStatement(UPDATE_QUERY)){
            
            pst.setString(1, post.getText());
            pst.setInt(2, post.getId());
            pst.executeUpdate();
        }
        
    }

    @Override
    public void eliminar(int id) throws SQLException {
        try (Connection con = DbConnect.getInstance().getConnection();
             PreparedStatement pst = con.prepareStatement(DELETE_QUERY)){

            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }

    public static void eliminarPostsUsuario(int user_id) throws SQLException{
        try (Connection con = DbConnect.getInstance().getConnection();
             PreparedStatement pst = con.prepareStatement(DELETE_POSTS)){

            pst.setInt(1, user_id);
            pst.executeUpdate();
        }
    }
    
}
