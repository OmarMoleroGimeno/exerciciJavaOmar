package UD07.prova;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class EscrituraEnHash {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))) {
            String num;
            HashSet<Integer> hash  = new HashSet<>();
            while ((num = br.readLine()) !=null) {
                num = num.trim();
                hash.add(Integer.parseInt(num));
            }
            for (Integer integer : hash) {
                System.out.println(integer);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
