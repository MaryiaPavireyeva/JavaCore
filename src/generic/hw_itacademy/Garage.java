package generic.hw_itacademy;

public class Garage<T extends Vehicle> {
    private T name;

    public T getAddressVehicle() {
        return name;
    }

    public Garage(T name) {
        this.name = name;
    }


    public static void main(String[] args) {

        Garage<Car> car = new Garage<>(new Car("buick"));
        System.out.println(car.getAddressVehicle().getNameVehicle());

        Garage<Motorcycle> moto = new Garage<>(new Motorcycle("bmw"));
        System.out.println(moto.getAddressVehicle().getNameVehicle());

    }
}
