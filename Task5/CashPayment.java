package Task5;

public class CashPayment extends PaymentMethod {

    public CashPayment(double balance) {
        super(balance);
    }

    @Override
    public boolean pay(double cost) {
        if (cost <= balance) {
            return true;
        } else {
            return false;
        }
    }
    
}
