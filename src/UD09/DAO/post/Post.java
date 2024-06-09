package UD09.DAO.post;

public class Post {
    private int id;
    private int usuario_id;
    private int likes;
    private String fecha;
    private String text;


    public Post(int id, int usuario_id, int likes, String fecha, String text) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.likes = likes;
        this.fecha = fecha;
        this.text = text;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return  "Usuario [id=" + id + ", id_usuario=" + usuario_id + ", titulo=" +
                ", likes=" + likes + ", fecha=" + fecha + ", text=" + text +"]";
    }
}