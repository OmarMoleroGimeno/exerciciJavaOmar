package UD08._01centroestudios;

public class AulaMusica extends Aula{
    private boolean tienePiano;

    public AulaMusica(double longitud, double anchura, boolean piano) {
        super(longitud, anchura);
        this.tienePiano = piano;
    }

    @Override
    public String toString() {
        
        return  "Aula de musica:\n" +
                super.toString() +
                "\tpiano: " + (this.tienePiano? "sí" : "no");
    }
    
}