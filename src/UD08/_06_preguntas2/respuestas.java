package UD08._06_preguntas2;

public class respuestas {
    /*
     *a) ¿Es necesario el uso de this en el constructor de la clase Estudiante?
     * No, ya que no hay otro atributo que se le pase por parámetro igual.
     *
​     * b) ¿Es necesario el uso de super en el método toString de la clase Estudiante?
     * No, si quieres implementar otro tipo de toString que sobre escribira sobre el anterior por el @Override
     *
​     * c) Si quitásemos el constructor de la clase Estudiante ¿daría un error de compilación?
     * No, utilizaria el de por defecto inializando los atributos a null o 0
     *
​     * d) En el método toString de la clase Empleado ¿por qué es incorrecto el acceso que se hace al atributo nombre?
     *    ¿Cómo se tendría que definir nombre en la clase Persona para evitar el error?
     * És incorrecto porque accede a el sin el getNombre(), por tanto la intgridad de los datos se pierde, lo que debe hacer
     * és declararlo privado y utilizar el getNombre().
     *
​     * e) ¿Qué consecuencia tiene que algunos métodos de la clase Persona se hayan definido final?
     * Que las clases hijas no pueden implementarlo.
     *
​     * f) Si el método toString no se hubiera definido en ninguna de las tres clases ¿daría error el sout del método main?
     * No, hay uno por defecto.
     *
     */
}