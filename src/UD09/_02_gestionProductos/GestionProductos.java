package UD09._02_gestionProductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import UD09.Conexion;

public class GestionProductos {

    public static int paginaActual = 0;

    public static void mostrarSiguientePagina(Connection conn){
        try (Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            //Seleccionar toda la tabla
            ResultSet rs = st.executeQuery("SELECT * FROM productos");
            paginaActual++;
            //Contador para solo mostrar 5
            int cont = 0;
            //Para poder guardar en que posicion vas a empezar a sacar
            int numActual = (paginaActual * 5);
            while (rs.next() && cont < 6) {
                rs.absolute(numActual);
                System.out.println("ID: " + rs.getInt(1) + " - Nombre: " +
                                    rs.getString(2) + " - Precio: " + rs.getDouble(3));
                numActual++;
                cont++;
            }
            System.out.println(paginaActual);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarAnteriorPagina(Connection conn){
        try (Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            //Seleccionar toda la tabla
            ResultSet rs = st.executeQuery("SELECT * FROM productos");
            //Ir a la pagina anterior
            paginaActual--;
            System.out.println(paginaActual);
            //Contador para solo mostrar 5
            int cont = 0;
            int numActual = 0;
            //Para poder guardar en que posicion vas a empezar a sacar
            if (paginaActual == 0) {
                numActual = 1;
            } else {
                numActual = (paginaActual * 5);
            }
            while (rs.next() && cont < 6) {
                rs.absolute(numActual);
                System.out.println("ID: " + rs.getInt(1) + " - Nombre: " +
                                    rs.getString(2) + " - Precio: " + rs.getDouble(3));
                numActual++;
                cont++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void paginaDeseada(Connection conn, int num){
        try (Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            //Seleccionar toda la tabla
            ResultSet rs = st.executeQuery("SELECT * FROM productos");
            int cont = 0;
            int numActual;
            if (num == 0) {
                numActual = 1;
            } else {
                numActual = (num * 5);
            }
            while (rs.next() && cont < 6) {
                rs.absolute(numActual);
                System.out.println("ID: " + rs.getInt(1) + " - Nombre: " +
                                    rs.getString(2) + " - Precio: " + rs.getDouble(3));
                numActual++;
                cont++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarProductosPorPagina(Connection conn, int num){
        Scanner tec = new Scanner(System.in);
        try (Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            ResultSet rs = st.executeQuery("SELECT * FROM productos");
            switch (num) {
                case 1:
                    for (int i = 1; i < 6; i++) {
                        rs.absolute(i);
                        System.out.println("ID: " + rs.getInt(1) + " - Nombre: " +
                                            rs.getString(2) + " - Precio: " + rs.getDouble(3));
                    }
                    break;
                case 2:
                    mostrarSiguientePagina(conn);
                    break;
                case 3:
                    mostrarAnteriorPagina(conn);
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.print("Introduce la página que quieres listar: ");
                    int numero = tec.nextInt();
                    tec.close();
                    paginaDeseada(conn, numero);
                    break;
            }
        rs.close();
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }

    public static void menu(){
        String menu = "\nPaginación:\n"+
                      "1)Primera página\n" +
                      "2)Página siguiente\n" +
                      "3)Página anterior\n" +
                      "4)Última página\n" +
                      "5)Página deseada\n" +
                      "6)Salir";
        System.out.println(menu);
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(Conexion.JDBC_URL, Conexion.USUARIO, Conexion.CONTRASEÑA)){
            int num = 0;
            do {
                menu();
                num = tec.nextInt();
                mostrarProductosPorPagina(conn, num);
            } while (num!=6);


            tec.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error de SQL: " + ex.getMessage());
        }
    }
}