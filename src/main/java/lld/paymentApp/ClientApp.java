package lld.paymentApp;

public class ClientApp {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.addPaymentMethod("creditCard", new CreditCard("1234-5678-9012-3456", "John Doe", "12/25"));
        paymentService.addPaymentMethod("debitCard", new DebitCard("9876-5432-1098-7654", "Jane Smith", "11/24"));
        paymentService.addPaymentMethod("upi", new UPI("john.doe@upi"));

        paymentService.makePayment("creditCard");
        paymentService.makePayment("debitCard");
        paymentService.makePayment("upi");

    }
}
