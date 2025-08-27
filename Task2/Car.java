package Task2;
public class Car extends Transport {

    public Car(String mark, String model, double speed) {
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
