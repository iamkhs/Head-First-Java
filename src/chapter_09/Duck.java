package chapter_09;

public class Duck {
    int size;
    public Duck(int duckSize) {
        System.out.println("Quack");
        size = duckSize;
        System.out.println("size is " + size);
    }

    public Duck(){
        size = 27;
        System.out.println("size is "+size);
    }
}

class UseADuck{
    public static void main(String[] args) {
        Duck d = new Duck(); // Duck() this calls the Duck constructor
    }
}
