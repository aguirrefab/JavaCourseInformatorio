package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    public static void listOfNumbers() {
        List<Integer> groupOfNumbers = new ArrayList<>();

        int option;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select a option: ");
            System.out.println("(1) - Add numbers to group");
            System.out.println("(2) - Add number to the beginning of the list");
            System.out.println("(3) - Add number to the final of the list");
            System.out.println("(4) - Show the list of numbers");
            System.out.println("(0) - Exit to the home menu");
            option = sc.nextInt();


            switch (option) {



                case 1:
                    int sizeBefore = 0;
                    System.out.println("Add numbers to group, or press (0) to cancel/stop the addition");
                    int num = sc.nextInt();
                    while (num != 0){
                        groupOfNumbers.add(num);
                        System.out.println("Add numbers to group, or press (0) to cancel/stop the addition");
                        num = sc.nextInt();
                        sizeBefore++;
                    }
                    System.out.println("Total items in the list: " + sizeBefore);
                    System.out.println("\n");
                    break;
                case 2:
                    int sizeAfter = 0;
                    try {
                        System.out.println("Add number to the beginning of the list: ");
                        System.out.println("Enter the new value: ");
                        int newValue = sc.nextInt();
                        groupOfNumbers.add(0, newValue);
                        System.out.println(groupOfNumbers);
                        sizeAfter = groupOfNumbers.size();
                        System.out.println("Total items in the list: " + sizeAfter);
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Ups! --> " + ex.getMessage());
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    try {
                        System.out.println("Add number to the final of the list: ");
                        System.out.println("Enter the new value: ");
                        int newFinalValue = sc.nextInt();
                        groupOfNumbers.add(newFinalValue);
                        System.out.println(groupOfNumbers);
                        sizeAfter = groupOfNumbers.size();
                        System.out.println("Total items in the list: " + sizeAfter);
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Ups! --> " + ex.getMessage());
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    try {
                        System.out.println("Total elements present in the list: ");
                        for (int i = 0; i < groupOfNumbers.size(); i++)
                            System.out.println("# "+ i + " - " + groupOfNumbers.get(i));

                        System.out.println("\n");
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Ups! --> " + ex.getMessage());
                    }
                    break;
            }
        } while (option != 0 && option <= 4);
    }
}