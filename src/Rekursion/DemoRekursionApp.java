package Rekursion;

import java.util.Locale;

public class DemoRekursionApp {
    //Palindrom: kann in der mitte gespiegelt werden (ESSE, OTTO, 110011, 808,)


    public static void main(String[] args) {

        System.out.println("isPalindrom(112211) = " + isPalindrom("112211"));
        System.out.println("isPalindrom(\"otto\") = " + isPalindrom("otto"));
        System.out.println("isPalindrom(\"Was it a car or a cat i saw\") = " + isPalindrom("Was it a car or a cat i saw"));
        System.out.println("isPalindrom(\"mississim\") = " + isPalindrom("mississim"));


    }

    public static boolean isPalindrom(String text) {
        /* wir überprüfen, ob das erste und das letzte Zeichen ident sind
            -> wenn es eine Liste wäre,
                dann können wir first and last vergleichen
                wenn ident, dann löschen,
                sonst weiter vergleichen bis ende oder fehler
         */

        text = text.toLowerCase();
        text = text.replace(" ", "");
        char firstCaracter = text.charAt(0);
        char lastCaracter = text.charAt(text.length() - 1);


        System.out.print("firstCaracter = " + firstCaracter + ", ");
        System.out.println("lastCaracter = " + lastCaracter);

        if (firstCaracter == lastCaracter) {
            text = text.substring(1, text.length() - 1);
            if (text.length() <= 1) {
                return true;
            }
            return isPalindrom(text);
        }
        return false;
    }


}
