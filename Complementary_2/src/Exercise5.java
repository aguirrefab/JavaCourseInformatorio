package Complementary_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

    public static void controlHoursWorked(){

        List<Integer> hoursWorked = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
        List<Integer> costPerHour = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));

        int option;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select a option: ");
            System.out.println("(1) - List of hours worked");
            System.out.println("(2) - List of cost per hour");
            System.out.println("(3) - Make report");
            System.out.println("(0) - Exit to the home menu");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("List of hours:");
                    System.out.println(hoursWorked);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("List of cost per hours:");
                    System.out.println(costPerHour);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Generating report:");
                    ArrayList<Integer> reportPayment = new ArrayList<>();

                    double payment = 0;

                    for (int i = 0; i < hoursWorked.size(); i++) {
                        int pay = hoursWorked.get(i) * costPerHour.get(i);
                        payment += pay;
                        reportPayment.add(pay);
                    }
                    System.out.println("-----------------");
                    System.out.println("Totals: " + reportPayment);
                    System.out.printf("Total payment= $%,.2f%n", payment);
                    System.out.println("-----------------");
                    System.out.println("\n");
                    break;
            }
        } while (option != 0 && option <= 3);
    }
}
