package Taller;
import java.time.LocalDate;
import java.util.ArrayList;

public class Almacen{
    private String nombre;
    private ArrayList<Herramienta> listaHerramientas;
    
    
    public Almacen(String nombre) {
        this.nombre = nombre;
        this.listaHerramientas = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Herramienta> getListaHerramientas() {
        return listaHerramientas;
    }
    
    public void setListaHerramientas(ArrayList<Herramienta> listaHerramientas) {
        this.listaHerramientas = listaHerramientas;
    }

    public void anyadirHerramienta(Herramienta herramienta) throws AlmacenLlenoException{
        if (this.listaHerramientas.size() < 20) {
            this.listaHerramientas.add(herramienta);
        }else{
            throw new AlmacenLlenoException();
        }
    }


    public void eliminarHerramienta(String nombre) throws HerramientaNoEncontradaException{
        boolean encontrado = false;
        for (Herramienta herramienta : listaHerramientas) {
            if (herramienta.getNombre().equals(nombre) && encontrado == true) {
                this.listaHerramientas.remove(herramienta);
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new HerramientaNoEncontradaException();
        }
    }

    public void prestarHerramientas(String nombre, LocalDate fecha) throws HerramientaNoEncontradaException{
        boolean encontrado = false;
        for (Herramienta herramienta : listaHerramientas) {
            if (herramienta.getNombre().equals(nombre) && encontrado== true) {
                herramienta.setFechaPrestamo(fecha);
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new HerramientaNoEncontradaException();
        }
    }

    public void devolverHerramienta(String nombre) throws HerramientaNoEncontradaException, HerramientaNoPrestadaException{
        boolean encontrado = false;
        for (Herramienta herramienta : listaHerramientas) {
            if (herramienta.getNombre().equals(nombre) && encontrado == true) {
                if (herramienta.getFechaPrestamo() == null) {
                    throw new HerramientaNoPrestadaException();
                }
                herramienta.setFechaPrestamo(null);
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new HerramientaNoEncontradaException();
        }
    }

    static class AlmacenLlenoException extends Exception{
        public AlmacenLlenoException(){
            super("El almacen esta lleno...");
        }
    }

    static class HerramientaNoEncontradaException extends Exception{
        public HerramientaNoEncontradaException(){
            super("La herramienta no se encuentra en la lista...");
        }
    }

    static class HerramientaNoPrestadaException extends Exception{
        public HerramientaNoPrestadaException(){
            super("La herramienta no a sido prestada...");
        }
    }

    public String ListarPrestamosCaducados(){
        String str = "";
        for (Herramienta herramienta : listaHerramientas) {
            if (herramienta.getPrestamoCaducado()) {
                str += "Nombre:  " + herramienta.getNombre() +
                    "\nPrecio:  " + herramienta.getPrecio() + 
                    "\nFecha Préstamo:  " + herramienta.getFechaPrestamo() +
                    "---------------------------------------------------------";
            }
        }
        return str;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Herramientas: " + this.nombre;
        for (Herramienta herramienta : listaHerramientas) {
            str += "\n\tNombre:  " + herramienta.getNombre() + 
                    "\n\tPrecio:  " + herramienta.getPrecio() + 
                    "\n\tFecha Préstamo:  " + herramienta.getFechaPrestamo() +
                    "---------------------------------------------------------";  
        }
        return str;
    }
}
