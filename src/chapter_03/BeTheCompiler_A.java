package chapter_03;

class Books{
    String title;
    String author;
}

public class BeTheCompiler_A {
    public static void main(String[] args) {
        // Create myBook array and put some books into it
        Books[] myBook = new Books[3];
        myBook[0] = new Books();
        myBook[1] = new Books();
        myBook[2] = new Books();

        int x = 0;
        myBook[0].title = "The Grapes of Java";
        myBook[1].title = "The Java Gatsby";
        myBook[2].title = "The java Cookbook";
        myBook[0].author = "boob";
        myBook[1].author = "sue";
        myBook[2].author = "ian";

        while (x < 3){
            System.out.print(myBook[x].title);
            System.out.print(" by ");
            System.out.println(myBook[x].author);
            x++;
        }
    }
}
