package chapter_11;

import java.util.Set;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go(){
        Book b1 = new Book("How Cats work");
        Book b2 = new Book("Remix your body");
        Book b3 = new Book("Finding EMo");

        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }
}

class Book implements Comparable<Book>{
    private String title;
    public Book(String t ){
        title = t;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return title;
    }
}
