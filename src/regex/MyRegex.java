package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {


    public static void main(String[] args) {
        System.out.println("20934".matches("-?[0-9]+")); //-? значит с минусом либо без, + значит один или несколько раз
        System.out.println("+(375)29-333-44-55".matches("\\+\\(375\\)(29|33|44)-\\d{3}-\\d{2}-\\d{2}"));

        Pattern p = Pattern.compile("^ +- +$"); //пробел несколько раз или одинБ тире, пробел несколько раз или одинБ тире ищет
        //^ значит ищет такое совпадение прямо с начала строки, $ что строка прямо на этом символе и заканчивается
        Matcher matcher = p.matcher("Test - string - test");
        while (matcher.find()) { //find true/false
            System.out.println(matcher.start() + " " + matcher.end()); //start - начальная позиция " +- +". end - конечная позиция " +- +"
            System.out.println(matcher.group()); //group вывело то, что нашло
        }

        matcher.reset("Test -    string -    Testtest");
        while (matcher.find()) {
        System.out.println(matcher.start() + " " + matcher.end());
        System.out.println(matcher.group());
    }

        Pattern p2 = Pattern.compile("Test");
        Matcher matcher2 = p2.matcher("Test -  Test -  Test");
        while (matcher2.find()) {
            System.out.println(matcher2.start() + " " + matcher2.end());
            System.out.println(matcher2.group());
        }

        Pattern p3 = Pattern.compile("www\\.((\\w+)\\.by)");
        Matcher matcher3 = p3.matcher("  www.tut.by   ");
        matcher3.find();
        System.out.println(matcher3.group(1)); //печатает то, что в основных скобках
        System.out.println(matcher3.group(2));//печатает то, что в скобках основных скобок

    }
}
