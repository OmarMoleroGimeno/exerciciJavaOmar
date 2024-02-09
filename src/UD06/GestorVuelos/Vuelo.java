package UD06.GestorVuelos;

import java.time.LocalTime;
import java.util.Objects;

public class Vuelo {
    private String identificador;
    private String origen;
    private String destino;
    private LocalTime hSalida;
    private LocalTime hLlegada;
    private static final  int NMAX = 50;
    private String[] asiento;
    private int numP;

    public Vuelo(String id, String orig, String dest, LocalTime hsal,
                  LocalTime hlleg){
                      this.identificador = id;
                      this.origen = orig;
                      this.destino = dest;
                      this.hSalida = hsal;
                      this.hLlegada = hlleg;
                      this.asiento = new String[NMAX+1];
                      this.numP = 0;
    }

      public String getIdentificador() {
        return identificador;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public boolean hayLibres(){
        return(NMAX > numP?true:false);
    }

    public boolean equals(Object o){
        if (this == o) {
            return true;
        } else if(o == null) {
            return false;
        } else if (this.getClass() != o.getClass()) {
            return false;
        }
        Vuelo other = (Vuelo)o;
        return Objects.equals(this.getIdentificador(), other.getIdentificador());
    }

    private int asientoLibre(char pref) throws PreferenciaNoValidaException{
        int inicio;
        if (Character.toLowerCase(pref) == 'v') {
            inicio = 1;
        } else if(Character.toLowerCase(pref) == 'p') {
            inicio = 2;
        } else {
            throw new PreferenciaNoValidaException();
        }
        for (int i = inicio; i < NMAX + 1; i+=2) {
            if (this.asiento[i] == null) {
                return i;
            }
        }
        return 0;
    }

    public int reservarAsiento(String pas, char pref) throws VueloCompletoException, PreferenciaNoValidaException{
        int numAsiento;
        pref = Character.toLowerCase(pref);
        if (hayLibres()) {
            numAsiento = asientoLibre(pref);
            if (numAsiento != 0) {
                numAsiento = asientoLibre(pref=='v'?'p':'v');
            }   this.asiento[numAsiento] = pas;
                this.numP++;
                return numAsiento;
        } else {
            throw new VueloCompletoException();
        }
    }
    
    static class VueloCompletoException extends Exception{
        public VueloCompletoException(){
            super("Lo sentimos, el vuelo esta lleno :/");
        }
    }

    static class PreferenciaNoValidaException extends Exception{
        public PreferenciaNoValidaException(){
            super("La preferéncia no es válida");
        }
    }

    public void cancelarReserva(int numAsiento){
        this.asiento[numAsiento] = null;
        this.numP--;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Vuelo:\n" +
                this.identificador + " " +
                this.origen + "/" + this.destino + " " +
                this.hSalida + "/" + this.hLlegada +
                "\nPasajeros (" + this.numP + "):\n";
        for (int i = 0; i < NMAX + 1; i++) {
            if (this.asiento[i] != null) {
                str += " asiento " + i + ": " + this.asiento[i] + "\n";
            }
        };
        return str;
    }

    public String cabecera(){
        return  "Vuelo " + this.identificador + " " +
                this.origen + "/" + this.destino + " " +
                this.hSalida + "/" + this.hLlegada;
    }
}