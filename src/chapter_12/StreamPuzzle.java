package chapter_12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Pool Puzzle Exercise Solution
public class StreamPuzzle {
    public static void main(String[] args) {
        SongSearch songSearch = new SongSearch();
        songSearch.printTopFiveSongs();
        songSearch.search("The Beatles");
        songSearch.search("The Beach Boys");
    }
}

class SongSearch{
    private final List<Song> songs = new Songs().getSongs();

    void printTopFiveSongs(){
        List<String> topFive = songs.stream()
                .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                .map(song -> song.getTitle())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(topFive);
    }

    void search(String artist){
        Optional<Song> result = songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .findAny();

        if (result.isPresent()){
            System.out.println(result.get().getTitle());
        }
        else System.out.println("No songs found by: " + artist);
    }
}
