package chapter_12;

import java.util.List;

public class ForEachExample {
    public static void main(String[] args){
        List<String> allColors = List.of("Red", "Blue", "Yellow"); // this is convenience factory method
        for (String color : allColors){
            System.out.println(color);
        }

        System.out.println("#### Using Lambda ####");
        // using lambda
        allColors.forEach(color -> System.out.println(color));
        System.out.println("\n");

        List<String> names = List.of("Rahim", "Karim", "Shanto", "Asif", "Shuvo");
        names.forEach(name -> System.out.print(name+", ")); // printing all the element using lambda
    }
}
