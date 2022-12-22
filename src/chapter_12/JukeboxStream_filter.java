package chapter_12;

import java.util.List;
import java.util.stream.Collectors;

class Songs{
    public List<Song> getSongs(){
        return List.of(
                new Song("$10", "Hitchhiker", "Electronic", 2016, 183),
                new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
                new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123),
                new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
                new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995,
                        257),
                new Song("Silence", "Delerium", "Electronic", 1999, 134),
                new Song("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
                new Song("Watercolour", "Pendulum", "Electronic", 2010,
                        155),
                new Song("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
                new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
                new Song("Come Together", "The Beatles", "Blues rock", 1968,
                173),
                new Song("Come Together", "Ike & Tina Turner", "Rock", 1970,
                        165),
                new Song("With a Little Help from My Friends", "Joe Cocker",
                        "Rock", 1968, 46),
                new Song("Immigrant Song", "Karen O", "Industrial Rock",
                        2011, 12),
                new Song("Breathe", "The Prodigy", "Electronic", 1996, 337),
                new Song("What's Going On", "Gaye", "R&B", 1971, 420),
                new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
                new Song("Walk Me Home", "P!nk", "Pop", 2019, 459),
                new Song("I am not a woman, I'm a god", "Halsey",
                        "Alternative Rock", 2021, 384));
    }
}

class Song{
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;

    public Song(String title, String artist, String genre, int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", timesPlayed=" + timesPlayed +
                '}';
    }
}


public class JukeboxStream_filter {
    public static void main(String[] args){
        List<Song> songs = new Songs().getSongs();

        //Filtering songs with genre = "Rock"
        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .collect(Collectors.toList());
        System.out.println(rockSongs);

        System.out.println("\n");
        //Filtering songs with genre contains Rock : (Rock, Soft Rock, ..... Rock)
        List<Song> containRock = songs.stream()
                .filter(song -> song.getGenre().contains("Rock"))
                .collect(Collectors.toList());
        System.out.println(containRock);

        System.out.println("\n");

        // Filtering songs with title start with "H"
        List<Song> songStartWithH = songs.stream()
                .filter(song -> song.getTitle().startsWith("H"))
                .collect(Collectors.toList());
        System.out.println(songStartWithH);

        System.out.println("\n");

        // Filtering songs year More recent than 1995
        List<Song> s = songs.stream()
                .filter(song -> song.getYear() > 1995)
                .collect(Collectors.toList());
        System.out.println(s);

    }
}
