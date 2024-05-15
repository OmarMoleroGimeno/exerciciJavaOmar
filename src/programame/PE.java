package programame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PE {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        int numAIntroducir = tec.nextInt();
        tec.nextLine();
        ArrayList<Integer> al = new ArrayList<>();
        int num = 0;
        String nombre;

        for (int i = 0; i < numAIntroducir; i++) {
            String cadena = tec.nextLine();
            num = Integer.parseInt(cadena.substring(0, cadena.indexOf(" ")));
            nombre = cadena.substring(cadena.indexOf(" ") + 1);
            if (map.containsKey(num)) {
                map.put(num, "");
            } else {
                map.put(num, nombre);
            }
        }
        
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            num = entry.getKey();
            nombre = entry.getValue();

            if (map.containsKey(num) && nombre != "") {
                al.add(num);
            }
        }

        if (al.size() == 0) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < al.size(); i++) {
                num = al.get(0);
                if (num > al.get(i)) {
                    num = al.get(i);
                }
            }
            System.out.println(map.get(num));
        }
        

        tec.close();
    }
}