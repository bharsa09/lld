package lld.StrategyPattern;

public class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Payment processed using Debit Card");
    }
}
