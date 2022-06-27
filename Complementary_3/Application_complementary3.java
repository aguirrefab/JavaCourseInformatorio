import src.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Application_complementary3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int selection;

        do {
            System.out.println("-------------- PRINCIPAL MENU ----------------");
            System.out.println("Please, select one of exercise to perform:");
            System.out.println("(1) Exercise 1: Filter list using Streams");
            System.out.println("(2) Exercise 2: list of numbers");
            System.out.println("(3) Exercise 3: the cards game");
            System.out.println("(4) Exercise 4: the group of students");
            System.out.println("(5) Exercise 5: the report worked hours");
            System.out.println("(6) Exercise 6: list and report of employees");

            System.out.println("(0) To Close the program");
            System.out.print("Your response: ");

            selection = input.nextInt();

            switch (selection){
                case 1:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 1: list of favorite cities");
                    List<String> strList = Exercise1.generateStringList();

                    System.out.println("The list generate is: ");
                    System.out.println(strList);

                    System.out.println("\n");
                    break;

            }
        }while (selection != 0);
    }
}