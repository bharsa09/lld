package lld.StrategyPattern;

public class paymentService {
    private PaymentStrategy p;

    public paymentService(PaymentStrategy p) {
        this.p = p;
    }

    public void executePayment(){
        p.processPayment();
    }
}
