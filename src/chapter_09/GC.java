package chapter_09;

public class GC {
    public static GC doStuff(){
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

        gc1 = null; //Object gc1 is now garbage
        gc4 = null; //Object gc4 is now garbage

    }

    public static void doStuff2(GC copyGC){
        GC localGC = copyGC;
    }
}
