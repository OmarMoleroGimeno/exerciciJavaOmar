package ud01;

/*. Realizar un programa que realice el cálculo del precio de un producto teniendo en cuenta que el producto
vale 120 €, tiene un descuento del 15% y el IVA que se le aplica es del 21%.
 */

public class Actividad16 {
    public static void main(String[] args){
    int precio = 120;
    double descuento = precio - (precio* 0.15) + (precio * 0.21) ;
    System.out.println("Precio del descuento: " + descuento + "$");
    
    }
}
