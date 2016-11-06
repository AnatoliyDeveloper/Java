package JavaOOP.Lesson10.courseproject.io;

import JavaOOP.Lesson10.courseproject.common.Validator;
import JavaOOP.Lesson10.courseproject.entity.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public class PersonIOUtils
{

    public static final String CSV_DELIMITER = ";";

    private PersonIOUtils()
    {
    }

    // Символьный вывод

    public static void outputPersonIntoFile(Person person, String fileName) throws IOException
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
        {
            outputPerson(person, writer);
        }
    }

    public static void outputPersonsIntoFile(List<Person> persons, String fileName) throws IOException
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
        {
            outputPersons(persons, writer);
        }
    }

    public static void outputPerson(Person person, PrintWriter writer)
    {
        writer.println(convertPersonToCsv(person));
    }

    public static void outputPersons(List<Person> persons, PrintWriter writer)
    {
        for (Person person : persons)
        {
            outputPerson(person, writer);
        }
    }

    // Символьный ввод

    public static Person readPersonFromFile(String fileName) throws IOException
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            return readPerson(reader);
        }
    }

    private static Person readPerson(BufferedReader reader) throws IOException
    {
        String line = reader.readLine();
        return parsePersonFromCsv(line);
    }

    public static List<Person> readPersonsFromFile(String fileName) throws IOException
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            return readPersons(reader);
        }
    }

    public static List<Person> readPersons(BufferedReader reader) throws IOException
    {
        List<Person> persons = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null)
        {
            Person person = parsePersonFromCsv(line);
            if (person != null)
            {
                persons.add(person);
            }
        }

        return persons;
    }

    // Преобразования Person <-> csv

    public static String convertPersonToCsv(Person person)
    {
        return person.getId() + CSV_DELIMITER + person.getName() + CSV_DELIMITER + person.getAge();
    }

    public static Person parsePersonFromCsv(String s)
    {
        if (s == null || s.isEmpty())
        {
            return null;
        }

        String[] tokens = s.split(CSV_DELIMITER);

        if (!Validator.isInt(tokens[0]) || !Validator.isInt(tokens[2]))
        {
            return null;
        }

        int id = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        int age = Integer.parseInt(tokens[2]);

        return new Person(id, name, age);
    }

    // Бинарный вывод

    public static void outputBinaryPersonsIntoFile(List<Person> persons, String fileName) throws IOException
    {
        try (ObjectOutput outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName))))
        {
            outputStream.writeObject(persons);
        }
    }

    // Бинарный ввод

    public static List<Person> readBinaryPersonsFromFile(String fileName) throws IOException, ClassNotFoundException
    {
        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream(fileName)))
        {
            return (List<Person>) objectInput.readObject();
        }
    }
}
