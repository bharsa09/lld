package lld.paymentApp;

import java.util.HashMap;

public class PaymentService {

    HashMap<String,payment> paymentMethod;

    public PaymentService(){
        this.paymentMethod = new HashMap<>();
    }

    void addPaymentMethod(String methodName, payment method) {
        paymentMethod.put(methodName, method);
    }

    void makePayment(String methodName) {
        payment method = paymentMethod.get(methodName);
        if (method != null) {
            method.pay();
        } else {
            System.out.println("Payment method not found: " + methodName);
        }
    }

}
