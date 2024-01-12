package UD04;

public class capicua12{
    public static boolean capICua(){
        String[] v = {"omar", "pau", "pau", "omar"};
        String[] v2 = {"omar", "pau", "pau", "omar"};
        boolean sonCapICua = false;
        for (int i = 0, j = v.length; i < v.length && i == (v.length); i++, j--) {
            if (v[i].equals(v2[j])) {
                sonCapICua = true;
            } else {
                sonCapICua = false;
                break;
            }
        }return sonCapICua;
    }
    public static void main(String[] args) {
        System.out.println(capICua());
    }
}