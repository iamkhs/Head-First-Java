package chapter_02;

class Echo{
    int count = 0;
    void hello(){
        System.out.println("helloooo...");
    }
}

public class PoolPuzzle {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
//        Echo e2 = e1; for 24 output
        int x = 0;

        while (x < 4){
            e1.hello();
            e1.count = e1.count+1;
            if (x > 0){
                e2.count = e2.count + 1;
            }
            if (x > 1){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
