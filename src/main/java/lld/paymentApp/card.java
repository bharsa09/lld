package lld.paymentApp;

public abstract class card implements payment {

    String cardNumber;
    String cardHolderName;
    String expiryDate;

    public card(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

//    @Override
//    public void pay() {
//        System.out.println("Payment made using card: " + cardNumber);
//    }
}
