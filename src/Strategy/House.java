package Strategy;

public class House {
    private DoorAbstract door;  //надо спросить зачем это

    public House(DoorAbstract door) {
        this.door = door;
    }

    public void openDoor() {
        door.open();
        if (door instanceof DoorWood) {
            DoorWood doorWood = (DoorWood) door;
            doorWood.creak();

        }
    }
}
