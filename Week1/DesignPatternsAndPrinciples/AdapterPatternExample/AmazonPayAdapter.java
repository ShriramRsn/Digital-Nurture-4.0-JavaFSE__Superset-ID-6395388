public class AmazonPayAdapter implements PaymentProcessor{
    AmazonPay amazonPay;
    public AmazonPayAdapter(AmazonPay amazonPay){
        this.amazonPay = amazonPay;
    }
    @Override
    public int getAmount() {
        return amazonPay.getPayAmount();
    }

    @Override
    public int getPIN() {
        return amazonPay.getPayPin();
    }

    @Override
    public String processPayment() {
        return amazonPay.getPayProcess();
    }

}
