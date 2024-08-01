package hw11regexenum;
import java.util.Scanner;

public enum Seasons {
    WINTER("cold", 91),
    SPRING("water", 90),
    SUMMER("hot", 92),
    AUTUMN("leaves", 93);

    private String description;
    private int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    private static void getSeason() {  //36 задача
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        Seasons newSeason = Seasons.valueOf(season);
        switch (newSeason) {
            case WINTER:
                System.out.println(SPRING);
                break;
            case SPRING:
                System.out.println(SUMMER);
                break;
            case SUMMER:
                System.out.println(AUTUMN);
                break;
            case AUTUMN:
                System.out.println(WINTER);
                break;
            default:
                System.out.println("nothing");

        }
    }

    private static void getCountOfDaysForSeason() { //37 задача
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        Seasons newSeason = Seasons.valueOf(season);
        switch (newSeason) {
            case WINTER:
                System.out.println(WINTER.countOfDays);
                break;
            case SPRING:
                System.out.println(SPRING.countOfDays);
                break;
            case SUMMER:
                System.out.println(SUMMER.countOfDays);
                break;
            case AUTUMN:
                System.out.println(AUTUMN.countOfDays);
                break;
            default:
                System.out.println("nothing");

        }
    }

    public static void main(String[] args) {
        for (Seasons first : Seasons.values()) { //35 задача
            System.out.println(first.name());
            System.out.println(first.ordinal());
            System.out.println(first.getCountOfDays());
            System.out.println(first.getDescription());
        }
        getSeason();
        getCountOfDaysForSeason();
    }
}
