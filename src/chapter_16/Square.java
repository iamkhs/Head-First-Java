package chapter_16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Square implements Serializable {
    private int width;
    private int height;

    public Square(int width, int height){
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Square mySquare = new Square(50,30);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(mySquare);
            os.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
