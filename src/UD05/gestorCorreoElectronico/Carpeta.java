package UD05.gestorCorreoElectronico;

public class Carpeta {
    private static final int NMAX = 100;
    private Mensaje[] lista;
    private String nombre;
    private int numMensaje;

    public Carpeta(String nombre){
        this.nombre = nombre;
        this.lista = new Mensaje[NMAX];
        this.numMensaje = 0;
    }

    public void añadir(Mensaje m) throws ListaLlenaException{
        if (this.numMensaje < NMAX) {
            this.lista[this.numMensaje] = m;
            this.numMensaje++;
        } else {
            throw new ListaLlenaException();
        }
    }

    public class ListaLlenaException extends Exception{
        public ListaLlenaException(){
            super("La lista esta llena, sorry :/");
        }
    }

    public void borrar(Mensaje m) throws ElementoNoEncotradoException{
        boolean encontrado = false;
        int pos = 0;
        for (int i = 0; i < this.numMensaje && !encontrado; i++) {
            if (this.lista[i].equals(m)) {
                encontrado = true;
                pos = i;
            }
        }
        if (encontrado) {
            for (int i = pos; i < this.numMensaje-1; i++) {
                this.lista [i] = this.lista[i+1];
            }
            this.numMensaje--;
            this.lista[NMAX-1] = null;
        } else {
            throw new ElementoNoEncotradoException();
        }
    }

    public class ElementoNoEncotradoException extends Exception{
        public ElementoNoEncotradoException(){
            super("No se ha encontrado el elemento deseado.");
        }
    }

    public Mensaje buscar(int codigo) throws ElementoNoEncotradoException{
        boolean encontrado = false;
        int pos = 0;
        for (int i = 0; i < numMensaje; i++) {
            if (this.lista[i].getCodigo() == codigo) {
                encontrado = true;
                pos = i;
                return lista[pos];
            }
        }throw new ElementoNoEncotradoException();
    }

    @Override
    public String toString() {
        String str = "\n**** " + this.nombre + "****\n";
        for (int i = 0; i < numMensaje; i++) {
            str += "Mensaje " + (i+1) + this.lista[i];
            str += "\n";
        }
        return str;
    }

    public static void moverMensaje(Carpeta origen, Carpeta destino, int codigo) throws ElementoNoEncotradoException, ListaLlenaException{
        //Buscamos si el mensaje esta en la carpeta de origen, y si esta lo guardamos en un auxiliar.
        Mensaje aux = origen.buscar(codigo);
        //Lo añadimos al de destinatario.
        destino.añadir(aux);
        //Borramos el mensaje una vez encontrado lo borramos del origen.
        origen.borrar(aux);
    }
}