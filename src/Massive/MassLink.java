package Massive;

public class MassLink {
    public static void main(String[] args) {
        Car[] mass = new Car[3];
        print(mass);
        Car car1 = new Car("Honda");
        mass[0] = car1;

        Car car2 = new Car("Vw");
        mass[1] = car2;

        Car car3 = new Car("Audi");
        mass[2] = car3;
        car3.hashCode(); //native метод(написан на другом языке программирования)

        print(mass);

        if (car1.equals(car2)) { //сравнили адреса
            System.out.println("=");
        } else {
            System.out.println("!=");
        }
    }

    private static void print(Car[] mass) {
        for(Car car : mass) { //каждый элементе массива запихивается в car и выводится
            System.out.println(car);
        }
    }
}
