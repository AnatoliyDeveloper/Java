package JavaOOP.Lesson3.HomeWork.Planet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Planet {

    static final String NAME_PLANET = "EARTH";

    private List <Continent> continents = new ArrayList<>();
    private List <Ocean> oceans = new ArrayList<>();
    private List <Island> islands = new ArrayList<>();

    public List <Continent> getContinents(){
        return continents;
    }

    public void addContinent(Continent continent){
        this.continents.add(continent);
    }

    public List <Ocean> getOceans(){
        return oceans;
    }

    public void addOcean(Ocean ocean){
        this.oceans.add(ocean);
    }

    public List <Island> getIslands(){
        return islands;
    }

    public void addIsland(Island island){
        this.islands.add(island);
    }

    public void printContinents(){
        for (Continent counter : this.continents){
            System.out.print(counter.getNameContinent() + "; ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Planet { " +
                "NAME_PLANET='" + NAME_PLANET + '\'' +
                ", continents=" + continents +
                ", oceans=" + oceans +
                ", islands=" + islands +
                '}';
    }
}
