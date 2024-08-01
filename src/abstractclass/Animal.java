package abstractclass;

public abstract class Animal {  //объект класса создать не можем, Создаем абстрактный класс тогда когда нельзя
    // в реальности создать такой объект
    private String name;    //правильно делать приватные, работать через методы
    private int age;

    public abstract void eat();

    public static void eatAnimal(Animal animal) {  //пишем Animal animal т к мы не знаем конкретно какое жвотное будет.
        // узнаем через параметр
        animal.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Duck(); //можем работать через абстрактный класс или через прямой класс. разница в ссылках.
        // по сути одно и то же. если каких-то методов нет в энимал, но есть в дог, то создаем объект через Дог, а не через энимал
        // если работать через родительский класс, то метод вызовется переопределенный (если такого метода нет, то выовет метод из родителя)
        Duck duck = new Duck();

        eatAnimal(dog);
    }

}
