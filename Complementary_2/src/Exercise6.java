package src;

import java.util.*;

public class Exercise6 {

    public static void menuExercise6() {
        Scanner sc = new Scanner(System.in);
        Set<Employee> employeeList = new HashSet<>();
        int selection;
        do {
            System.out.println("Please, select an option:");
            System.out.println("(1) Exercise 1: Add Employees");
            System.out.println("(2) Exercise 2: Generate list of employees");
            System.out.println("(3) Exercise 3: Generate list of salary per employee");

            System.out.println("(0) To return at home menu");
            System.out.print("Your response: ");

            selection = sc.nextInt();

            switch (selection) {
                case 1:
                    createListOfEmployee(employeeList);
                    break;
                case 2:
                    listOfEmployee(employeeList);
                    break;
                case 3:
                    HashMap<Long, Double> salaryPerEmployee;
                    salaryPerEmployee = salaryPerEmployee(employeeList);
                    System.out.println("-----------------");
                    for (Map.Entry<Long, Double> registry : salaryPerEmployee.entrySet()){
                        System.out.println("# Employee DNI: " + registry.getKey() + "|| Total Salary: $" + registry.getValue());
                    }
                    System.out.println("-----------------");
                    break;
            }
        } while (selection != 0);
    }

    public static Set<Employee> createListOfEmployee(Set<Employee> employeeList) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Information for the new employee: ");

        int option;
        do {
            System.out.println("Press 0 to cancel or 1 to add new Employee: ");
            option = sc.nextInt();
        } while (option < 0 || option > 1);

        while (option != 0) {
            // Inject the employee instance
            Employee employee = new Employee();

            System.out.println("Enter the name: ");
            String name = sc.next();
            employee.setName(name);

            System.out.println("Enter the surname: ");
            String surname = sc.next();
            employee.setSurname(surname);

            System.out.println("Enter the DNI: ");
            Long DNI = sc.nextLong();
            employee.setDNI(DNI);

            System.out.println("Enter the hours worked: ");
            Integer hoursWorked = sc.nextInt();
            employee.setHoursWorked(hoursWorked);

            System.out.println("Enter the value per hours worked: ");
            Double valuePerHours = sc.nextDouble();
            employee.setValuePerHours(valuePerHours);

            employeeList.add(employee);

            System.out.println("Press 0 to cancel or 1 to add new Employee: ");
            option = sc.nextInt();
        }
        return employeeList;
    }

    public static void listOfEmployee(Set<Employee> employeeList) {
        System.out.println("-----------------");
        System.out.println("List of Employees: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static HashMap<Long, Double> salaryPerEmployee(Set<Employee> employeeList) {
        HashMap<Long, Double> salaryPerEmployee = new HashMap<>();

        for (Employee employee : employeeList) {
            salaryPerEmployee.put(employee.getDNI(), (employee.getHoursWorked() * employee.getValuePerHours()));
        }
        return salaryPerEmployee;
    }
}