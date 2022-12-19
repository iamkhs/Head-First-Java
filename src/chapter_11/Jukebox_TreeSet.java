package chapter_11;

import java.util.*;

class SongV6{
    private String title;
    private String artist;
    private int bpm;

    public SongV6(String title, String artist, int bpm) {
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

}

class MockSongs6{
    public static List<SongV6> getSongString(){
        List<SongV6> songs = new ArrayList<>();
        songs.add(new SongV6("somersault", "zero 7", 147));
        songs.add(new SongV6("cassidy", "grateful dead", 158));
        songs.add(new SongV6("$10", "hitchhiker", 140));
        songs.add(new SongV6("$10", "hitchhiker", 140));
        songs.add(new SongV6("cassidy", "grateful dead", 158));
        return songs;
    }
}
public class Jukebox_TreeSet {
    public static void main(String[] args) {
        new Jukebox_TreeSet().go();
    }

    public void go(){
        List<SongV6> songList = new ArrayList<>(MockSongs6.getSongString());
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // create a TreeSet instead of HashSet
//        Set<SongV6> songSet = new TreeSet<>((one, two) -> one.getTitle().compareTo(two.getTitle()));
        Set<SongV6> songSet = new TreeSet<>((one, two) -> one.getBpm() - two.getBpm()); // sort by BPM
        songSet.addAll(songList);
        System.out.println(songSet);


    }
}
