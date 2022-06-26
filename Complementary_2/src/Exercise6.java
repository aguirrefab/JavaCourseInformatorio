package Complementary_2;
import java.util.*;

public class Exercise6 {

    public static Set<Employee> createEmployee() throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        // Inject the employee instance
        Employee employee = new Employee();

        Set<Employee> employeeList = new HashSet<>();

        System.out.println("Information for the new employee: ");
        int option;
        do {
            System.out.println("Press 0 to cancel or 1 to add new Employee: ");
            option = sc.nextInt();
        } while (option < 0 || option > 1);

        while (option != 0) {
            try {
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

            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
            }

            employeeList.add(employee);

            System.out.println("Press 0 to cancel or 1 to add new Employee: ");
            option = sc.nextInt();
        }
        return employeeList;
    }
    public static void listOfEmployee(Set<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
//    public static Map salaryList(){
//
//        HashMap<Long,Double> salaryList = new HashMap<>();
//        for (Employee employee : employeeList) {
//            salaryList.put(employee.getDNI(), (employee.getHoursWorked() * employee.getValuePerHours()));
//        }
//        return salaryList;
//    }
}





