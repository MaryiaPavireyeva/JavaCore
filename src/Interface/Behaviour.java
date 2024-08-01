package Interface;

public interface Behaviour {
    int COUNT = 15;
    void run ();   //нет реализации метода в интерфейсе, можно удалить public и abstract

    default void run (int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("I'm running" + i + "hours");

        }
    }

}
