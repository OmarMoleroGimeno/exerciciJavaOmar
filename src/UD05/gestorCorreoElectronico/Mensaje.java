package UD05.gestorCorreoElectronico;

import java.util.Objects;


public class Mensaje {
    private int codigo = 0;
    private String emisor;
    private String destinatario;
    private String asunto;
    private String texto;
    private static int contador = 1;

    public Mensaje(String Emisor, String Destinatario, String Asunto, String Texto) {
        this.emisor = Emisor;
        this.destinatario = Destinatario;
        this.asunto = Asunto;
        this.texto = Texto;
        this.codigo = contador;
        this.contador++;
    }

    public String getEmisor() {
        return this.emisor;
    }


    public String getDestinatario() {
        return this.destinatario;
    }


    public String getAsunto() {
        return this.asunto;
    }

    public String getTexto() {
        return this.texto;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public boolean equals(Object o){
        //Controlamos si los dos son iguales, si es nulo o si son de diferente classe
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        } else if(this.getClass() != o.getClass()) {
            return false;
        }
        final Mensaje other = (Mensaje) o;
        return Objects.equals(this.codigo, other.codigo);
    }

    public static boolean validarEMail(String email){
        boolean valida = false;
        if (email.length() >= 5) {
            for (int i = 0; i < email.length(); i++) {
                if ('@' == email.charAt(i) && email.charAt(i) != 0) {
                    for (int j = i; j < email.length() && email.charAt(i+3) != '.'; j++) {
                        if ('.' == email.charAt(j)) {
                            valida = !valida;
                        }
                    }
                }
            }
        }
        return valida;
    }

    @Override
    public String toString() {
        return  "\nCodigo: " + this.codigo +
                "\nEmisor: " + getEmisor() +
                "\nDestinatario: " + getDestinatario() +
                "\nAsunto: " + getAsunto() +
                "\nTexto: " + getTexto() + "\n";
    }


}