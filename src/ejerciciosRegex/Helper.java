package ejerciciosRegex;

public class Helper {
    public static boolean validarUUID(String uuid) {
        //a91368be-82fa-486b-9c3e-8544f46b96c4
        return uuid.matches(
                "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    }
    public static boolean validarISBN(String isbn) {

       if (isbn.length() == 17)  //13 dígitos + 4 guiones
           return validarISBN13(isbn);
       else if (isbn.length() == 13) {//10 dígitos + 3 guiones
           return validarISBN10(isbn);
       } else
           return false;
    }

    private static boolean validarISBN10(String isbn) {
        //93-5025-214-7
        return isbn.matches("[0-9]+-[0-9]+-[0-9]+-[0-9xX]");
    }

    private static boolean validarISBN13(String isbn) {
        //978-1-4028-9462-6
        //978-92-95055-02-5
        return isbn.matches("978-[0-9]+-[0-9]+-[0-9]+-[0-9]+");
    }

    public static boolean validarIBAN(String iban) {
        return iban.toLowerCase().matches(
                "es61[-\\s]?[0-9]{4}[-\\s]?[0-9]{4}[-\\s]?[0-9]{2}[-\\s]?[0-9]{10}");
    }
    //validar número reales valores aceptados:
    //12  12.0   12,0   0,855  -13   -13,121   -0.2555555555555555

    public static boolean validarNumerosReales(String numero) {
        if (numero.equals("-.") || numero.equals("-,") || numero.equals(",") || numero.equals("."))
            return false;
        String numerosEnterosRegex   = "-?[0-9]+";
        String numerosDecimalesRegex = "-?[0-9]*[.,][0-9]*";
        return numero.matches("(" + numerosEnterosRegex + "|" + numerosDecimalesRegex + ")");
    }




}
















