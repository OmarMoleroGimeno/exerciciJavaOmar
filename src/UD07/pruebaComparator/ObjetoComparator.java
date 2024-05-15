package UD07.pruebaComparator;

import java.util.Comparator;

public class ObjetoComparator implements Comparator<Objeto>{
    
    @Override
    public int compare (Objeto o1, Objeto o2){
        return (o1.getA() + o1.getB()) - (o2.getA() + o2.getB());
    }
}
