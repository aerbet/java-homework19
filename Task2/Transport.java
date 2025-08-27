package Task2;
public abstract class Transport {
    protected String mark;
    protected String model;
    protected double speed;

    protected Transport(String mark, String model, double speed) {
        this.mark = mark;
        this.model = model;
        this.speed = speed;
    }

    public abstract boolean isRides();
}
