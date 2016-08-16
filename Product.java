import java.net.URL;
import java.util.*;


abstract class Product {
    int id;
    String name;
    enum type{};
    enum subType{};
    double price;
    String description;
    List<URL> photos = new ArrayList<URL>();
    String country;
    String city;
    String address;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<URL> getPhotos() {
        return photos;
    }

    public void setPhotos(URL url) {
        photos.add(url);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    @Override
    public String toString() {
        return String.format("Product{%d:{name:%s},{type:%s},{price:%s},{description:%s},{photos:%s},{country:%s},{city:%s},{address:%s}};",
                id, name, type.values(), subType.values(), price, description, photos.toString(), country, city, address);
    }


}