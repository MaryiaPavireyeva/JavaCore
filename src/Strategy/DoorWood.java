package Strategy;

public class DoorWood extends DoorAbstract {
    @Override
    public void open() {
        System.out.println("DoorWood is opened");
    }

    public void creak(){
        System.out.println("creak when the door is opened");
    }
}
