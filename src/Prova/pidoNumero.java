package Prova;
import javax.swing.JOptionPane;

public class pidoNumero {
    public static void main(String[] args) {
        int num = 0;
        do {
            String texto=JOptionPane.showInputDialog("Introduce el numero entre el 1 y 10: ");
            num = Integer.parseInt(texto);
        } while (num>10 || num<=0);
        
        JOptionPane.showMessageDialog(null, "El numero introducido es "+num);
        
    }
}
