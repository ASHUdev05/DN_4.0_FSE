package adaptee;

public class PaypalGateway {
    public void makePayment(double amount) {
        System.out.println("Payed ₹"+amount+" using Paypal.");
    }
}
