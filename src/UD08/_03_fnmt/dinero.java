package UD08._03_fnmt;

import java.time.LocalDate;

public abstract class dinero {
    protected double valor;
    protected LocalDate anyoEmision;

    public dinero(double valor, LocalDate anyoEmision) {
        this.valor = valor;
        this.anyoEmision = anyoEmision;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        } else if (this.getClass() != o.getClass()) {
            return false;
        }
        dinero other = (dinero) o;
        if ((this.valor == other.valor) && (this.anyoEmision.equals(other.anyoEmision))) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(){
        if (this.anyoEmision.compareTo(anyoEmision) == 0) {
            return this.valor - valor > 0? 1 : -1;
        } else {
            return this.anyoEmision.compareTo(anyoEmision);
        }
    }

    @Override
    public String toString() {
        return  "\nValor: " + this.valor +
                "\nAño de emisión: " + this.anyoEmision;
    }

    public abstract String mostrarDatos();

}