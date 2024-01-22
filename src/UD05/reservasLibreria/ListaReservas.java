package UD05.reservasLibreria;

public class ListaReservas {
    private final int NMAX = 100;
    private Reserva[] lista;
    private int numReservas;

    public ListaReservas(){
        this.lista = new Reserva[NMAX];
        this.numReservas = 0;
    }

    public void reservar(String nif, String nombre, String telefono, int libro, int
    ejemplares) throws ListaLlenaException, ElementoDuplicadoException{

        if (this.numReservas < NMAX){
            Reserva rNuReserva = new Reserva(nif, nombre, telefono, ejemplares);
            int position = 0;
            while (position < NMAX && lista[position] != null) {
                if (rNuReserva.equals(this.lista[position])) {
                    throw new ElementoDuplicadoException();
                }
                position++;
                this.lista[position] = rNuReserva;
                this.numReservas++;
            }
        }else {
                throw new ListaLlenaException();
        }
    }

    public void reservar(Reserva r) throws ListaLlenaException, ElementoDuplicadoException{

        if (this.numReservas < NMAX){
            int position = 0;
            while (position < NMAX && lista[position] != null) {
                if (r.equals(this.lista[position])) {
                    throw new ElementoDuplicadoException();
                }
                position++;
                this.lista[position] = r;
                this.numReservas++;
            }
        }else {
                throw new ListaLlenaException();
        }
    }

    static class ElementoDuplicadoException extends Exception {
        public ElementoDuplicadoException(){
            super("Corredor ya inscrito en la lista");
        }
    }

    static class ListaLlenaException extends Exception {
        public ListaLlenaException (){
            super ("*** la lista ya está llena ***");
        }
    }

    public void cancelar(String nif, int libro) throws ElementoNoEncontradoException{
        boolean encontrado = false;
        int posicion = 0;

        for (int i = 0; i < this.numReservas && !encontrado; i++) {
            if (lista[i].getNif() == nif && this.lista[i].getCódigo() == libro) {
                posicion = i;
                encontrado = true;
            }
        }
        if (encontrado) {
            for (int i = posicion; i < this.numReservas-1; i++) {
                this.lista[i] = this.lista[i+1];
            }
            this.lista[numReservas-1] = null;
            this.numReservas--;
        } else{
            throw new ElementoNoEncontradoException();
        }
    }

    public class ElementoNoEncontradoException extends Exception{
        public ElementoNoEncontradoException(){
            super ("No se ha encontrado la reserva");
        }
    }

    @Override
    public String toString() {
        String str = "*** " + this.numReservas + "***\n";
        for (int i = 0; i < NMAX; i++) {
            str += "Reserva " + (i+1) + ": \n";
            str += this.lista[i];
            str += "\n";
        }
        return str;
    }

    public int numEjemplaresReservadosLibro(int codigo){

        int sumaEjemplares = 0;
        for (int i = 0; i < this.numReservas; i++) {
            if (this.lista[i].getCódigo() == codigo) {
                sumaEjemplares += this.lista[i].getEjemplares();
            }
        }
        return sumaEjemplares;
    }

    public void reservasLibro(int codigo){
        for (int i = 0; i < this.numReservas; i++) {
            if (this.lista[i].getCódigo() == codigo) {
                System.out.println("Cliente: " + this.lista[i].getNombre());
                System.out.println("Cliente: " + this.lista[i].getNombre());
            }
        }
    }
}
