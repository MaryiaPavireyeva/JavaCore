package enumber;

public enum TypeOfStudents { //объединение констант грубо говоря
    TYPE_1("Talant"),
    TYPE_2("ne ochen"),
    TYPE_3("bad boy");

    private String talent;

    TypeOfStudents(String talent) {
        this.talent = talent;
    }

    public String getTalent() {
        return talent;
    }

    public static void main(String[] args) {
//        TypeOfStudents type = TypeOfStudents.TYPE_1;
        for (TypeOfStudents type : TypeOfStudents.values()) { //values это метод который возвращает все переменные
            System.out.println(type.name());
            System.out.println(type.ordinal()); //последовательность
            System.out.println(type.getTalent());
        }

        System.out.println(TypeOfStudents.TYPE_1.getTalent());
    }
}
