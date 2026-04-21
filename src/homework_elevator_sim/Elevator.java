package homework_elevator_sim;

import java.util.List;

public class Elevator extends BaseEntity {
    private int currentFloor;
    private int capacity = 6;
    private boolean isMoving;
    private ElevatorDoor door;
    private ControlPanel panel;
    private List<Integer> destinations;

    public void move() { /* Hareket mantığı */ }
    public void openDoor() { /* Kapı açma ve bekleme süresi */ }
}