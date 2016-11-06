package JavaOOP.Lesson6.HomeWork;

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

    private final String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
