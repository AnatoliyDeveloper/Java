package ua.kiev.prog.javaoop.construction._3_builder;

/**
 * Created on 27.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class AddressBuilder {
    private Address address;

    public AddressBuilder() {
        address = new Address();
    }

    public AddressBuilder setCountry(String country) {
        address.setCountry(country);
        return this;
    }

    public AddressBuilder setCity(String city) {
        address.setCity(city);
        return this;
    }

    public AddressBuilder setStreet(String street) {
        address.setStreet(street);
        return this;
    }

    public Address build() {
        return address;
    }
}

class AddressBuilderSample {
    public static void main(String[] args) {
        AddressBuilder addressBuilder = new AddressBuilder();

        Address address = addressBuilder
                .setCountry("Ukraine")
                .setCity("Kiev")
                .setStreet("Dubovogo Street")
                .build();

        System.out.println(address);
    }
}
