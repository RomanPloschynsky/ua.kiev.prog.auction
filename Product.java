import java.net.URL;
import java.util.ArrayList;


abstract class Product {
    private int id;
    private String gtin;
    private String name;
    //private ArrayList<Categories> categories{}; //todo: rewrite the class
    private Units.units units;
    private double quantity;
    private Double balance;
    private double price;
    private String description;
    private ArrayList<URL> photos;
    private String country;
    private String city;
    private String address;
    private int ownerId;
    private String someNewField; //todo: adding a new field;

    public Product(String name, double quantity, double price, String unit, String description,
                   int ownerId) {
        this.id = (ownerId + name).hashCode();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.units = Units.units.valueOf(unit);
        this.description = description;
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Product{" + getClass().getName() + ":" + id +
                "{gtin:" + gtin +
                "},{name:" + name +
                "},{units:" + units.toString() +
                "},{quantity:" + quantity +
                "},{balance:" + balance +
                "},{price:" + price +
                "},{description:" + description +
                "},{photos:" + photos +
                "},{country:" + country +
                "},{city:" + city +
                "},{address:" + address +
                "},{ownerId:" + ownerId +
                "}}";
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnits(String units) {
        this.units = Units.units.valueOf(units);
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhotos(URL photosUrl) {
        this.photos.add(photosUrl);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public String getGtin() {
        return gtin;
    }

    public String getName() {
        return name;
    }

    public String getUnits() {
        return units.toString();
    }

    public double getQuantity() {
        return quantity;
    }

    public Double getBalance() {
        return balance;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<URL> getPhotos() {
        return photos;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getSomeNewField() {
        return someNewField;
    }

    public void createNewProductType() {} // TODO: realise this bullshit
}
