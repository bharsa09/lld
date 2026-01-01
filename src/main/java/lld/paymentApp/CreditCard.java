package lld.paymentApp;

public class CreditCard extends card{

    public CreditCard(String cardNumber, String cardHolderName, String expiryDate) {
        super(cardNumber, cardHolderName, expiryDate);
    }

    @Override
    public void pay() {
        System.out.println("Payment made using Credit card: " + cardNumber);
    }
}
