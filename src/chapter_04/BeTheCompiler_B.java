package chapter_04;

class Clock{
    String time;

    void setTime(String t){
        time = t;
    }

    //Getters must be return a value
    String getTime(){
        return this.time;
    }
}

public class BeTheCompiler_B{
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}