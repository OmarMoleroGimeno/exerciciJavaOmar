package UD05.contrareloj;

public class ListaCorredores {
    private final static int NMAX = 200;
    private Corredor[] lista;
    private int numCorredores;

    public ListaCorredores(){
        this.lista = new Corredor[NMAX];
        this.numCorredores = 0;
    }

    public void anyadir(Corredor c) throws ElementoDuplicadoException {
        boolean encontrado = false;
        int i;
        for (i = 0; i < NMAX && !encontrado && this.lista[i]!=null; i++) {
            if (c.equals(this.lista[i])){
                encontrado = true;
            }
        }
        if (!encontrado){
            this.lista[i] = c;
            this.numCorredores++;
        } else {
            throw new ElementoDuplicadoException();
        }
    }

    public void insertarOrdenado(Corredor c) throws ListaLlenaException{
        boolean encontrado = false;
        int i;

        if (this.numCorredores<NMAX){
            for (i=0; lista[i]!=null && !encontrado; i++){
                if (c.getTiempo()<lista[i].getTiempo()){
                    encontrado = true;
                }
            }
            for (int j=this.numCorredores; j > i+1; j--){
                this.lista[j] = this.lista[j-1];
            }
            this.lista[i] = c;
            this.numCorredores++;
        } else {
            throw new ListaLlenaException();
        }
    }

    public Corredor quitar(int dorsal) throws ElementoNoEncontradoException{
        boolean encontrado = false;
        Corredor corredorEliminado = null;
        int pos=0;
        for (int i = 0; i < NMAX  &&  !encontrado  && this.lista[i]!=null; i++) {
            if (this.lista[i].getDorsal()==dorsal){
                encontrado = true;
                pos = i;
            }
        }
        if (encontrado){
            corredorEliminado = this.lista[pos];
            for (int j = pos; j < NMAX - 1  &&  this.lista[j]!=null; j++) {
                this.lista[j] = this.lista[j+1];
            }
            this.lista[NMAX-1] = null;
            this.numCorredores--;
        } else {
            throw new ElementoNoEncontradoException();
        }

        return corredorEliminado;

    }

    @Override
    public String toString(){
        String str = "";

        for (int i = 0; i < NMAX  && this.lista[i]!=null; i++) {
            str += "Posición: " + (i+1);
            str += "\n  Dorsal: " + this.lista[i].getDorsal();
            str += "\n  Nombre: " + this.lista[i].getNombre();
            str += "\n  Tiempo: " + this.lista[i].getTiempo()/(double)60 + " minutos";
        }

        return str;
    }

    static class ListaLlenaException extends Exception {
        public ListaLlenaException (){
            super ("lista llena, punto, para qué quieres más?");
        }
    }

    static class ElementoDuplicadoException extends Exception {
        public ElementoDuplicadoException(){
            super("Corredor ya inscrito en la lista");
        }
    }

    static class ElementoNoEncontradoException extends Exception{
        public ElementoNoEncontradoException (){
            super("Corredor no encontrado en la lista.");
        }
    }


}
