package chapter_08;

// Pool Puzzle Exercise

public interface Nose {
    int iMethod();
}

abstract class Picasso implements Nose{
    @Override
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso{

}

class Acts extends Picasso{
    @Override
    public int iMethod() {
        return 5;
    }
}