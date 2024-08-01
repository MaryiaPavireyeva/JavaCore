package string;

import enumber.TypeOfStudents;

public class WorkWithString {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = new String("test");
        String s3 = "test";
        String s4 = s2.intern(); //поместили s2 в s4, но сам s2 остался отдельным объектом и не изменился


        if(s4.equals(s2)) { //чтобы сравнить что внутри объекта
            System.out.println("s1 == s4");
        } else {
            System.out.println("s1 !== s4");
        }

        StringBuilder builder = new StringBuilder();
        builder.append("mama");
        builder.append(" ").append("test!");
        String str = builder.toString();
        System.out.println(str);

        String s = "test test!";

        if(str == s) {
            System.out.println("s == str");
        } else {
            System.out.println("s !== str");
        }
        System.out.println(str.indexOf(" ")); //найди индекс первого пробела
        System.out.println(str.substring(5, 8)); //с 5 по 7ю выведет
        System.out.println(str.replace("test", "result"));

    }
}
