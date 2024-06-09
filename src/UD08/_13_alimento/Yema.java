package UD08._13_alimento;

public class Yema extends Huevo{
    private String color;

    public Yema(String tamanho, String color) {
        super(tamanho);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                super.toString() +   
                " color: " + color;
    }
}