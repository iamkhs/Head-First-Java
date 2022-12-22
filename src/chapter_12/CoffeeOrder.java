package chapter_12;

import java.util.List;
import java.util.stream.Collectors;

// Code Magnets Exercise Solution
public class CoffeeOrder {
    public static void main(String[] args) {
        List<String> coffees = List.of("Cappuccino", "Americano", "Espresso", "Cortado",
                "Mocha", "Cappuccino","Flat White", "Latte");

        List<String> coffeesEndingInO = coffees.stream()
                .filter((s -> s.endsWith("o")))
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(coffeesEndingInO);
    }
}
