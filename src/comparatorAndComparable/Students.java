package comparatorAndComparable;

public class Students implements Comparable<Students>{

    private Integer id;
    private String name;
    private String departure;

    public String getDeparture() {
        return departure;
    }

    public String getName() {
        return name;
    }

    public Students(Integer id, String name, String departure) {
        this.id = id;
        this.name = name;
        this.departure = departure;
    }

    @Override
    public int compareTo(Students student) {
        return this.name.compareTo(student.name);
    }

    //Comparable может сортировать только по одному атрибуту
    // Интерфейс Comparable должен быть реализован в классе, который будет использоваться для сортировки.
}

