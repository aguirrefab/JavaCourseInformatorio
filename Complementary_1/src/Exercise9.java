package Complementary_1;

public class Exercise9 {
    public static int charInString(String phrase, char findChar){

        String normalString = phrase.toLowerCase();
        int countChar = 0;
        for (int i = 0; i < normalString.length(); i++){
            char lett = normalString.charAt(i);
            if (lett == findChar){
                countChar += 1;
            }
        }
        return countChar;
    }
}
