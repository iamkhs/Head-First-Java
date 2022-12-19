package chapter_11;

import java.util.ArrayList;
import java.util.List;

class SongV4{
    private String title;
    private String artist;
    private int bpm;

    public SongV4(String title, String artist, int bpm) {
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

}

class MockSongs4{
    public static List<SongV4> getSongString(){
        List<SongV4> songs = new ArrayList<>();
        songs.add(new SongV4("somersault", "zero 7", 147));
        songs.add(new SongV4("cassidy", "grateful dead", 158));
        songs.add(new SongV4("$10", "hitchhiker", 140));

        return songs;
    }
}
public class Jukebox4_Lambda {
    public static void main(String[] args) {
        new Jukebox4_Lambda().go();
    }

    public void go(){
        List<SongV4> songList = MockSongs4.getSongString();

        //Sort songList according to title using Lambda Expression
        //songList.sort((a, b)-> a.getTitle().compareTo(b.getTitle())); //Method - 1
        songList.sort((song1, song2) -> song1.getTitle().compareTo(song2.getTitle())); //Method - 2

        //Iterating over the songList
        System.out.println("Sorting according to title: ");
        for (SongV4 songV4 : songList) {
            System.out.println("Title: " + songV4.getTitle() + ", Artist: " + songV4.getArtist() + ", BPM: " + songV4.getBpm());
        }
        System.out.println();

        //Sort songList according artist using Lambda Expression
        //Collections.sort(songList, (song1, song2)-> song1.getArtist().compareTo(song2.getArtist())); //Method - 1
        songList.sort((song1, song2)-> song1.getArtist().compareTo(song2.getArtist())); //Method - 1

        //Iterating over the songList
        System.out.println("Sorting according to artist: ");
        for (SongV4 songV4 : songList) {
            System.out.println("Title: " + songV4.getTitle() + ", Artist: " + songV4.getArtist() + ", BPM: " + songV4.getBpm());
        }
    }
}
