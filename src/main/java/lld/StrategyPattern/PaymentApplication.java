package lld.StrategyPattern;

public class PaymentApplication {

    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCard();
        paymentService payment1 = new paymentService(creditCardPayment);
        payment1.executePayment();

        PaymentStrategy walletPayment = new Wallet();
        paymentService payment2 = new paymentService(walletPayment);
        payment2.executePayment();

        PaymentStrategy debitCard = new DebitCard();
        paymentService payment3 = new paymentService(debitCard);
        payment3.executePayment();
    }
}
