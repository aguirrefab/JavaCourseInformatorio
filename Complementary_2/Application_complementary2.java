import src.*;

import java.util.Scanner;
import java.util.Set;

public class Application_complementary2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int selection;

        do {
            System.out.println("-------------- PRINCIPAL MENU ----------------");
            System.out.println("Please, select one of exercise to perform:");
            System.out.println("(1) Exercise 1: list of favorite cities");
            System.out.println("(2) Exercise 2: list of numbers");
            System.out.println("(3) Exercise 3: the cards game");
            System.out.println("(4) Exercise 4: the group of students");
            System.out.println("(5) Exercise 5: the report worked hours");
            System.out.println("(6) Exercise 6: list and report of employees");
            System.out.println("(7) Exercise 7: function for generate array of Strings");

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
                case 4:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 4: groups of students");
                    Exercise4.groupsOfStudents();
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 5: report of worked hours");
                    Exercise5.controlHoursWorked();
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 6: list and report of employees");
                    Exercise6.menuExercise6();
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 7: function for generate array of Strings");
                    System.out.println("\n");
                    break;
            }
        }while (selection != 0);
    }
}