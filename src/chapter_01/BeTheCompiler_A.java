package chapter_01;

public class BeTheCompiler_A {
    public static void main(String[] args){
        int x = 1;
        while(x < 10){
            x = x + 1; // we need to increment the value of x
            if (x > 3){
                System.out.println("big x");
            }
        }
    }
}
