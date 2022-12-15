package chapter_10;

public class StaticMethod {

    public static int calculateSum (int a, int b){
        return a + b;
    }
}

class StaticMethodTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        // calling the method with className rather than a reference variable
        int result = StaticMethod.calculateSum(a,b);
        System.out.println(result);
    }
}
