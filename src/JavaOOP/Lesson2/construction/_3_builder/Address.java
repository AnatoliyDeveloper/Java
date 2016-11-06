package ua.kiev.prog.javaoop.construction._3_builder;

/**
 * Created on 27.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Address {
    private String country;
    private String city;
    private String street;

    Address() {}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address: ");

        sb.append(country).append(", ")
                .append(city).append(", ")
                .append(street);

        return sb.toString();
    }

    //----- Setters -----

    void setCountry(String country) {
        this.country = country;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setStreet(String street) {
        this.street = street;
    }

    //----- Getters -----

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
