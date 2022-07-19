package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {

        List<String> wordsGroup = new ArrayList<>();
        wordsGroup.add("Hola");
        wordsGroup.add(null);
        wordsGroup.add("Informatorio");
        wordsGroup.add("");

        List<String> filterWordsGroup = wordsGroup.stream()
                .map(word -> Optional.ofNullable(word).orElse(""))
                .filter(words -> !words.isEmpty())
                .collect(Collectors.toList());

        System.out.println(filterWordsGroup);
    }
}