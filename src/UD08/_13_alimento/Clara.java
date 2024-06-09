package UD08._13_alimento;

public class Clara extends Huevo{
    private String color;

    public Clara(String tamanho, String color) {
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