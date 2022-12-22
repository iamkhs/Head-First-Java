package chapter_12;

import java.util.List;
import java.util.stream.Collectors;

public class StreamWithLambdas {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

        List<String> result = strings.stream()
                .sorted((s1, s2)-> s1.compareToIgnoreCase(s2)) // sorted in ascending order
                .skip(2) // the stream skipped over the first two elements
                .limit(4)
                .collect(Collectors.toList());

        System.out.println("result = "+ result);
    }
}
