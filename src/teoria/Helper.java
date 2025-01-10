package teoria;

import java.time.LocalDate;
import java.time.Period;

public class Helper {
    public static int calcularEdad(Persona persona) {
        Period period = Period.between(persona.fechaNacimiento(), LocalDate.now());
        return period.getYears();
    }
    public static boolean validarDNI(Persona persona){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        String dni = persona.dni();
        if (dni.length() != 9)
            return false;
        char letra = dni.toUpperCase().charAt(dni.length() - 1);  //valido poner length(8)
        if (! Character.isLetter(letra))
            return false;
        for (int i = 0; i < dni.length() - 1; i++) {  //valid poner i < 8
            if (! Character.isDigit(dni.charAt(i)))
                return false;
        }
        String sNumero = dni.substring(0, 8); //le hemos quitado la letra
        int    iNumero = Integer.parseInt(sNumero);
        int    resto   = iNumero % 23;
        return letras[resto] == letra;
        //return persona.dni().toLowerCase().matches("[0-9]{8}[a-z]");




    }
}
