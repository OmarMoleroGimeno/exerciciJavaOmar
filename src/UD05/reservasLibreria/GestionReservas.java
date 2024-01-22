package UD05.reservasLibreria;

import java.util.Scanner;

import UD05.reservasLibreria.ListaReservas.ElementoDuplicadoException;
import UD05.reservasLibreria.ListaReservas.ElementoNoEncontradoException;
import UD05.reservasLibreria.ListaReservas.ListaLlenaException;

public class GestionReservas {
    static Scanner entrada = new Scanner(System.in);

    public static void menu(){
        System.out.println("*** menú de gestión de reservas ***");
        System.out.println("1) reslizar reservas");
        System.out.println("2) Anular reserva");
        System.out.println("3) Pedido");
        System.out.println("4) recepción");
        System.out.println("5) Salir del programa");
        System.out.println("--------------------------------------");
    }

    public static Reserva menuReserva(){
        System.out.println("***** RESERVA 1 *****");
        System.out.print("Introduzca el Nif: ");
        String Nif = entrada.next();
        System.out.print("Introduzca el nombre: ");
        String nombre = entrada.next();
        System.out.print("Introduzca el nº de teléfono: ");
        String telefono = entrada.next();
        System.out.print("Introduzca el código del libro: ");
        int código = entrada.nextInt();
        System.out.print("Introduzca los ejemplares: ");
        int ejemplares = entrada.nextInt();

        Reserva r1 = new Reserva(Nif, nombre, telefono, código, ejemplares);
        return r1;
    }

    public static void main(String[] args) {
        int opcio, codigo = 0;
        String nif;
        ListaReservas lr1 = new ListaReservas();
        do {
            menu();
            opcio = entrada.nextInt();

            switch (opcio) {
                case 1: //Reservar
                    try {
                        lr1.reservar(menuReserva());
                    } catch (ListaLlenaException | ElementoDuplicadoException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case 2: //Anular Reserva
                entrada.nextLine();
                    System.out.println("Introduce dni: ");
                    nif = entrada.nextLine();
                    System.out.println("Introduce el código: ");
                    codigo = entrada.nextInt();

                    try {
                        lr1.cancelar(nif, codigo);
                    } catch (ElementoNoEncontradoException e) {
                        System.out.println("ERROR: " + e.getCause());
                    }
                    break;
                case 3: //Nº Pedidos
                    System.out.println("Introduce el código: ");
                    codigo = entrada.nextInt();
                    System.out.println("Número de ejemplares del libro " + codigo + ": " + lr1.numEjemplaresReservadosLibro(codigo));
                    break;
                case 4://Lalamar a clientes
                    System.out.println("Introduce código: ");
                    codigo = entrada.nextInt();
                    lr1.reservasLibro(codigo);
                    break;
                case 5://mostrar las reservas
                    System.out.println(lr1);

                    break;
                default:
                    System.out.println("Opción incorreta");
                    break;
            }
        } while (opcio!=5);
    }
}