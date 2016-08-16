import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();

        products.add(new Realty("name4",0.,"some description4"));
        products.get(0).setId(11);

        products.add(new Realty("name1",0.,"some description2"));
        products.get(1).setId(2);

        products.add(new Realty("name2",0.,"some description3"));
        products.get(2).setId(3);

        products.add(new Realty("name3",0.,"some description3"));
        products.get(3).setId(13);

        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();



        List list = new ArrayList();
        list.add("id");
        list.add("name");

        //ObjectsSorting.getClassFields(products.get(0));

        for(Product product : products) {
            System.out.println(product);
        }

        ObjectsSorting.sortObjects(products, list);

        for(Product product : products) {
            System.out.println(product);
        }

    }
}
