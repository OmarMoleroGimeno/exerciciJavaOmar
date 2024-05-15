package UD07.actividades;

import java.util.ArrayList;
import java.util.Iterator;

public class actividad01 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(6);
        al.add(3);
        al.add(2);
        al.add(0);
        al.add(4);
        al.add(5);

        System.out.println(al);
        System.out.println(al.get(5));
        al.add(5, 8);
        al.set(1, 9);
        al.remove(al.indexOf(5));
        al.remove(3);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println();

        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        al.contains(0);
        al.contains(7);

        ArrayList<Integer> copArrayList = new ArrayList<>();
        copArrayList.addAll(al);
        
        copArrayList.add(9);
        System.out.println(al.indexOf(9));
        System.out.println(al.lastIndexOf(9));
        copArrayList.clear();
        System.out.println(copArrayList);
        Integer[] Array = new Integer[al.size()];
        al.toArray(Array);
        for (Integer item : Array) {
            System.out.print(item + " ");
        }

    }
}
