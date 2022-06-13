package Complementary_2;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    private String name;
    private String surname;
    private Integer DNI;
    private Double hoursWorked;
    private Double valuePerHours;



    public Employee(String name, String surname, Integer DNI, Double hoursWorked, Double valuePerHours) {
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.hoursWorked = hoursWorked;
        this.valuePerHours = valuePerHours;
    }

    public Employee(){}

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

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }
}
