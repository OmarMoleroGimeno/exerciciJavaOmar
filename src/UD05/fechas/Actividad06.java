package UD05.fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Actividad06 {
    public class Main {
        public static void main(String[] args) {
            Date fechaHoraActual = new Date();
    
            SimpleDateFormat primerFormato = new SimpleDateFormat("MMMM dd, yyyy, h:mm a");
            String resultado1 = primerFormato.format(fechaHoraActual);
            System.out.println("a) " + resultado1);
    
            SimpleDateFormat segundoFormato = new SimpleDateFormat("MM.dd.yy");
            String resultado2 = segundoFormato.format(fechaHoraActual);
            System.out.println("b) " + resultado2);
    
            SimpleDateFormat tercerFormato = new SimpleDateFormat("dd, M, yyyy");
            String resultado3 = tercerFormato.format(fechaHoraActual);
            System.out.println("c) " + resultado3);
    
            SimpleDateFormat cuartoFormato = new SimpleDateFormat("yyyyMMdd");
            String resultado4 = cuartoFormato.format(fechaHoraActual);
            System.out.println("d) " + resultado4);
    
            SimpleDateFormat quintoFormato = new SimpleDateFormat("hh-mm-ss");
            SimpleDateFormat sextoFormato = new SimpleDateFormat("dd-MM-yy");
            String resultado5 = quintoFormato.format(fechaHoraActual) + ", " + sextoFormato.format(fechaHoraActual);
            System.out.println("e) " + resultado5);
    
            SimpleDateFormat septimoFormato = new SimpleDateFormat("E MMM dd HH:mm:ss");
            String resultado6 = septimoFormato.format(fechaHoraActual);
            System.out.println("f) " + resultado6);
    
            SimpleDateFormat octavoFormato = new SimpleDateFormat("HH:mm:ss");
            String resultado7 = octavoFormato.format(fechaHoraActual);
            System.out.println("g) " + resultado7);
        }
    }
}
