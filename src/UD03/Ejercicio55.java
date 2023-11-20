package UD03;

public class Ejercicio55 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        boolean p;

        //Una única instrucción if sin anidamientos.
        if (a > b && a > c) {
            p = true;
        } else if (b > a && b > c) {
            p = false;
        } else if (c > a && c > b) {
            p = false;
        } else {
            p = true;
        }
        

        //Una única instrucción, de la forma p = ... , sin sentencias if ni utilizar el operador ternario.
        p = (a > b && a > c) || (!(b > a && b > c) && !(c > a && c > b));



        //Una única instrucción, de la forma p = ..., que utilice el operador ternario.
        p = (a > b && a > c) ? true : ((!(b > a && b > c) && !(c > a && c > b)) ? true : false);
        
    }
}
