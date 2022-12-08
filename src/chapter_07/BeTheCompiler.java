package chapter_07;

// superclass
class Monster{
    boolean frighten (int d){
        System.out.println("arrrgh");
        return true;
    }
}

// subclass
class Vampire extends Monster{
    boolean frighten(int x){
        System.out.println("a bite");
        return true;
    }
}

// subclass
class Dragon extends Monster{
    boolean frighten(int degree){
        System.out.println("breathe fire");
        return true;
    }
}

// MonsterTestDrive
public class BeTheCompiler {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();

        for (int i = 0; i< monsters.length; i++){
            monsters[i].frighten(i);
        }
    }
}
