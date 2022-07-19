package src;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Exercise5 {

    public static void main(String[] args) {

        // generate the list of students
        List<Student> students = List.of(
                new Student("Fabian", "Aguirre", LocalDate.of(1992,12,09)),
                new Student("Homero", "Simpson",LocalDate.of(1959,03,12)),
                new Student("Bartolomeo", "Simpson",LocalDate.of(1960,05,10)),
                new Student("Frank", "Grimes",LocalDate.of(1975,07,30)),
                new Student("Troy", "McClure",LocalDate.of(1988,10,02))
        );

        // create a map collection
        Map<String,Integer> myStudents = new HashMap<>();

        // create a Stream from the list of students
//        students.stream()
//                .forEach(student -> myStudents.put(student.getName(),student.getSurname(),
//                ));

}
}
