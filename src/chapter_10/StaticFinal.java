package chapter_10;

public class StaticFinal {
    static final double PI = 3.1416;
    static final double VAL;

    // static final variable also initialized in static block{}
    static {
        VAL = Math.random();
    }

    public static void main(String[] args) {
        System.out.println("The value of PI : " + StaticFinal.PI);
        System.out.println("Random number : " + StaticFinal.VAL);
    }
}
