package src;
public class Exercise7 {
    public static String textToUpper(String phrase){
        // create an array the chars from the phrase arguments
        char[] charactersText = phrase.toCharArray();
        // change char by char present in the array. Using ASCII code
        // create a new string to return this value
        String newPhrase = "";
        for (char character : charactersText){
            char upperChar = (char) (character - 32);
            newPhrase = newPhrase + upperChar;
            }
        return newPhrase;
    }
}