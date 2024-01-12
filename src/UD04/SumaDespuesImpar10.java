package UD04;

public class SumaDespuesImpar10 {
    
    public static int sumarNumeros(int[] v){
        int posicion = -1;
        int suma = 0;
        for (int i = 0; i < v.length && posicion==-1; i++) {
            if (v[i]%2!=0) {
                posicion = i;
            }
        }
        for (int j = posicion+1; j < v.length; j++) {
            suma += v[j];
        }
        return suma;
    }

    
    public static void main(String[] args) {
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*11);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" - ");
        }
        System.out.println(sumarNumeros(numeros));
    }
}
