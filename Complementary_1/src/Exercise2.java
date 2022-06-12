package Complementary_1;

import java.util.Scanner;

public class Exercise2 {

    public Exercise2(){}

    public static void arithmeticOperations(int num1, int num2){

        int option = 0;

        do {
            System.out.println("Perfect!, now you can select the operation you want to perform:");
            System.out.println("(1) Addition");
            System.out.println("(2) Subtraction");
            System.out.println("(3) Multiplication");
            System.out.println("(4) Division");
            System.out.println("(5) Modulus");
            System.out.println("(0) Return to the home menu");
            System.out.print("Your response: ");

            Scanner numInt = new Scanner(System.in);
            option = numInt.nextInt();

        switch (option){
            case 1:
                System.out.println("Process the addition");
                int add = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " " +"="+ " " +add);
                System.out.println("--------------------");
                break;
            case 2:
                int subst;
                if (num1 < num2){
                    subst = num2 - num1;
                } else{
                    subst = num1 - num2;
                }
                System.out.println("--------------------");
                System.out.println("Process the subtraction...");
                System.out.println("Result: " + num1 + " - " + num2 + " " +"="+ " " +subst);
                System.out.println("--------------------");
                break;
            case 3:
                int multp = num1 * num2;
                System.out.println("--------------------");
                System.out.println("Process the multiplication...");
                System.out.println("Result: " + num1 + " * " + num2 + " " +"="+ " " +multp);
                System.out.println("--------------------");
                break;
            case 4:
                int divi = num1 / num2;
                System.out.println("--------------------");
                System.out.println("Process the division...");
                System.out.println("Result: " + num1 + " / " + num2 + " " +"="+ " " +divi);
                System.out.println("--------------------");
                break;
            case 5:
                int mod = num1 % num2;
                System.out.println("--------------------");
                System.out.println("Process the modulus...");
                System.out.println("Result: " + num1 + " % " + num2 + " " +"="+ " " +mod);
                System.out.println("--------------------");
                break;
            default:
                System.out.println("--------------------");
                System.out.println("Ups! We cannot process the operation");
        }
        }while (option != 0 && option <= 5);
    }

}
