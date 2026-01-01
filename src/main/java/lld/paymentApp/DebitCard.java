package lld.paymentApp;

public class DebitCard extends card{

    public DebitCard(String cardNumber, String cardHolderName, String expiryDate) {
        super(cardNumber, cardHolderName, expiryDate);
    }

    @Override
    public void pay() {
        System.out.println("Payment made using Debit card: " + cardNumber);
    }
}
