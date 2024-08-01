package Interface;

public class People implements Behaviour {

    @Override
    public void run() {
        System.out.println("People are running");
    }

    public static void run(Behaviour behaviour) {
        behaviour.run();
        behaviour.run(5);
        if (behaviour instanceof Sportsmen) {
            Sportsmen sportsmen = (Sportsmen) behaviour;
            sportsmen.drink();
        }
    }

    public static void main(String[] args) {
        People p = new People();
        Sportsmen sportsmen = new Sportsmen();
        run(p);
        run(sportsmen);

        if (p instanceof Behaviour) {
            Behaviour p1 = p;
            p1.run();
        }

        if (sportsmen instanceof Behaviour) {
            Behaviour sportsmen1 = sportsmen;
            sportsmen1.run();
        }
    }
}

