package Complementary_2;

import java.util.*;

public class Exercise3 {

    public static void cardGame() {

        List<Integer> deckOfCards = new ArrayList<>();

        int option;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select a option: ");
            System.out.println("(1) - Generate a new deck of cards");
            System.out.println("(2) - Reverse the order of the deck of cards");
            System.out.println("(3) - Shuffler the deck of cards");
            System.out.println("(0) - Exit to the home menu");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Generating a new deck of cards...");
                    for (int i = 1; i <= 56; i++) {
                        deckOfCards.add(i);
                    }
                    System.out.println("The new deck of cards with 56 elements= \n" + deckOfCards);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Reverse the order of the deck of cards...");
                    Collections.reverse(deckOfCards);
                    System.out.println(deckOfCards);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Shuffling the deck of cards...");
                    Collections.shuffle(deckOfCards);
                    System.out.println(deckOfCards);
                    System.out.println("\n");
                    break;
            }
        }while (option != 0 && option <= 3) ;
    }
}
