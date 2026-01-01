package lld.StrategyPattern;

public class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Payment processed using Credit Card");
    }
}
