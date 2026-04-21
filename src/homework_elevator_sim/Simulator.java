package homework_elevator_sim;

import java.time.Clock;

public class Simulator {
    private Clock clock; // Zaman damgaları için
    private Scheduler scheduler;

    public void logEvent(String event) {
        System.out.println("[" + clock.getTime() + "] " + event);
    }
}