
public class Realty extends Product {

    enum Category{ROOM,APARTMENT,HOUSE,TERRITORY};



    public Realty(String name, double quantity, double price, String unit, String description, int ownerId) {
        super(name, quantity, price, unit, description, ownerId);
    }

}



