public class Car extends Product {

    enum Category{SEDAN,MINIWAN,CUPE,HADJBACK};



    public Car(String name, double quantity, double price, String unit, String description, int ownerId) {
        super(name, quantity, price, unit, description, ownerId);
    }

}