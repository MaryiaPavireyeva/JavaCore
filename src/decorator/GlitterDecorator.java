package decorator;

public class GlitterDecorator implements IPhone{
    private IPhone iPhone;
    private String name;
    private String model;
    private int price;
    private String color;
    private boolean glitterOn;


    public GlitterDecorator(IPhone iPhone, boolean glitterOn, int price) {
        this.iPhone = iPhone;
        this.glitterOn = glitterOn;
        this.price = price;
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
        return this.price + iPhone.getPrice();
    }

    @Override
    public String getColor() {
        return iPhone.getColor() + ". Glitter: " + this.glitterOn;
    }
}
