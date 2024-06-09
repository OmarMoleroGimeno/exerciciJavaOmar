package UD09.DAO.comentario;

public class Comentario{
    private int id;
    private int userId;
    private int postId;
    private String text;
    private String date;
    
    public Comentario(int id, int userId, int postId, String text, String date) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
        this.text = text;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", ID del usuario=" + userId + ", ID del post=" + postId + ", Texto=" + text + ", Fecha=" + date   + "]";
    }
}
