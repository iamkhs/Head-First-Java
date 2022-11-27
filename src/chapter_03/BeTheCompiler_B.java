package chapter_03;
class Hobbits{
    String name;
}
public class BeTheCompiler_B {
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1;
        while (z < 2){
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1){
                h[z].name = "frido";
            }
            if (z == 2){
                h[z].name = "sam";
            }

            System.out.print(h[z].name + " is a");
            System.out.println("good Hobbit name");
        }
    }
}
