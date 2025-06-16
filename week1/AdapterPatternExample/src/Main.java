import adaptee.PaypalGateway;
import adaptee.StripeGateway;
import adapter.PaymentProcessor;
import adapter.PaypalAdapter;
import adapter.StripeAdapter;

public class Main {
    public static void main(String[] args) {
        PaypalGateway paypal = new PaypalGateway();
        PaymentProcessor paypalAdapter = new PaypalAdapter(paypal);
        paypalAdapter.processPayment(100.0);

        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(200.0);
    }
}