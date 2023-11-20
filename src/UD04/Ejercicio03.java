package UD04;

public class Ejercicio03 {
    private static final int LANZAMIENTOS = 100000;
    private static final int FRECUENCIA = 1000;

    public static int tirarDado(){
        return (int)(Math.random()*6+1);
    }

    
    public static void main(String[] args) {
        int[] veces = new int[6];

        for (int i = 1; i <= LANZAMIENTOS; i++) {
            switch (tirarDado()) {
                case 1: veces[0]++;
                    break;

                case 2: veces[1]++;
                    break;

                case 3: veces[2]++;
                    break;

                case 4: veces[3]++;
                    break;

                case 5: veces[4]++;
                    break;
                
                case 6: veces[5]++;
                    break;
            }
            if (i%FRECUENCIA==0){
                System.out.println("\nNúmero de lanzamientos: "+i);
                for (int j = 0; j < veces.length; j++) {
                    System.out.printf("\n%d: %.2f%%", j, (double)veces[j]*100/i);
                }
                System.out.println();
            }
        }
    }
}
