
import src.*;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int selection;
        // Principal menu panel
        do {
            System.out.println("Please, select one of exercise to perform:");
            System.out.println("(1) Exercise 1: get your greeting");
            System.out.println("(2) Exercise 2: arithmetics operations");
            System.out.println("(3) Exercise 3: sequence of a number");
            System.out.println("(4) Exercise 4: factorial of a number");
            System.out.println("(5) Exercise 5: product by successive addition");
            System.out.println("(6) Exercise 6: exponential numbers");
            System.out.println("(7) Exercise 7: transform a parse to uppercase");
            System.out.println("(8) Exercise 8: complete your the information for registry");
            System.out.println("(9) Exercise 9: find matches in strings phrases");
            System.out.println("(0) To close the program");
            System.out.print("Your response: ");

            selection = inputValue.nextInt();

            switch (selection){
                case 1:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 1");
                    System.out.print("To continue, enter your full name: ");
                    String name = inputValue.next();
                    Exercise1.greet(name);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 2");
                    System.out.println("Please, enter the first integer number: ");
                    int num1 = inputValue.nextInt();
                    System.out.println("Now, enter the second integer number: ");
                    int num2 = inputValue.nextInt();
                    Exercise2.arithmeticOperations(num1, num2);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 3: sequence of a number");
                    System.out.println("Please, enter your integer number: ");
                    int number = inputValue.nextInt();
                    Exercise3.sequenceOfNumber(number);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 4: factorial of a number");
                    System.out.println("Enter the number to calculate his factorial: ");
                    int num = inputValue.nextInt();
                    System.out.println("-----------------");
                    System.out.println("The factorial for number "+ num + " is " + Exercise4.factorial(num));
                    System.out.println("\n");
                    System.out.println("-----------------");
                    break;
                case 5:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 5: product by successive additions");
                    System.out.println("Please, enter the first integer number: ");
                    int n1 = inputValue.nextInt();
                    System.out.println("Now, enter the second integer number: ");
                    int n2 = inputValue.nextInt();
                    System.out.println("-----------------");
                    System.out.println("The result of multiplication by successive addition between "+ n1 + " and " + n2 + " is = "+ Exercise5.productOfAddition(n1, n2));
                    System.out.println("\n");
                    System.out.println("-----------------");
                    break;
                case 6:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 6: exponential numbers");
                    System.out.print("Enter the first integer number. It's used like base of the operation: ");
                    int base = inputValue.nextInt();
                    System.out.print("Enter the second integer number. It's used like an exponent of the operation: ");
                    int exp = inputValue.nextInt();
                    System.out.println("-----------------");
                    System.out.println("The result of operation for " + base + " ^ " + exp + " = " + Exercise6.exponential(base, exp));
                    System.out.println("\n");
                    System.out.println("-----------------");
                    break;
                case 7:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 7: transform a phrase to uppercase");
                    System.out.print("To continue, enter your phrase in lowercase: ");
                    String phrase = inputValue.next();
                    System.out.println("-----------------");
                    System.out.println("You original phrase was: --> " + phrase);
                    String newPhrase = Exercise7.textToUpper(phrase);
                    System.out.println("The result of transformation is: --> " + newPhrase);
                    System.out.println("-----------------");
                    break;
                case 8:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 8: complete your the information for registry");
                    System.out.println("To continue, enter your information: ");
                    System.out.println("-----------------");
                    Exercise8.usersInformation();
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("-----------------");
                    System.out.println("Welcome to the exercise 9: find matches in strings phrases");
                    System.out.print("Please, enter the phrase. It's used like base of the operation: ");
                    String basePhrase = inputValue.next();
                    System.out.printf("Now, enter the character you want to find in %s: ", basePhrase);
                    char findChar = (inputValue.next()).charAt(0);//only the first character
                    System.out.println("-----------------");
                    System.out.printf("The character \"%s\" is found %d times into %s", findChar, Exercise9.charInString(basePhrase, findChar), basePhrase);
                    System.out.println("-----------------");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Select a correct options.");
        }
        }while (selection != 0);
        inputValue.close();
    }
}
