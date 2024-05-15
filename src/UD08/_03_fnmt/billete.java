package UD08._03_fnmt;

import java.time.LocalDate;

public abstract class billete extends dinero{

    private double diametro;
    private double peso;

    public billete(double diametro, double peso, LocalDate anyoEmision, double valor){
        super(valor, anyoEmision);
        this.diametro = diametro;
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += "\nDiametro: " + this.diametro;
        str += "\nPeso: " + this.peso;
        return str;
    }

    @Override
    public String mostrarDatos(){
        String str = "Billete";
        str += super.toString();
        str += this.toString();
        return str;
    }
}