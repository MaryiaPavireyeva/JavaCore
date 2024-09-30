package comparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StudentComparableMain {
    public static void main(String[] args) {
        Students student1 = new Students(1, "Jhone", "Java");
        Students student2 = new Students(2, "Mike", "Java");
        Students student3 = new Students(3, "Kate", "Java");
        List<Students> students = Arrays.asList(student1, student2, student3);
        System.out.println(students);
        //выведет в порядке как добавили

        Collections.sort(students);
        System.out.println(students);
        //выведет отсортированный список по именам из класса Students

        Collections.sort(students, new StudentsNameComparator());
        students.forEach(new Consumer<Students>() {
            @Override
            public void accept(Students students) {
                System.out.println(students);
            }
        });
        System.out.println(students);
        //печатаем список, отсортированный по именам студентов

        Collections.sort(students, new StudentsDeptComparator());
        System.out.println(students);
        //печатаем список, отсортированный по кафедрам студентов

        Collections.sort(students,new StudentsNameComparator().thenComparing(new StudentsDeptComparator()));
        System.out.println(students);
        //сортируем список по имени и названию кафедры
    }
}
