package decorator;

public class ColorDecorator implements IPhone{
    private IPhone iphone;
    private String name;
    private String model;
    private int price;
    private String color;

    public ColorDecorator(IPhone iphone, int price, String color) {
        this.iphone = iphone;
        this.price = price;
        this.color = color;
    }

    @Override
    public String getName() {
        return iphone.getName();
    }

    @Override
    public String getModel() {
        return iphone.getModel();
    }

    @Override
    public int getPrice() {
        return this.price + iphone.getPrice();
    }

    public String getColor() {
        return this.color;
    }
}
