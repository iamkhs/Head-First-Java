package chapter_09;

public class Animal {
    private String name;

    public String getName(){
        return this.name;
    }
    public Animal(String name){
        this.name = name;
    }
}

class Hippo extends Animal{
    public Hippo(String name){
        super(name); // Passing parameter to super class constructor
    }
}

class TestHippo{
    public static void main(String[] args) {
        Hippo h = new Hippo("Buffy");
        System.out.println(h.getName());
    }
}
