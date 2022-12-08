package chapter_07;

// superclass
class Boat{
    private int length;

    public void setLength(int len){
        length = len;
    }

    public int getLength(){
        return this.length;
    }

    public void move(){
        System.out.print("drift ");
    }
}

// subclass
class Rowboat extends Boat{
    public void rowTheBoat(){
        System.out.print("stroke natasha");
    }
}

// subclass
class Sailboat extends Boat{
    public void move(){
        System.out.print(" hoist sail");
    }
}

// main class or
public class PoolPuzzle {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);

        b1.move();
        b3.move();
        b2.move();
    }
}
