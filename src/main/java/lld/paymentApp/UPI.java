package lld.paymentApp;

public class UPI implements payment {

    String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }
    @Override
    public void pay() {
        System.out.println("Payment made using UPI: " + upiId);
    }


}
