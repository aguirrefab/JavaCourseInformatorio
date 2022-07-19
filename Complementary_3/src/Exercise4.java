package src;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise4 {

    public static void main(String[] args) {
        // Initial collection of numbers
        List<Integer> numbers = List.of(1, 2, 4, 4, 4);

        // create a stream and implemented the factorial function
        Set<Integer> factorialNum = numbers.stream()
                .map(number -> getFactorial(number))
                .collect(Collectors.toSet());

        System.out.println(factorialNum);

    }
    // refactor the factorial function
    public static int getFactorial(int number) {
        return (number <= 1) ? 1 : number * getFactorial(number - 1);
    }
}
