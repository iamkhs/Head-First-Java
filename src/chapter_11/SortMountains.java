package chapter_11;

import java.util.ArrayList;
import java.util.List;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));

        System.out.println("as entered: \n" + mountains);
        //Sort mountains according to name - Ascending Order
        mountains.sort((one, two)-> one.getName().compareTo(two.getName()));
        System.out.println("by name: \n" + mountains);

        //Sort mountains according to height - Descending/Reverse Order
        mountains.sort((one, two)-> one.getHeight() - (two.getHeight()));
        System.out.println("by height: \n" + mountains);
    }

}

// Mountain Class
class Mountain {
    String name;
    int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public int getHeight(){
        return this.height;
    }

    @Override
    public String toString() {
        return this.name + " "+this.height;
    }
}
