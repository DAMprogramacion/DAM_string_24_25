package ejerciciosRegex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Helper.validarUUID("123e4567-e89b-12d3-a456-426655440000") + " TRUE");
        System.out.println(Helper.validarUUID("123e4567-e89b-12d34-a456-426655440000") + " FALSE");
        System.out.println(Helper.validarUUID("123e4567-e89b-12d3-456-426655440000") + " FALSE");
        System.out.println(Helper.validarUUID("123e4567-e89b-12d3-h456-426655440000") + " FALSE");
        System.out.println(Helper.validarUUID("d3ee2929-212b-4077-af84-694a0e69b8e1") + " TRUE");
        System.out.println("===========================================================");
        /*93-5025-214-7
80-85983-44-3
951-0-11369-7
958-04-6278-X*/
        System.out.println(Helper.validarISBN("978-3-16-148410-0") + " TRUE");
        System.out.println(Helper.validarISBN("978-92-95055-02-5") + " TRUE");
        System.out.println(Helper.validarISBN("977-92-95055-02-5") + " FALSE");
        System.out.println(Helper.validarISBN("978-92-95055-02-50") + " FALSE");
        System.out.println(Helper.validarISBN("978-9-95055-02-5") + " FALSE");
        System.out.println(Helper.validarISBN("978-9-9055-021-51") + " TRUE");
        System.out.println(Helper.validarISBN("978-92-95-05-02-5") + " FALSE");
        System.out.println(Helper.validarISBN("80-85983-44-3") + " TRUE");
        System.out.println(Helper.validarISBN("951-0-11369-7") + " TRUE");
        System.out.println(Helper.validarISBN("958-04-6278-X") + " TRUE");
        System.out.println(Helper.validarISBN("958-04-6278-z") + " FALSE");
        System.out.println(Helper.validarISBN("958-0456278-8") + " FALSE");
        System.out.println("=====");
        System.out.println(Helper.validarIBAN("es61 1234 5678 90 1234567890") + " TRUE");
        System.out.println(Helper.validarIBAN("es61-1234-5678-90-1234567890") + " TRUE");
        System.out.println(Helper.validarIBAN("es6112345678901234567890") + " TRUE");
        System.out.println(Helper.validarIBAN("ES61 1234 5678 90 1234567890") + " TRUE");
        System.out.println(Helper.validarIBAN("es61 1234 5678 901 234567890") + " FALSE");
        System.out.println(Helper.validarIBAN("es61 1234 5678 90 234567890") + " FALSE");
        System.out.println(Helper.validarIBAN("es61 1234 5678 90 12345678909") + " FALSE");
        System.out.println("============================================");
        System.out.println(Helper.validarNumerosReales("12") + " TRUE");
        System.out.println(Helper.validarNumerosReales("-12") + " TRUE");
        System.out.println(Helper.validarNumerosReales("ab") + " FALSE");
        System.out.println(Helper.validarNumerosReales("1.2") + " TRUE");
        System.out.println(Helper.validarNumerosReales("1,2") + " TRUE");
        System.out.println(Helper.validarNumerosReales("1#2") + " FALSE");
        System.out.println(Helper.validarNumerosReales("12,7") + " TRUE");
        System.out.println(Helper.validarNumerosReales("-12.899") + " TRUE");
        System.out.println(Helper.validarNumerosReales("12,.123") + " FALSE");
        System.out.println(Helper.validarNumerosReales("12a") + " FALSE");
        System.out.println(Helper.validarNumerosReales("-12.899a") + " FALSE");
        System.out.println(Helper.validarNumerosReales(".3") + " TRUE");
        System.out.println(Helper.validarNumerosReales("-.3") + " TRUE");
        System.out.println(Helper.validarNumerosReales("-,3") + " TRUE");
        System.out.println(Helper.validarNumerosReales("--.3") + " FALSE");
        System.out.println(Helper.validarNumerosReales(".") + " FALSE");
        System.out.println(Helper.validarNumerosReales("7") + " TRUE");
        System.out.println(Helper.validarNumerosReales("--") + " FALSE");
        System.out.println(Helper.validarNumerosReales("-.") + " FALSE");
        System.out.println(Helper.validarNumerosReales("..") + " FALSE");
        System.out.println("==================================");
        Scanner sc = new Scanner(System.in);
        String sNumero = "";
        do {
            System.out.println("Introduce un número real");
            sNumero = sc.nextLine();
        } while ((! Helper.validarNumerosReales(sNumero)));
        sNumero = sNumero.replace(',', '.');
        double dNumero =  Double.parseDouble(sNumero);


































    }
}
