package JavaOOP.Lesson3.HomeWork.Planet;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Continent {

    private String nameContinent;

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void setNameContinent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    @Override
    public String toString() {
        return nameContinent;
    }
}
