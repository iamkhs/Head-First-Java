package chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go(){
        List<String> songList = new ArrayList<>(MockSongs.getSongStrings());
        System.out.println(songList);
        //Sort in Alphabetic Order
        Collections.sort(songList);
        System.out.println(songList);
    }
}

class MockSongs{
    public static List<String> getSongStrings(){
        return List.of("somersault", "cassidy", "$10", "havana", "Cassidy", "50 Ways");
    }
}
