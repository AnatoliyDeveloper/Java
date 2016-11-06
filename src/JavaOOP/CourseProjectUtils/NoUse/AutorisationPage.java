package JavaOOP.CourseProjectUtils.NoUse;

/**
 * Created by Anatoliy on 10.10.2016.
 */
public class AutorisationPage {

    private String login;
    private String password;

    public AutorisationPage(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
