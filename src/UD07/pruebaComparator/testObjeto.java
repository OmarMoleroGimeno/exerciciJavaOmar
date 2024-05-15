package UD07.pruebaComparator;

import java.util.TreeSet;

public class testObjeto {
    public static void main(String[] args) {
        TreeSet<Objeto> ts = new TreeSet<>(new ObjetoComparator());

        Objeto o1 = new Objeto(0, 1);
        ts.add(o1);
    }
}
