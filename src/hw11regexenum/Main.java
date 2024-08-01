package hw11regexenum;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //26 задача
        String number = scanner.nextLine();
        System.out.println("Line: " + number);

        Pattern pattern = Pattern.compile("[)!(,.?:;'-]+");
        Matcher matcher= pattern.matcher(number);
        matcher.find();
        String result = matcher.group();
        System.out.println(result.length()); //кол-во всех знаков препинания. Пробовала вывести через массив,
//        но у меня не получилось



        Scanner scanner2 = new Scanner(System.in); //28 задача
        String text = scanner2.nextLine();
        System.out.println("Line: " + text);
        Pattern pattern2 = Pattern.compile(".\\b\\s+|.\\b");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            String newText = matcher2.group();
            System.out.print(newText);
        }

        Scanner s = new Scanner(System.in); //29 задача
        String lline = s.nextLine();
        extracted(lline);
    }

    private static void extracted(String lline) {
        Pattern p = Pattern.compile("(0x|0X)[0-9a-A-Fa-f0-9]+");
        Matcher m = p.matcher(lline);
        m.find();
        System.out.println("Вот, что я нашел: " + m.group());
    }
}
