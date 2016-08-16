import java.net.URL;

public class User {
    private int id;
    private String Login;
    private String name;
    private String bankId;
    private enum businessActivity {INDIVIDUAL,CORPORATION};
    private URL photo;

    public User(int id, String login, String name, String bankId, URL photo) {
        this.id = id;
        Login = login;
        this.name = name;
        this.bankId = bankId;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public URL getPhoto() {
        return photo;
    }

    public void setPhoto(URL photo) {
        this.photo = photo;
    }
}
