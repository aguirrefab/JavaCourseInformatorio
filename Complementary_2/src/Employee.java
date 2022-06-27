package src;


public class Employee {
    private String name;
    private String surname;
    private Long DNI;
    private Integer hoursWorked;
    private Double valuePerHours;


    public Employee(String name, String surname, Long DNI, Integer hoursWorked, Double valuePerHours) {
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.hoursWorked = hoursWorked;
        this.valuePerHours = valuePerHours;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    @Override
    public String toString() {
        return
                "# Employee: " + "\n"
                + "-- Name = " + name +", " + surname + "\n"
                + "-- DNI = " + DNI + "\n"
                + "-- Hours Worked = " + hoursWorked + "\n"
                + "-- Price per hour = " + valuePerHours + "\n"
                + "-----------";
    }

    public static double totalSalary(Employee employee){
        double salary = employee.getHoursWorked()* employee.getValuePerHours();
        return salary;
    }

}







