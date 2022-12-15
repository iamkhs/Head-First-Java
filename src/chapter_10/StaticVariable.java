package chapter_10;
class Duck {
    private static int duckCount; // static variable is "one value per class"

    public Duck(){
        duckCount++;
    }

    public int getCount(){
        return duckCount;
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Duck duck1 = new Duck(); // count is now 1 in duck1 instance
        System.out.println("Number of count: " + duck1.getCount());

        Duck duck2 = new Duck(); // count is now 2 in duck2 instance
        System.out.println("Number of count: " + duck2.getCount());

        Duck duck3 = new Duck(); // count is now 3 in duck3 instance
        System.out.println("Number of count: " + duck3.getCount());

        Duck duck4 = new Duck(); // count is now 4 in duck4 instance
        System.out.println("Number of count: " + duck4.getCount());

    }
}
