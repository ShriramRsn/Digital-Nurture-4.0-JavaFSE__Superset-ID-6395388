public interface PaymentProcessor {
    public int getAmount();
    public int getPIN();
    public String processPayment();
}
