package chapter_12;

import java.util.List;
import java.util.Optional;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();

        // checking something exits
        boolean result = songs.stream()
                .anyMatch(s -> s.getGenre().equals("R&B")); // return true
        System.out.println("result = "+ result);


        // Find a specific thing
        Optional<Song> optionalSong = songs.stream()
                .filter(s -> s.getYear() == 1995)
                .findFirst();
        System.out.println("First song played was released in 1995 : "+ optionalSong);


    }
}
