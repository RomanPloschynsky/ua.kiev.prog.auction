import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class User {
    private int id;
    private String login;
    private JPasswordField password;
    private String name;
    private String bankId;
    private enum type {INDIVIDUAL,CORPORATION,ADMIN};
    private URL photo;
    private ArrayList<? super Product> products;

    public User(String login, String password) {
        this.login = login.trim();
        this.password = new JPasswordField(password.trim());
        this.id = (this.login + this.password).hashCode();
    }

    @Override
    public String toString() {
        return "User{" + id +
                "{login:" + login +
                "},{password:" + password.getPassword() +
                "},{name:" + name +
                "},{bankId:" + bankId +
                "},{photo:" + photo +
                "},{products:" + products +
                "}}";
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write your old password");
        String oldPass = in.next().trim();
        if(oldPass.equals(this.password.getText())) {
            System.out.println("Write your new password");
            String newPass = in.next().trim();
            this.password.setText(newPass);
            System.out.println("Your password was changed successfully");
        } else {
            System.out.println("Incorrect password. Try one more tyme");
            setPassword();
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void setPhoto(URL photo) {
        this.photo = photo;
    }

    public void setProduct(Product product) {
        this.products.add(product);


    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getBankId() {
        return bankId;
    }

    public URL getPhoto() {
        return photo;
    }

    public String getProducts() {
        return products.toString();
    }
}
