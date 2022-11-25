package chapter_02;

class StreamingSong{
    String title;
    String artist;
    double duration;
    void play(){
        System.out.println(title + " is playing");
    }
    void playDetails(){
        System.out.println("This is "+ title +" by "+ artist + " duration : "+ duration);
    }
}

public class BeTheCompiler_A {
    public static void main(String[] args) {
        // We must create an object for StreamingSong Class
        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.duration = 3.43;
        song.play();
        song.playDetails();
    }
}
