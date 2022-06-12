package Complementary_1;

import java.util.Locale;

public class Exercise7 {
    public static void textToUpper(String phrase){
        char[] charactersText = phrase.toCharArray();
        for (char character : charactersText){
            character = Character.toUpperCase(character);
            System.out.print(character);
        }
        System.out.println("\n");
    }

    //Another way
    public static String textToUpperSimple(String phrase){
        return phrase.toUpperCase();
    }


}
