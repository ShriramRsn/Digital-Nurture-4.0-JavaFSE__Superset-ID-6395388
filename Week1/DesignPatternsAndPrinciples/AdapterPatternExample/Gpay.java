public class Gpay implements PaymentProcessor{

    @Override
    public void processPayment() {
        System.err.println("Gpay is processing the payment...");
    }

}
