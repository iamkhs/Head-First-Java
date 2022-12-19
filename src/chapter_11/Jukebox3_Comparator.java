package chapter_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SongV3{
    private String title;
    private String artist;
    private int bpm;

    public SongV3(String title, String artist, int bpm) {
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

class MockSongs3{
    public static List<SongV3> getSongStringsV3(){
        List<SongV3> songs = new ArrayList<>();

        songs.add(new SongV3("somersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("$10", "hitchhiker", 140));
        return songs;
    }

}

class ArtistCompare implements Comparator<SongV3>{
    @Override
    public int compare(SongV3 o1, SongV3 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}

public class Jukebox3_Comparator {
    public static void main(String[] args){
        new Jukebox3_Comparator().go();
    }


    public void go(){
        List<SongV3> songList = new ArrayList<>(MockSongs3.getSongStringsV3());
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare); // another way of sorting

        //Iterating over the songList
        for (SongV3 songV3 : songList) {
            System.out.println("Title: " + songV3.getTitle() + ", Artist: " +
                    songV3.getArtist() + ", BPM: " +
                    songV3.getBpm());
        }
    }
}
