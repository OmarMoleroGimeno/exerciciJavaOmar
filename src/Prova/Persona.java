package Prova;

import java.util.Scanner;
public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public Persona(){
        this.nombre = "Omar";
        this.edad = 18;
        this.dni = "23319777P";
        this.sexo = 'H';
        this.peso = 72.0;
        this.altura = 1.77;
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this. sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(){
        double pesoIdeal = (peso/(Math.pow(altura, 2)));
        if (pesoIdeal < 20) {
            return "bajo Peso";
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            return "Ideal";
        } else if (pesoIdeal > 25){
            return "sobre Peso";
        } else{
            return "No has puesto los datos correctamente";
        }
    }

    public String esMayorDeEdad(){
        if (this.edad < 18) {
            return "False";
        } else if (this. edad >= 18 && this.edad <= 120) {
            return "True";
        } else {
            return "Estas muerto";
        }
    }

    @Override

    public String toString(){

        return "\n+--------------------------"+
                "\n| Persona\t"+
                "\n|\t"+
                "\n|nombre:\t " + getNombre()+
                "\n|edad:\t " + getEdad()+
                "\n|dni:\t "+ getDni()+
                "\n|sexo:\t "+ getSexo()+
                "\n|peso:\t "+ getPeso() + "Kg"+
                "\n|altura:\t "+ getAltura() + " Metros"+
                "\n+--------------------------";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String dni;
        char sexo;
        double peso;
        double altura;

        Persona p1 = new Persona();

        Persona p2 = new Persona("Arnau", 18, 'H');

        System.out.println("\n\nIntroduce el nombre de la persona3: ");
        nombre = entrada.nextLine();
        System.out.println("Introduce la edad de la persona3: ");
        edad = entrada.nextInt();
        System.out.println("Introduce el DNI de la persona3: ");
        dni = entrada.next();
        System.out.println("Introduce el sexo de la persona3: ");
        sexo = entrada.next().charAt(0);
        System.out.println("Introduce el peso de la persona3 (Kg): ");
        peso = entrada.nextDouble();
        System.out.println("Introduce la altura de la persona3 (m):");
        altura = entrada.nextDouble();
        entrada.close();

        Persona p3 = new Persona(nombre, edad, dni, sexo, peso, altura);

        System.out.println("\n\n" + p1.nombre + " tiene un IMC: " + p1.calcularIMC());
        System.out.println(p2.nombre + " tiene un IMC: " + p2.calcularIMC());
        System.out.println(p3.nombre + " tiene un IMC: " + p3.calcularIMC());

        System.out.println("\n¿" + p1.getNombre() + " es mayor de Edad? " + p1.esMayorDeEdad());
        System.out.println("¿" + p2.getNombre() + " es mayor de Edad? " + p2.esMayorDeEdad());
        System.out.println("¿" + p3.getNombre() + " es mayor de Edad? " + p3.esMayorDeEdad()+ "\n");

        p1.toString();
        p2.toString();
        p3.toString();
    }

}