package adapter;

import adaptee.PaypalGateway;

public class PaypalAdapter implements PaymentProcessor {
    private final PaypalGateway paypal;

    public PaypalAdapter(PaypalGateway paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}
