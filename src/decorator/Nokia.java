package decorator;

public class Nokia implements IPhone{
    private String name;
    private String model;
    private int price;
    private String color;

    public Nokia(String name, String model, int price, String color) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
