package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static List<String> generateStringList() {

        List<String> wordsList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("(1) - Add words to the list");
            System.out.println("(2) - Autogenerate a list of randoms words");
            System.out.println("(0) - Exit to the home menu");
            option = sc.nextInt();

            if (option == 1){
                int op;
                do {
                    System.out.println("Your word: ");
                    String word = sc.next();
                    wordsList.add(word);
                    // add null and " " element in list
                    for (int i = wordsList.size()-1; i < 8; i++) {
                        if (i % 3 == 0) {
                            wordsList.add(null);
                        } else if (i % 2 == 0) {
                            wordsList.add("");
                        }
                    }
                    System.out.println("(1) - Add another word");
                    System.out.println("(0) - Cancel");
                    System.out.print("Your response: ");
                    op = sc.nextInt();
                } while (op != 0);
                System.out.println("\n");

            } else if (option == 2) {
                wordsList.add("Hola");
                wordsList.add(null);
                wordsList.add("Informatorio");
                wordsList.add("");
                System.out.println("\n");
            }

        } while(option !=0 && option <=1);

        return wordsList;
}
}
