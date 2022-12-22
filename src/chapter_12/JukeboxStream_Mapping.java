package chapter_12;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JukeboxStream_Mapping {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();

        //Creating a new List of all the genres
        List<String> genres = songs.stream()
                .map(song -> song.getGenre()) //mapping genres into a new List
                .collect(Collectors.toList());
        System.out.println(genres);
        System.out.println();

        // Creating a new List of distinct genre
        List<String> genre = songs.stream()
                .map(song -> song.getGenre())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct genres are: "+genre);
        System.out.println();

        // Another way creating a List and remove duplicate by using Set
        Set<String> setGenres = songs.stream()
                .map(song -> song.getGenre())
                .collect(Collectors.toSet());
        System.out.println("Set of Genres : " + setGenres);

        //Counting Songs with distinct title
        long count = songs.stream()
                .map(song -> song.getTitle())
                .distinct()
                .count();
        System.out.println("Number of distinct song titles are: "+count);
        System.out.println();

        //Creating a new List - artist of "With a Little Help from My Friends", except "The Beatles"
        String songTitle = "With a Little Help from My Friends";
        List<String> result = songs.stream()
                .filter(song -> song.getTitle().equals(songTitle))
                .map(song -> song.getArtist())
                .filter(artist -> !artist.equals("The Beatles"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
