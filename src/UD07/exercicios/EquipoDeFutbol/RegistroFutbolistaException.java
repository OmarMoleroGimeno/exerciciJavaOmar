package UD07.exercicios.EquipoDeFutbol;

public class RegistroFutbolistaException extends Exception{
    
    public RegistroFutbolistaException(Futbolista futbolista){
        super("No se puede añadir en la posición " + futbolista.getPosicion().getNombrePosicion() +
             " el futbolista: " + futbolista.getNombre() + ", en la posición: " + futbolista.getPosicion());
    }
}
