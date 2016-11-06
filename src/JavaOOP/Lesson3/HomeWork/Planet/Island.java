package JavaOOP.Lesson3.HomeWork.Planet;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Island {

    private String nameIsland;

    public Island(String nameIsland) {
        this.nameIsland = nameIsland;
    }

    public String getNameIsland() {
        return nameIsland;
    }

    public void setNameIsland(String nameIsland) {
        this.nameIsland = nameIsland;
    }

    @Override
    public String toString() {
        return "Island { " + "nameIsland = '" + nameIsland + '\'' + '}';
    }
}
