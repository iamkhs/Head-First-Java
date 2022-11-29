package chapter_04;

public class Mixed_Messages {
    int counter = 0;

    public static void main(String[] args) {
        int count  = 0;
        Mixed_Messages[] mixes = new Mixed_Messages[20];
        int i = 0;
        while (i<20){
            mixes[i] = new Mixed_Messages();
            mixes[i].counter = mixes[i].counter+1;
            count = count + 1;
            count = count+mixes[i].maybeNew(i);
            i = i+ 1;
        }
        System.out.println(count + " "+ mixes[1].counter);
    }

    private int maybeNew(int index){
        if (index < 5){
            Mixed_Messages mix = new Mixed_Messages();
            mix.counter = mix.counter +1;
            return 1;
        }
        return 0;
    }
}
