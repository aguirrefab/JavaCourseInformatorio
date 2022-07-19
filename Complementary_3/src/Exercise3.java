package src;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {

        List<String> words = List.of(
                "Batman",
                "Aquaman",
                "Flash",
                "Batgirl",
                "Wonder Woman",
                "brainiac");

        List<Integer> filterWords = words.stream()
                .filter(word -> words.contains("b")).count()
                .collect(Collectors.toList());
    }

}
