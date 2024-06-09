package UD08._13_alimento;

public class Main {
    public static void main(String[] args) {

        Huevo huevo = new Huevo("L");
        Clara clara = new Clara( "XL", "Transparente");
        Yema yema = new Yema("M", "Amarillo");

        System.out.println(huevo);
        System.out.println();
        System.out.println(clara);
        System.out.println();
        System.out.println(yema);
    }
}