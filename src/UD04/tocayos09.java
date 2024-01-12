package UD04;

public class tocayos09 {
    public static void main(String[] args) {
        String[] grupo1 = {"miguel","josé","ana","maría"};
        String[] grupo2 = {"ana", "luján", "juan", "josé",
                            "pepa", "ángela", "sofía", "andrés",
                            "bartolo"};
        boolean esTocayo = false;
        int cont = 0;
        for (int i = 0; i < grupo1.length && esTocayo; i++) {
            for (int j = 0; j < grupo2.length; j++) {
                if (grupo1[i].equals(grupo2[j]) ) {
                    System.out.println(grupo1[i]+" tiene un tocayo en el grupo 2.");
                    cont++;
                }
            }
        }
        System.out.println("Hay "+cont+" personas tienen un tocayo en el segundo grupo.");
    }
}
