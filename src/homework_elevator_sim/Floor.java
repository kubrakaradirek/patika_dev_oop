package homework_elevator_sim;

import java.util.List;

public class Floor extends BaseEntity {
    private int floorNumber;
    private List<CallButton> callButtons; // Yukarı ve Aşağı setleri
    private ArrivalBell bell;
    private SignalLight signalLight; // Yön ve geliş ışığı
}