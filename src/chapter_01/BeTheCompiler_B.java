package chapter_01;

// we need at least one class for compile a java program
public class BeTheCompiler_B {
    public static void main(String[] args){
        int x  = 5;
        while(x > 1){
            x = x -1;
            if (x < 3){
                System.out.println("small x");
            }
        }
    }
}
