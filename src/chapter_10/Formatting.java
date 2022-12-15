package chapter_10;

public class Formatting {
    public static void main(String[] args) {
        // Decimal Formatting
        System.out.println("Decimal Formatting : ");
        int a = 13432423;
        String s1 = String.format("%,d",a);
        System.out.println(s1);

        System.out.println();

        // Float Formatting
        System.out.println("Float Formatting : ");
        double b = 4234234.5345235;
        String s2 = String.format("%,.2f",b);
        System.out.println(s2);

        System.out.println();

        // Multiple Formatting
        System.out.println("Multiple Formatting : ");
        int one = 2053454235;
        double two = 534523535.23452;
        System.out.printf("The rank is %,d out of %,.2f",one,two);
    }
}
