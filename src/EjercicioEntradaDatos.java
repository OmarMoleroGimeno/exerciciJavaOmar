/*
 * Ejercicio Entrada de Datos
 * se introduce por teclado: nombre, apellidos, edad, num, snni,precio
 * se muestra por pantalla: nombre, apellidos, edad, NIF, precio con iva
 */


public class EjerciciosEntradaDatos{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String apellidos;
        int edad;
        int numDni;
        double sueldo;

        System.out.print("Introduce tu nombre");
        // codigo entrada nombre
        nombre = teclado.nextLine();

        System.out.print("Introduce tus apellidos");
        // codigo entrada apellidos
        apellido = teclado.nextLine();

        System.out.print("Introduce tu edad");
        //  codigo entrada edad
        edad = teclado.nextInt();

        System.out.print("Itroduce tu dni");
        // codigo entrada dni
        numDni = teclado.nextInt();

        System.out.print("Itroduce tu sueldo");
        // codigo entrada sueldo
        sueldo = teclado.nextDouble();

        System.out.print("Tu nombre es" + nombre + " " + apellidos);
        System.out.print("Situ edad es" + edad +(edad<18?" eres menor de edad.":
                                                           "eres mayor de edad."));
        // calcular letra DNI 
        String letraDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numDni % 23;
        System.out.println("Tu NIF es:" + numDNI +"-" + letrasDNI.charAT(resto));
        System.out.print("Si tu sueldo era " + sueldo +
                            " con el incremento será " +sueldo*1.2);
        


    }
}