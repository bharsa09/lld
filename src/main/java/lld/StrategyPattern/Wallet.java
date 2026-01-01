package lld.StrategyPattern;

public class Wallet implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Payment processed using Wallet");
    }
}
