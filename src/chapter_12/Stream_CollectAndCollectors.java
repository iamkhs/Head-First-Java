package chapter_12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_CollectAndCollectors {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

        // add  string into stream
        Stream<String> stream = strings.stream();

        Stream<String> limit = stream.limit(4);
        List<String> result = limit.collect(Collectors.toList());
        System.out.println("result = "+result);


        // we can rewrite the limit and collect together
        List<String> result2 = strings.stream().limit(4).collect(Collectors.toList());
        System.out.println("result = "+result2);

    }
}
