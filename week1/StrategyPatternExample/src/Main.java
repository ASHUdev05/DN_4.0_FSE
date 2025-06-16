public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(100);

        PaymentStrategy payPalPayment = new PayPalPayment();
        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(200);
    }
}