package UD05.gestionHospital;
import UD05.gestionHospital.Paciente.MaximoEstadoException;

public class Hospital {
    
    private static final  int MAXC = 200;
    private Paciente[] listaCamas;
    private int numLibres;

    public Hospital(){
        this.listaCamas = new Paciente[MAXC+1];
        this.numLibres = MAXC;
    }

    public int getNumLibres(){
        return this.numLibres;
    }

    public boolean hayLibre(){
        return this.numLibres > 1;
    }

    public int primeraLibre(){
        boolean encontrada = false;
        int pos = 1;
        for (int i = 1; i <= MAXC && !encontrada; i++) {
            if (listaCamas[i] == null) {
                pos = i;
                encontrada = true;
            }
        }
        return pos;
    }

    public void ingresarPaciente(String n, int e) throws HospitalLlenoException{
        if (this.hayLibre()) {
            this.listaCamas[primeraLibre()] = new Paciente(n, e);
            this.numLibres --;
            System.out.println("Paciente " + n + " añadido en el hospital.");
        } else {
            throw new HospitalLlenoException();
        }
    }

    static class HospitalLlenoException extends Exception{
        public HospitalLlenoException(){
            super("No hay camas disponibles");
        }
    }

    private void darAltaPaciente(int i){
        for (int j = i; j < MAXC; j++) {
            this.listaCamas[j] = this.listaCamas[j+1];
        }
        listaCamas[MAXC] = null;
        this.numLibres++;
    }

    public void darAltas(){
        for (int i = 1; i <= MAXC && listaCamas[i] != null; i++) {

            try {
                    listaCamas[i].mejorar();
                } catch (MaximoEstadoException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }

            if (listaCamas[i].getEstado() == 6) {
                this.darAltaPaciente(i);
                i--;
            }
        }
    
    }

    @Override
    public String toString() {
        String str = "Paciente del hospital: \n";

        for (int i = 0; (i < MAXC) && (!listaCamas[i].equals(null)); i++) {
            str += i + ": " + listaCamas[i] + "\n";
        }
        return str;
    }
    public static void main(String[] args) {
        
    }
}