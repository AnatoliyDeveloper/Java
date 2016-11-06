package JavaOOP.Lesson10.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static JavaOOP.Lesson10.User.Validator.*;


/**
 * Created by Anatoliy on 05.11.2016.
 */
public class UserIOUtils {

    public static final String CSV_DELIMITER = ";";

    private UserIOUtils() {
    }

    public static void writeUsersIntoBinFile(String fileName, List<User> users) throws IOException {
        try (ObjectOutput objectOutput = new ObjectOutputStream(
                new FileOutputStream(fileName))) {

            objectOutput.writeObject(users);
        }
    }

    public static List<User> readUsersFromBinFile(String fileName) throws IOException {
        try (ObjectInput objectInput = new ObjectInputStream(
                new FileInputStream(fileName))) {

            return (List<User>)objectInput.readObject();
        } catch (ClassNotFoundException e) {
            throw new IllegalFormatException("Illegal file: " + fileName, e);
        }
    }

    public static void writeUsersIntoFile(String fileName, List<User> users) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (User user : users) {
                writer.println(user);
            }
        }
    }

    public static List<User> readUsersFromFile(String fileName) throws IOException {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            return readUsers(reader);
        }
    }

    private static List<User> readUsers(BufferedReader reader) throws IOException {
        List<User> res = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                continue;
            }

            User user = parseUser(line);
            res.add(user);
        }

        return res;
    }

    /**
     * @throws IllegalFormatException
     * @throws IOException
     */
    public static User readUserFromFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return readUser(reader);
        } finally {
            closeReader(reader);
        }
    }

    public static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IllegalFormatException
     * @throws IOException
     */
    public static User readUser(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseUser(line);
    }

    // User parsing

    /**
     * @throws IllegalFormatException
     */
    private static User parseUser(String line) {
        String[] tokens = line.split(CSV_DELIMITER);

        if (tokens.length < 4) {
            throw new IllegalFormatException("Number of values < 4: " + line);
        }
        User user = new User();
        user.setId(parseId(tokens[0]));
        user.setName(tokens[1]);
        user.setAge(parseAge(tokens[2]));
        user.setGender(parseGender(tokens[3]));

        return user;
    }

    private static Gender parseGender(String s) {
        if (!Gender.isGender(s)) {
            throw new IllegalFormatException("Illegal gender: " + s);
        }
        return Gender.valueOf(s);
    }

    private static int parseAge(String s) {
        if (!isInt(s)) {
            throw new IllegalFormatException("Illegal age: " + s);
        }
        int age = Integer.parseInt(s);
        if (!isAge(age)) {
            throw new IllegalFormatException("Age should be in the range [1..120]: " + s);
        }
        return age;
    }

    private static long parseId(String s) {
        if (!isLong(s)) {
            throw new IllegalFormatException("Illegal id: " + s);
        }
        return Long.parseLong(s);
    }
}
