package JavaOOP.Lesson10.HomeWork.film;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public enum Genre {

    ACTION("Action"),
    ADVENTURE("Adventure"),
    COMEDY("Comedy"),
    CRIME("Crime"),
    DRAMA("Drama"),
    GANGSTERS("Gangsters"),
    HORROR("Horror"),
    MONSTER("Monster"),
    MUSICALS("Musicals"),
    THRILLER("Thriller"),
    WESTERNS("Westerns");

    private final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
