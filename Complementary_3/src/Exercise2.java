package src;

import java.util.List;
import java.util.stream.Collectors;


public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> numbers2 = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        System.out.println(numbers2);
    }
}
