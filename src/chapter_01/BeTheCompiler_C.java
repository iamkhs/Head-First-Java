package chapter_01;

public class BeTheCompiler_C {
    // In java a program run the main() method is the starting point
    // from where compiler starts program execution.
    public static void main(String[] args) {
        int x = 5;
        while(x > 1){
            x = x - 1;
            if (x<3){
                System.out.println("small x");
            }
        }
    }
}
