package Massive;

import java.util.Objects;

public class Flower extends Object{
    private String color;
    private int size;

    public Flower(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return size == flower.size && Objects.equals(color, flower.color);
    }

    private static void print(Flower[] flowers) {
        for (Flower flower1 : flowers) { //каждый элементе массива запихивается в car и выводится
            System.out.println(flower1);
        }
    }


    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        Flower red = new Flower("red", 15);
        flowers[0] = red;
        Flower blue = new Flower("blue", 14);
        flowers[1] = blue;
        Flower orange = new Flower("orange", 13);
        flowers[2] = orange;

        Flower etalon = new Flower("red", 15);

        //print(flowers);

        for (int i = 0; i < flowers.length; i++) {
            if (etalon.equals(flowers[i])) { //сравнили адреса
                System.out.println(i + "=");
            }

        }
    }
}


