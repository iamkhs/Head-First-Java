package chapter_04;

class Xcopy{
    public static void main(String[] args) {
        int orig = 42;
        Xcopy x = new Xcopy();
        int y = x.go(orig);
        System.out.println(orig+ " " +y);
    }

    // Java is pass by value, which means pass by copy,
    // and the variable 'orig' is not changed by the go() method
    int go(int arg){
        arg = arg * 2;
        return arg;
    }
}
