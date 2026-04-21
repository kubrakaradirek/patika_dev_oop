package homework_elevator_sim;

abstract class Button extends BaseEntity {
    private boolean isPressed;
    public abstract void push();
}