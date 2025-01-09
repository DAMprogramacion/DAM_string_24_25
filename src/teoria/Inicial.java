package teoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inicial {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(); //lista vacía
        Scanner scanner = new Scanner(System.in);
        String palabra;
        while(true) {
            System.out.println("Introduce una palabra");
            palabra = scanner.nextLine();
            if (palabra.equalsIgnoreCase("fin"))
                break;
            else
                palabras.add(palabra);
        }

        System.out.printf("Nº palabras leídas: %d%n", palabras.size());

        //creamos un metodo que le pasamos la lista y una palabra y nos debe decir si la contiene
        palabra = "uno";
        boolean contienPalabra = contieneListaPalabra(palabras, palabra);
        String mensaje = contienPalabra ? "SI" : "NO";
        System.out.printf("La lista de palabras ¿contien %s? %s%n", palabra, mensaje);
        //otro metodo que nos devuelva la primera letra de la primera palabra
        char primeraLetraPrimeraPalabra = obtenerPrimeraLetraPrimeraPalabra(palabras);
        System.out.printf("Primera letra de la lista es: %c%n", primeraLetraPrimeraPalabra);
        //otro, pero ahora la última letra de la última palabra
        char ultimaLetraUltimaPalabra = obtenerUltimaLetraUltimaPalabra(palabras);
        //otro metodo que nos diga cuantas palabras contiene una letra, se le pasa la lista y la letra
        System.out.printf("Última letra de la lista es: %c%n", ultimaLetraUltimaPalabra);
        char letra = 'o';
        int numeroPalabrasConLetra = obtenerNumeroPalabrasConLetra(palabras, letra);
        //otro que pasamos la lista anterior y una letra y nos diga cuantas veces contiene esa letra
        //independientemente de mayúsculas y minúsculas.
        System.out.printf("Nº de palabras con la letra %s: %d%n", letra, numeroPalabrasConLetra);
        int numeroLetras = obtenerNumeroLetras(palabras, letra);
        System.out.printf("Nº de %s: %d%n", letra, numeroLetras);



    }

    private static int obtenerNumeroLetras(List<String> palabras, char letra) {
        int contador = 0;
        for (String palabra : palabras)
            for (int i = 0; i < palabra.length(); i++)
                if (palabra.toLowerCase().charAt(i) == Character.toLowerCase(letra))
                    contador++;
        return contador;
    }

    private static int obtenerNumeroPalabrasConLetra(List<String> palabras, char letra) {
        int contador = 0;
        for (String palabra: palabras)
            if (palabra.toLowerCase().contains((letra + "").toLowerCase()))
                contador++;
        return contador;

    }

    private static char obtenerUltimaLetraUltimaPalabra(List<String> palabras) {
        if (palabras.isEmpty())
            return ' ';
        return palabras.getLast().charAt(palabras.getLast().length() - 1);
    }

    private static char obtenerPrimeraLetraPrimeraPalabra(List<String> palabras) {
        if (palabras.isEmpty())
            return ' ';
        return palabras.getFirst().charAt(0);
    }

    private static boolean contieneListaPalabra(List<String> palabras, String word) {
        //return palabras.contains(palabra.toUpperCase());  //en la lista todas las palabras están en mayúscula
        for (String palabra : palabras)
            if (palabra.equalsIgnoreCase(word))
                return true;
        return false;
    }
}



