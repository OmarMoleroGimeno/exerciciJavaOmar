package UD08._07_obra;

public class respuestas {
    //a) Indicar qué líneas del siguiente fragmento de programa producirán errores de compilación,

    // Montador m1 = new Carpintero();

    // Error, albañil n imlementa Montador
    // Montador m2 = new Albañil();

    // Obrero o1 = new Carpintero();

    // Obrero o2 = new Albañil();
    
    //Error, no pot gastar el método montar perque no implementa Montador
    // o1.montar("Mesa");
    //Error, no pot gastar el método montar perque no implementa Montador
    // o2.levantarMuro();

    //Error, no pq sols pot utilitzar els métodes de Montador
    // m1.saludar();

    // m1.montar("Silla");

    // ((Albañil)o2).levantarMuro();
    
    //Error pq es carpinter i no pot castejar directament a albañil
    
    // ((Albañil)o1).levantarMuro();
}