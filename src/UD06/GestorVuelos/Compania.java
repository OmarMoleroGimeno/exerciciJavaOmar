package UD06.GestorVuelos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;

public class Compania {
    private final static  int VMAX = 10;
    private String nombre;
    private Vuelo[] listaVuelos;
    private int numVuelos;

    public Compania(String n) throws FileNotFoundException{
        this.nombre = n;
        this.listaVuelos = new Vuelo[VMAX];
        leeVuelos();
    }

    private void leeVuelos() throws FileNotFoundException{
        String fichero = this.nombre + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String id = linea;
                String orig = br.readLine();
                String dest = br.readLine();
                int hSal = Integer.parseInt(br.readLine());
                int mSal = Integer.parseInt(br.readLine());
                int hLle = Integer.parseInt(br.readLine());
                int mLle = Integer.parseInt(br.readLine());

                if(this.numVuelos < VMAX){
                    this.listaVuelos[numVuelos] = new Vuelo(id, orig, dest, LocalTime.of(hSal, mSal), LocalTime.of(hLle, mLle));
                    this.numVuelos++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public Vuelo buscarVuelo(String id) throws ElementoNoEncontradoException{
        boolean encontrado = false;
        int pos = 0;
        for (int i = 0; i < numVuelos; i++) {
            if (this.listaVuelos[i].getIdentificador().equals(id)) {
                encontrado = true;
                pos = i;
            }
        }
        if (encontrado) {
            return this.listaVuelos[pos];
        } else {
            throw new ElementoNoEncontradoException();
        }
    }

    public void mostrarVuelosIncompletos(String o, String d){
        for (int i = 0; i < this.numVuelos; i++) {
            if (o.equals(listaVuelos[i].getOrigen()) && d.equals(listaVuelos[i].getDestino()) && listaVuelos[i].hayLibres()) {
                System.out.println(this.nombre + " - " + this.listaVuelos[i].cabecera());
            }
        }
    }

    static class ElementoNoEncontradoException extends Exception{
        
        public ElementoNoEncontradoException(){
            super ("Vuelo no encontrado");
        }
    }
    
}

