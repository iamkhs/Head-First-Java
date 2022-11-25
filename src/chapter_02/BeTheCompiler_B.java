package chapter_02;

class Episode{
    int seriesNumber;
    int episodeNumber;

    void play(){
        System.out.println("playing series "+ episodeNumber);
    }
    void skinIntro(){
        System.out.println("Skipping intro ....");
    }
    void skipToNext(){
        System.out.println("Loading next episode...");
    }
}

public class BeTheCompiler_B {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.episodeNumber = 2;
        episode.play();
        episode.skinIntro();
        episode.skipToNext();
    }
}
