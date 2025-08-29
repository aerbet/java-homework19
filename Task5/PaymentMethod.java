package Task5;

public abstract class PaymentMethod {
    protected double balance;

    protected PaymentMethod(double balance) {
        this.balance = balance;
    }

    public abstract boolean pay(double cost);
}
