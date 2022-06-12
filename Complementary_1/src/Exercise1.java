package Complementary_1;

import java.util.Scanner;

public class Exercise1 {

    public Exercise1(){}

    public static void greet(String name) {

        int option = 0;
        do {
            System.out.println("Perfect!, now you can select the operation you want to perform:");
            System.out.println("(1) Get you Greeting!!");
            System.out.println("(0) Return to the home menu");
            System.out.print("Your response: ");

            Scanner numInt = new Scanner(System.in);
            option = numInt.nextInt();

            if (option == 1){
                System.out.println("-----------------");
                System.out.println("Hello, " + name + "! Welcome!!");
                System.out.println("-----------------");
            }

        } while (option != 0 && option <= 1);

    }
}
