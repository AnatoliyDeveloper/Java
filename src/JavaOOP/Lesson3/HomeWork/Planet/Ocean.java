package JavaOOP.Lesson3.HomeWork.Planet;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Ocean {

    private String nameOcean;

    public Ocean(String nameOcean) {
        this.nameOcean = nameOcean;
    }

    public String getNameOcean() {
        return nameOcean;
    }

    public void setNameOcean(String nameOcean) {
        this.nameOcean = nameOcean;
    }

    @Override
    public String toString() {
        return "Ocean {" + "nameOcean = '" + nameOcean + '\'' + '}';
    }
}
