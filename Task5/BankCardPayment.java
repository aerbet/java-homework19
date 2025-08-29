package Task5;

public class BankCardPayment extends PaymentMethod {
    private double cardLimit;

    protected BankCardPayment(double balance, double cardLimit) {
        super(balance);
        this.cardLimit = cardLimit;
    }

    @Override
    public boolean pay(double cost) {
        if (cost <= balance && cost <= cardLimit) {
            return true;
        } else {
            return false;
        }
    }
    
}
