package Strategy;

public class Strategy {
    public static void main(String[] args) {
        Door door = new Door();
        House house = new House(door);
        house.openDoor();

        DoorWood doorWood = new DoorWood();
        House houseWood = new House(doorWood);
        houseWood.openDoor();
    }
}
