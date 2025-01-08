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
                palabras.add(palabra.toUpperCase());
        }

        System.out.printf("Nº palabras leídas: %d%n", palabras.size());

        //creamos un metodo que le pasamos la lista y una palabra y nos debe decir si la contiene
        palabra = "uno";
        boolean contienPalabra = contieneListaPalabra(palabras, palabra);
        //otro metodo que nos devuelva la primera letra de la primera palabra
        char primeraLetraPrimeraPalabra = obtenerPrimeraLetraPrimeraPalabra(palabras);
        //otro, pero ahora la última letra de la última palabra
        char ultimaLetraUltimaPalabra = obtenerUltimaLetraUltimaPalabra(palabras);
        //otro metodo que nos diga cuantas palabras contiene una letra, se le pasa la lista y la letra
        char letra = 'o';
        int numeroPalabrasConLetra = obtenerNumeroPalabrasConLetra(palabras, letra);
        //otro que pasamos la lista anterior y una letra y nos diga cuantas veces contiene esa letra
        //independientemente de mayúsculas y minúsculas.
        int numeroLetras = obtenerNumeroLetras(palabras, letra);


    }

    private static int obtenerNumeroLetras(List<String> palabras, char letra) {
        return 0;
    }

    private static int obtenerNumeroPalabrasConLetra(List<String> palabras, char letra) {
        int contador = 0;
        for (String palabra: palabras);
        return contador;

    }

    private static char obtenerUltimaLetraUltimaPalabra(List<String> palabras) {
        return palabras.getLast().charAt(palabras.getLast().length() - 1);
    }

    private static char obtenerPrimeraLetraPrimeraPalabra(List<String> palabras) {
        return palabras.getFirst().charAt(0);
    }

    private static boolean contieneListaPalabra(List<String> palabras, String palabra) {
        return palabras.contains(palabra.toUpperCase());  //en la lista todas las palabras están en mayúscula
    }
}



