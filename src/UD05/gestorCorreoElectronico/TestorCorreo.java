package UD05.gestorCorreoElectronico;

public class TestorCorreo {
    public static void main(String[] args) {
        Mensaje m1 = new Mensaje(null, null, null, null);
        System.out.println(m1.validarEMail("tuCorreo@gmail.com"));
        System.out.println(m1.validarEMail("tuCorreogmail.com\r"));
        System.out.println(m1.validarEMail("tuCorreo@gmail"));
        System.out.println(m1.validarEMail("tuCorreo.com@gmail"));
    }
}
