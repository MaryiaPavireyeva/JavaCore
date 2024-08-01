package Massive;

import java.util.Objects;

public class Car extends Object {
    private String make;
    private int size;

    public Car(String make){
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Car(String make, int size) {
        this.make = make;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  //адрес объекта на хипе подставит вместо this
        if (o == null || getClass() != o.getClass()) return false; //o - это наш второй объект(ссылка на объект)
        Car car = (Car) o; //создали переменную о типа Car и засунули адрес второго объекта.
        // Чтобы работать с методами не только Object но и Car
        return Objects.equals(make, car.make) && size == car.size;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 50);
        Car car2 = new Car("Vw", 54);
        if (car1.equals(car2)) { //сравнили адреса
            System.out.println("=");
        } else {
            System.out.println("!=");
        }
    }
    }

