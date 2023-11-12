package UD03;

public class Ejercicio17 {

    /*public static double calcularCoste(String libros, String revista, double precioIndividual, int cantidadLibros, int cantidadRevistas){

        if (cantidadLibros > 1 && cantidadLibros <= 5) {
            double precio = cantidadLibros *precioIndividual;
            System.out.println("El precio es: "+precio);
        } else if(cantidadLibros >= 6 && cantidadLibros <= 10){
            double precio = cantidadLibros *precioIndividual -(precioIndividual/10);
            System.out.println("El precio es: "+precio);
        } else if(cantidadLibros>=11 && cantidadLibros <= 20){
            double precio = cantidadLibros *precioIndividual -(precioIndividual/15);
            System.out.println("El precio es: "+precio);
        } else if(cantidadLibros < 20){
            double precio = cantidadLibros *precioIndividual -(precioIndividual/20);
            System.out.println("El precio es: "+precio);
        } else if(cantidadRevistas <= 5){
            double precio = cantidadRevistas *precioIndividual;
            System.out.println("El precio es: "+precio);
        } else if(cantidadRevistas >= 6 && cantidadRevistas <= 10){
            double precio = cantidadRevistas *precioIndividual;
            System.out.println("El precio es: "+precio);
        } else if(cantidadRevistas>=11 && cantidadRevistas <= 20){
            double precio = cantidadRevistas *precioIndividual;
            System.out.println("El precio es: "+precio);
        } else if(cantidadRevistas < 20 && cantidadRevistas <= 100){
            double precio = cantidadRevistas *precioIndividual;
            System.out.println("El precio es: "+precio);
        } else{
            System.out.println("El valor introducido no es correcto");
        }

        return 0.0;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce 1 si quieres libro o 2 si quieres revista");
        int x = entrada.nextInt();

        if (x==1) {
            System.out.println("Introduce el libro que deseas: ");
            String libros = entrada.nextLine();

            entrada.next();

            System.out.println("Introduce el precio de una unidad: ");
            double precioIndividual = entrada.nextDouble();

            System.out.println("Introduce la cantidad de libros que deseas: ");
            int cantidadLibros = entrada.nextInt();

        } else if(x==2) {
            System.out.println("Introduce la revista que deseas: ");
            String revista = entrada.nextLine();

            System.out.println("Introduce el precio de una unidad: ");
            double precioIndividual = entrada.nextDouble();

            System.out.println("Introduce la cantidad de revistas que deseas: ");
            int cantidadRevistas = entrada.nextInt();
        } else{
            System.out.println("El número introdicido no es cálido");
        }

        System.out.println("El precio es: "+calcularCoste(null, null, x, x, x));

        entrada.close();
    }*/
}