package UD05.fechas;

import java.util.Calendar;

public class Actividad07 {
    public static void main(String[] args) {
        int dia = 29;
        int mes = 2;
        int año = 2020;

        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.set(Calendar.YEAR, año);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dia);

        try {
            calendar.getTime();
            System.out.println("LA FECHA ES CORRECTA");
        } catch (Exception e) {
            System.out.println("LA FECHA ES INCORRECTA");
        }
    }
}
