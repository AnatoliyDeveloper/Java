package ua.kiev.prog.javaoop.construction._1_multiple_constructors;

/**
 * @author Bohdan Vanchuhov
 */
public class Book {
    public static final String DEFAULT_NAME = "";
    public static final double DEFAULT_PRICE = 0.;

    public static int newId = 0;

    private final int id;
    private String name;
    private double price;

    public Book(String name, double price) {
        id = newId++;
        this.name = name;
        this.price = price;
    }

    public Book() {
        this(DEFAULT_NAME);
    }

    public Book(String name) {
        this(name, DEFAULT_PRICE);
    }

    public Book(double price) {
        this(DEFAULT_NAME, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    //----- Getters and Setters -----
}

class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);

        Book book1 = new Book("Hello", 10.);
        System.out.println(book1);

        Book book2 = new Book("Hi");
        System.out.println(book2);
    }
}
