package Interface;

public class Sportsmen implements Behaviour{

    @Override
    public void run() {
        System.out.println("Sportsmen is running");
    }

    public void drink() {
        System.out.println("Sportsmen is drinking");
    }


}
