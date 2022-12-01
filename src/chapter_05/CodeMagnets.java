package chapter_05;

// Code Magnets exercise
public class CodeMagnets {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            for (int  j = 4; j > 2; j--){
                System.out.println(i + " "+ j);
            }
            if (i == 1){
                i++;
            }
        }
    }
}
