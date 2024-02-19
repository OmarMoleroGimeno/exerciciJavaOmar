package UD06.maquinaExpendedora;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Surtido {
    private Producto[] listaProductos;

    public Surtido() throws FileNotFoundException{
        try (BufferedReader br = new BufferedReader(new FileReader("productos.txt"))) {

            br.readLine();
            this.listaProductos = new Producto[numProductos()+1];

            for (int i = 1; i < this.listaProductos.length; i++) {

                String parts[] = br.readLine().split(" ");
                Producto producto = new Producto(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));
                this.listaProductos[i] = producto;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int numProductos(){
        int num = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("productos.txt"))) {
            num = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }
        return num;
    }

    public Producto getProducto(int numProducto){
            return this.listaProductos[numProducto];
    }

    public String[] getNombresProductos(){
        String[] nombresProductos = new String[numProductos() + 1];
        for (int i = 1; i < nombresProductos.length; i++) {
            nombresProductos[i] = (this.listaProductos[i].getNombre());
        }
        return nombresProductos;
    }
}