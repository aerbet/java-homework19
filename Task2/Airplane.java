package Task2;
public class Airplane extends Transport {

    public Airplane(String mark, String model, double speed) {
        super(mark, model, speed);
    }

    @Override
    public boolean isRides() {
        return false; // airplane is flying not rides
    }
}
