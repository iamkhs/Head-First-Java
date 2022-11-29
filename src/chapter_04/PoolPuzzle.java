package chapter_04;

public class PoolPuzzle {
    public static void main(String[] args) {
        Values[] values = new Values[6];
        int number = 1;
        int i = 0;
        while (i < 6){
            values[i] = new Values();
            values[i].intValue = number;

            number = number * 10;
            i = i + 1;
        }

        int result = 0;
        i = 6;
        while (i > 0){
            i = i -1;
            result = result + values[i].doStuff(i);
        }
        System.out.println("result "+result);
    }
}

class Values{
    int intValue;
    public int doStuff(int factor){
        if (intValue > 100){
            return intValue * factor;
        }
        else{
            return intValue * (5 - factor);
        }
    }
}
