package JavaOOP.Lesson10.User;

import java.io.IOException;
import java.util.List;

import static JavaOOP.Lesson10.User.UserIOUtils.*;


/**
 * Created by Anatoliy on 05.11.2016.
 */
public class UserIORunner {

    public static final String INPUT_FILE = "files/users.csv";
    public static final String OUTPUT_FILE = "files/users.out";
    public static final String BIN_FILE = "files/users.dat";

    public static void main(String[] args) throws IOException {
        try {
            List<User> users = readUsersFromFile(INPUT_FILE);
            writeUsersIntoFile(OUTPUT_FILE, users);
            writeUsersIntoBinFile(BIN_FILE, users);
            System.out.println("DONE");
        } catch (IOException e) {
            System.out.println("Sorry, IO Error exists. " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalFormatException e) {
            System.out.println("Illegal format. " + e.getMessage());
        }
    }
}
