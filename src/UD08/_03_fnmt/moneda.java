package UD08._03_fnmt;

import java.time.LocalDate;

public abstract class moneda extends dinero{

    private double altura;
    private double anchura;
    
    public moneda(double valor, LocalDate anyoEmision, double altura, double anchura) {
        super(valor, anyoEmision);
        this.altura = altura;
        this.anchura = anchura;
        
    }

    @Override
    public String toString() {
        String str = "";
        str += "\nAtura: " + this.altura;
        str += "\nAnchura: " + this.anchura;
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