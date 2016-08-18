public class Runner {
    public static void main(String[] args) {

        User root = new User(" rOo t ","root");
        System.out.println(root);
//        root.setPassword();
//        System.out.println(root);

        Product car1 = new Car("Citroen.C4", 1., 10000., "CT", "broken", root.getId());
        System.out.println(car1);

        Product house1 = new Realty("MarininskyPalace", 1., 10000000., "CT", "need renovation", root.getId());
        System.out.println(house1);

        Product car2 = new Car("Chrysler.C300", 1., 19000., "CT", "new", root.getId());
        System.out.println(car1);

        Auction auction1 = new Auction( (System.currentTimeMillis()+1000*60*60*24*21), car2, root.getId());
        System.out.println(auction1);

        




    }
}
