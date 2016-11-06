package JavaOOP.Lesson3.HomeWork.Planet;

/**
 * Created by Anatoliy on 09.10.2016.
 */
/*
Создать объект класса Планета, используя классы Материк, Океан, Остров.
Методы: вывести на консоль название материка, планеты, количество материков.
 */
public class PlanetRunner {

    public static void main(String[] args) {

        Planet planet = new Planet();

        planet.addContinent(new Continent("Europa"));
        planet.addContinent(new Continent("Asia"));
        planet.addContinent(new Continent("North America"));
        planet.addContinent(new Continent("South America"));
        planet.addContinent(new Continent("Antarctica"));
        planet.addContinent(new Continent("Australia"));

        printAllContinents(planet);

        System.out.println("Name of Planet: " + Planet.NAME_PLANET);

        System.out.println("Number of continents: " + planet.getContinents().size());
    }

    public static void printAllContinents(Planet planet) {
        for (int i = 0; i < 6; i++) {
            System.out.println("Continent " + (i + 1) + ": " + planet.getContinents().get(i));
        }
    }
}
