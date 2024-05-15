package UD07.prova;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjemploListas {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(3);
        ll.add(1, 2);
        ll.add(ll.get(1) + ll.get(2));
        ll.remove(0);

        for (Integer item : ll) {
            System.out.print(item + " ");
        }
        System.out.println("------------");

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(10);
        al.set(al.indexOf(11), 12);
    }
    
}