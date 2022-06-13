package Complementary_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise4 {

    public static void groupsOfStudents(){

        List<String> students = new ArrayList<>();
        int option;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select a option: ");
            System.out.println("(1) - Generate the list of Students");
            System.out.println("(2) - List complete group students");
            System.out.println("(3) - List students for course");
            System.out.println("(0) - Exit to the home menu");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Generating a new list of Students");
                    int places = 1;

                    while (places <= 12){
                        System.out.println("Places avalilable = " + (12-places));
                        System.out.println("Add student: ");
                        String nameStudent = sc.next();
                        students.add(nameStudent);
                        places++;
                    }
                    System.out.println("The places are complete!!");
                    System.out.println(students);
                    System.out.println("\n");
                    break;
                case 2:
                    try {
                        System.out.println("List of Students");
                        for (int i = 0; i < students.size(); i++)
                            System.out.println("# "+ i + " - " + students.get(i));
                        System.out.println("\n");

                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Ups! --> " + ex.getMessage());
                    }
                case 3:
                    System.out.println("List of Students");
                    List<String> courseA = students.subList(0, 4);
                    System.out.println("Students for the course A= "+ courseA);
                    System.out.println("-----------------");
                    List<String> courseB = students.subList(4, 8);
                    System.out.println("Students for the course B= "+ courseB);
                    System.out.println("-----------------");
                    List<String> courseC = students.subList(8, 12);
                    System.out.println("Students for the course C= "+ courseC);
                    System.out.println("-----------------");
            }
        } while (option != 0 && option <= 3);
    }
}