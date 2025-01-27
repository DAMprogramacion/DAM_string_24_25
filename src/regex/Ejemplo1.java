package regex;

public class Ejemplo1 {
    public static void main(String[] args) {
        //si un dni es válido o no
        System.out.println(validarDNI("12345678a") + " TRUE");
        System.out.println(validarDNI("12345678A") + " TRUE");
        System.out.println(validarDNI("123456789") + " FALSE");
        System.out.println(validarDNI("12345678aa") + " FALSE");
        System.out.println("=============================");
        System.out.println(validarFecha("12/1/1999") + " TRUE");
        System.out.println(validarFecha("1/1/1999") + " TRUE");
        System.out.println(validarFecha("12/1/199") + " FALSE");
        System.out.println(validarFecha("12/101/1999") + " FALSE");
        System.out.println(validarFecha("121/10/1999") + " FALSE");
        System.out.println(validarFecha("35/10/2000") + " FALSE");
        System.out.println(validarFecha("5/30/2000") + " FALSE");
        System.out.println(validarFecha("5/3/0") + " FALSE");
        System.out.println(validarFecha("5/3/10") + " TRUE");
        System.out.println(validarFecha("31/4/2025") + " FALSE");
        System.out.println(validarFecha("31/3/2025") + " TRUE");
        System.out.println(validarFecha("31/6/2025") + " FALSE");
        System.out.println(validarFecha("31/8/2025") + " TRUE");
        System.out.println(validarFecha("31/9/2025") + " FALSE");
        System.out.println(validarFecha("31/10/2025") + " TRUE");
        System.out.println(validarFecha("31/2/2025") + " FALSE");
        System.out.println(validarFecha("30/2/2025") + " FALSE");
        System.out.println(validarFecha("28/2/2025") + " TRUE");
        System.out.println(validarFecha("29/2/2025") + " FALSE");
        System.out.println(validarFecha("29/2/2024") + " TRUE");
        System.out.println(validarFecha("29/2/2000") + " TRUE");
        System.out.println(validarFecha("29/2/2100") + " FALSE"); //fin de siglo
        System.out.println(validarFecha("29/2/")     + " FALSE");
        System.out.println(validarFecha("")     + " FALSE");
      //  System.out.println(validarFecha(null)     + " FALSE");
       System.out.println(validarFecha("22/2/-1")     + " TRUE");



    }

    public static boolean validarDNI(String dni) {
        return dni.matches("[0-9]{8}[a-zA-Z]");
    }

    //VALIDAR FECHA 12/1/1995
    public static boolean validarFecha1(String fecha) {
        // 1, 2 ... 9, 10, 11, ... 19, 20, 21, ... 29, 30, 31
        String regexDias = "([1-9]|[12][0-9]|3[01])";
        //1, 2, 3, 9, 10, 11, 12
        String regexMeses = "([1-9]|1[0-2])";
        //1 en adelante 1 ... 9, 10 ... 99, 100 ... 999, 1000 ... 9999, ...
        String regexAnnos = "-?[1-9][0-9]*";
        return fecha.matches(regexDias + "/" + regexMeses + "/" + regexAnnos );
    }

    public static boolean validarFecha(String fecha) {
        //1/2 ... 30/2, 1/4...30/4, 1/6..30/6, 1/9...30/9, 1/11..-30/11
        if (! validarFecha1(fecha))
            return false;
        boolean bisiesto = esBisiesto(fecha);
        String febrero   = bisiesto ? "[0-9]" : "[0-8]";
        String[] tokens = fecha.split("/");
        String analisis = tokens[2];
        String regexMeses31 = "([1-9]|[12][0-9]|3[01])/([13578]|1[02])";
        //boolean exito = analisis.matches(regexMeses31);
        String regexMeses30 = "([1-9]|[12][0-9]|30])/([469]|11)";
        String regexFebrero = "([1-9]|(1[0-9]|2" + febrero + "))/2";
        String regexAnnos = "-?[0-9][0-9]*";
        //boolean exito = analisis.matches(regexAnnos);
        return fecha.matches("(" + regexMeses30 + "|" + regexMeses31 + "|" + regexFebrero+ ")" + "/" + regexAnnos );
    }

    private static boolean esBisiesto(String fecha) {
        //29/2/2025
        String[] tokens = fecha.split("/");
        String sAnno = tokens[2];
        if (! sAnno.matches("[1-9][0-9]*"))
            return false;
        int iAnno = Integer.parseInt(sAnno);
        if (iAnno % 100 == 0) //fin de siglo
            if (! (iAnno % 400 == 0))
                return false;
        return iAnno % 4 == 0;
    }


}




