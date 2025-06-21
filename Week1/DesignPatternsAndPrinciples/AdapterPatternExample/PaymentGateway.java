import java.util.List;
public class PaymentGateway {
    private final List<PaymentProcessor> payment;

    public PaymentGateway(List<PaymentProcessor> payment){
        this.payment = payment;
    }

    public void executePayments() {
        for (PaymentProcessor pay : payment) {
            System.out.println("Amount: " + pay.getAmount() + "\nPin: " + pay.getPIN() + "\nPaymentMode: " + pay.processPayment() +"\n");
        }
    }
}
