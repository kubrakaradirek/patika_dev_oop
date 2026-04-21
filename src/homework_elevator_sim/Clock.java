package homework_elevator_sim;

import java.time.LocalTime;

public class Clock {
    public static String getTime() {
        return LocalTime.now().toString();
    }
}