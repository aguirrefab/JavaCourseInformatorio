import Complementary_2.Exercise1;
import Complementary_2.Exercise2;
import Complementary_2.Exercise3;

import java.util.Scanner;

public class Application_complementary2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int selection;

        do {
            System.out.println("Please, select one of exercise to perform:");
            System.out.println("(1) Exercise 1: list of favorite cities");
            System.out.println("(2) Exercise 2: list of numbers");
            System.out.println("(3) Exercise 3: the cards game");

            System.out.println("(0) To Close the program");
            System.out.print("Your response: ");

            selection = input.nextInt();

            switch (selection){
                case 1:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 1: list of favorite cities");
                    Exercise1.listOfFavoriteCities();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 2: list of numbers");
                    Exercise2.listOfNumbers();
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 3: the game of cards");
                    Exercise3.cardGame();
                    System.out.println("\n");
                    break;


            }
        }while (selection != 0);
    }
}