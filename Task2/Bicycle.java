package Task2;
public class Bicycle extends Transport {

    public Bicycle(String mark, String model, double speed) {
        super(mark, model, speed);
    }

    @Override
    public boolean isRides() {
        if (super.speed <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
