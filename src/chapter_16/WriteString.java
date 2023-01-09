package chapter_16;

import java.io.FileWriter;
import java.io.IOException;

public class WriteString {
    public static void main(String[] args) throws IOException {
        String s = "Hello World from java";
        FileWriter writer = new FileWriter("foo.txt");
        writer.write(s);

        writer.close();
    }
}
