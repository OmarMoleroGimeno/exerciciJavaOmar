package UD07.prova;

public class ClaseGenerica<T> {
    T aux;

    public void invertir (T[] lista){
        for (int i = 0; i < lista.length/2; i++) {
            aux = lista[i];
            lista[i] = lista[lista.length -1 -i];
            lista[lista.length -1 -i] = aux;
        }
    }

    public static void main(String[] args) {
        Integer[] enteros = {0,1,2,3,4,5,6,7,8,9};
        Double[] decimales = {1.1, 2.2, 3.3};

        ClaseGenerica<Integer> u1 = new ClaseGenerica<>();
        u1.invertir(enteros);
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i] + " ");
        }
        System.out.println();

        ClaseGenerica<Double> u2 = new ClaseGenerica<>();
        u2.invertir(decimales);
        for (int i = 0; i < decimales.length; i++) {
            System.out.print(decimales[i] + " ");
        }
        System.out.println();
    }
    
}