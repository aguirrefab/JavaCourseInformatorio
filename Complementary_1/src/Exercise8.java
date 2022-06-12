package Complementary_1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise8 {

    public static void usersInformation() {

        Scanner sc = new Scanner(System.in);

        // Create and add elementos for the arrayList
        List<String> usersInformation = new ArrayList<>();

        System.out.print("Your name = ");
        String name = sc.nextLine();
        usersInformation.add(name);
        System.out.print("Your age = ");
        String age = sc.nextLine();
        usersInformation.add(age);
        System.out.print("Your address = ");
        String address = sc.nextLine();
        usersInformation.add(address);
        System.out.print("Your city = ");
        String city = sc.nextLine();
        usersInformation.add(city);

        // Generate the new arrayList with elements -1
        List<String> dataArrayList = new ArrayList<>();
        for (int i = usersInformation.size() - 1; i >= 0; i--) {
            dataArrayList.add(usersInformation.get(i));
        }

        System.out.println("-----------------");
        System.out.println("Your information =");
        System.out.printf("%s - %s - %s - %s \n", dataArrayList.get(0), dataArrayList.get(1), dataArrayList.get(2), dataArrayList.get(3));
        System.out.println("-----------------");
    }
}
