package chapter_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SongV5{
    private String title;
    private String artist;
    private int bpm;

    public SongV5(String title, String artist, int bpm) {
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

    @Override
    public String toString() {
        return this.title;
    }

    //For avoiding duplicate song title
    @Override
    public boolean equals(Object aSong) {
        SongV5 other = (SongV5) aSong;
        return title.equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}

class MockSongs5{
    public static List<SongV5> getSongString(){
        List<SongV5> songs = new ArrayList<>();
        songs.add(new SongV5("somersault", "zero 7", 147));
        songs.add(new SongV5("cassidy", "grateful dead", 158));
        songs.add(new SongV5("$10", "hitchhiker", 140));
        songs.add(new SongV5("$10", "hitchhiker", 140));
        return songs;
    }
}
public class Jukebox5_HashSet {
    public static void main(String[] args) {
        new Jukebox_TreeSet().go();
    }

    public void go(){
        List<SongV5> songList = new ArrayList<>(MockSongs5.getSongString());
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<SongV5> songSet = new HashSet<>(songList);
        System.out.println(songSet);

    }
}
