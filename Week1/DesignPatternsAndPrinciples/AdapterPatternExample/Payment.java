import java.util.List;
public class Payment {
    public static void main(String[] args) {
        List<PaymentProcessor> processors = List.of(
            new Gpay(1000, 1980, "Google Pay"),
            new PhonepeAdapter(new Phonepe(500, 1997, "PhonePe")),
            new AmazonPayAdapter(new AmazonPay(250, 815, "Amazon Pay"))
        );

        PaymentGateway gateway = new PaymentGateway(processors);
        gateway.executePayments();
    }
}
