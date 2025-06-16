package adaptee;

public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Payed ₹"+amount+" using Stripe.");
    }
}
