
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void listOfFavoriteCities(){

        List<String> favoriteCities = new ArrayList<>();
        int option;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select a option: ");
            System.out.println("(1) - Add favorite cities");
            System.out.println("(2) - Delete a city");
            System.out.println("(3) - Show the list of cities");
            System.out.println("(0) - Exit to the home menu");
            option = sc.nextInt();

            switch (option){
                case 1:
                    int op;
                    do {
                        System.out.println("Add your favorite Argentine city: ");
                        String city = sc.next();
                        favoriteCities.add(city);
                        System.out.println("(0) - Exit to the home menu");
                        System.out.println("(1) - Add another city");
                        System.out.print("Your response: ");
                        op = sc.nextInt();
                    } while (op != 0);
                    System.out.println("\n");
                    break;
                case 2:
                    try {
                        System.out.println("Select the city to delete: ");
                        for (int i = 0; i <= favoriteCities.size(); i++)
                            System.out.println("# "+ i + " - " + favoriteCities.get(i));
                        System.out.print("Your selection: ");
                        int ind = sc.nextInt();
                        favoriteCities.remove(ind);
                        for (String cit : favoriteCities)
                            System.out.println(cit);
                    } catch (IndexOutOfBoundsException ex){
                        System.out.println("Ups! cities have not been loaded --> "+ ex.getMessage());
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    try {
                        System.out.println("Favorite Argentine Cities: ");
                        for (int i = 0; i < favoriteCities.size(); i++)
                            System.out.println(i + " - " + favoriteCities.get(i));
                        System.out.println("\n");
                    } catch (IndexOutOfBoundsException ex){
                        System.out.println("Ups! cities have not been loaded --> "+ ex.getMessage());
                    }
                    System.out.println("\n");
                    break;
            }
        } while (option != 0 && option <= 3);
    }
}
