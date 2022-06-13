package Complementary_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise6 {



    public static void addEmployee() {
        Employee employee = new Employee();

        Set<Employee> employeeList = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Information for the new employee: ");
        System.out.println("Enter the name: ");
        String name = sc.next();
        employee.setName(name);
        System.out.println("Enter the surname: ");
        String surname = sc.next();
        employee.setSurname(surname);
        System.out.println("Enter the DNI: ");
        Integer DNI = sc.nextInt();
        employee.setDNI(DNI);
        System.out.println("Enter the hours worked: ");
        Double hoursWorked = sc.nextDouble();
        employee.setHoursWorked(hoursWorked);
        System.out.println("Enter the value per hours worked: ");
        Double valuePerHours = sc.nextDouble();
        employee.setValuePerHours(valuePerHours);

        employeeList.add(employee);
    }

    public static void listOfEmployee(){

    }

}





