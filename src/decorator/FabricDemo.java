package decorator;

public class FabricDemo {
    public static void main(String[] args) {
        IPhone iphone16 = new Apple("iphone", "16", 2500, "black");
        IPhone silverIphone16 = new SilverMoon(iphone16);
        System.out.println("Price: " + silverIphone16.getPrice() + " " + "Color: " + silverIphone16.getColor());

        IPhone glitterOn = new GlitterOn(silverIphone16);
        System.out.println("Price: " + glitterOn.getPrice() + " " + "Color: " + glitterOn.getColor());

        IPhone iphone16pro = new Apple("iphone", "16pro", 2024, "black");
        IPhone iphone16proMax = new Apple("iphone", "16proMax", 2024, "black");

        IPhone xiaomi14 = new Xiaomi("xiaomi", "14", 2024, "black");
        IPhone xiaomi14T = new Xiaomi("xiaomi", "14T", 2024, "black");
        IPhone xiaomi14TPro = new Xiaomi("xiaomi", "14TPro", 2024, "black");

        IPhone nokia3210 = new Xiaomi("nokia", "3210", 1999, "black");
        IPhone nokia215 = new Xiaomi("nokia", "215", 2024, "black");
        IPhone nokia225 = new Xiaomi("nokia", "225", 2024, "black");
    }
}
