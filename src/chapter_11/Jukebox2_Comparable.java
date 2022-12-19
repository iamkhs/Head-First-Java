package chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SongV2 implements Comparable<SongV2>{
    private String title;
    private String artist;
    private int bpm;

    public SongV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    // Method for sorting according to title
    @Override
    public int compareTo(SongV2 song) {
        return title.compareTo(song.getTitle());
    }
}


class MockSongs2{
    public static List<String> getSongStrings(){
        return List.of("somersault", "cassidy", "$10", "havana", "Cassidy", "50 Ways");
    }

    public static List<SongV2> getSongsV2(){
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("somersault", "zero 7", 147));
        songs.add(new SongV2("cassidy", "grateful dead", 158));
        songs.add(new SongV2("$10", "hitchhiker", 140));


        songs.add(new SongV2("havana", "cabello", 105));
        songs.add(new SongV2("Cassidy", "grateful", 105));
        songs.add(new SongV2("50 Ways", "simon", 102));
        return songs;
    }
}

public class Jukebox2_Comparable {
    public static void main(String[] args) {
        new Jukebox2_Comparable().go();
    }

    public void go(){
        List<SongV2> songList = new ArrayList<>(MockSongs2.getSongsV2());
        System.out.println(songList);
        Collections.sort(songList); // this will not compile!! if we don't implement Comparable interface
        // and not override the compareTo() method

        //Iterating over the songList
        for (SongV2 songV2 : songList) {
            System.out.println("Title: " + songV2.getTitle() + ", Artist: " +
                    songV2.getArtist() + ", BPM: " +
                    songV2.getBpm());
        }
    }
}
