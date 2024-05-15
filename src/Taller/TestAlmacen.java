package Taller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestAlmacen{
    private static ArrayList<Herramienta>  al = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);

    //metodo cargaFichero()
    public static void cargaFichero(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("herramientas.bin"))) {
            while (true) {
                oos.writeObject(new Herramienta("Pala", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Rastrillo", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Tijeras de podar", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Manguera", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Cortacésped", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Regadera", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Escoba", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Pulverizador", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Hacha", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Tijeras de seto", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Sierra circular", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Destornillador eléctrico", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Cepillo carpintero", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Formón", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Caladora", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Cincel", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Escuadra", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Hacha", 10.0, LocalDate.of(2024, 04, 07)));
                oos.writeObject(new Herramienta("Lijadora", 10.0, LocalDate.of(2024, 04, 07)));
            }
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }
    }

    //Metodo mostrarLista()
    public static  void mostrarLista(){
        Herramienta h1 = new Herramienta(null, 0, null);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("herramientas.bin"))) {
            while (true) {
                h1 = (Herramienta) ois.readObject();
                al.add(h1);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (Herramienta herramienta : al) {
            System.out.println(herramienta);
        }
    }

    //Metodo mostrarPrestamoNombre() Case 3
    public static void mostrarPrestamoNombre(){
        Collections.sort(al, null);
        for (Herramienta herramienta : al) {
            if (herramienta.getPrestamoCaducado()) {
                System.out.println(herramienta);
            }
        }
    }

    //Metodo mostrarPrestamoFecha() Case 4
    public static void mostrarPrestamoFecha(){
        Collections.sort(al, null);
        for (Herramienta herramienta : al) {
            if (herramienta.getPrestamoCaducado()) {
                System.out.println(herramienta);
            }
        }
    }

    //Metodo mostrarNoPrestadas() Case 5
    public static void mostrarNoPrestadas(){
        for (Herramienta herramienta : al) {
            if (herramienta.getFechaPrestamo() == null) {
                System.out.println(herramienta);
            }
        }
    }

    //C.7 OCurrira que no te dejara anyadirla
    public static void anyadirHerramienta(){
        String[] temp = new String[3];
        String linea = "";
        linea = teclado.nextLine();
        linea.split(",");
        
        al.add(new Herramienta(null, 0, null));
        
    }

    //C.9 guardarHerramientas()
    public static void guardarHerramientas(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("herramientas.bin"))) {

            for (Herramienta herramienta : al) {
                    oos.writeObject(herramienta);
            }
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Almacen a1 = new Almacen("pepe");
        ArrayList<Herramienta> al = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        while (condition) {
            System.out.print("** EXAMEN UD7 ALMACEN **" +
            "\nmenú:" +
            "\n\t1 ) cargar datos proporcionados al fichero." +
            "\n\t2 ) mostrar herramientas cargadas en fichero." +
            "\n\t3 ) mostrar herramientas prestadas ordenadas por nombre." +
            "\n\t4 ) mostrar herramientas prestadas ordenadas por fecha préstamo." +
            "\n\t5 ) mostrar herramientas NO prestadas." +
            "\n\t6 ) añadir herramienta a la lista." +
            "\n\t7 ) eliminar herramienta de la lista" +
            "\n\t8 ) salir." +
            "\n--------------------------------------------------------------------------------------\n");
        numero = entrada.nextInt();

        }

        switch (numero) {
            case 1:
            cargaFichero();
                ;
            case 2:
            mostrarLista();
                    ;
            case 3:
            mostrarPrestamoNombre();
                    ;
            case 4:
            mostrarPrestamoFecha()
                    ;
            case 5:
            mostrarNoPrestadas();
                    ;
            case 6:
            anyadirHerramienta()
                    ;
            case 7:
            eliminarHerramienta();
                    ;
            case 8:
            guardarHerramientas();
            break;
                    ;

            default:
                break;
        }
    }
}
