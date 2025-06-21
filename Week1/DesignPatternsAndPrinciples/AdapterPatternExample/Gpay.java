public class Gpay implements PaymentProcessor{
    private final int getAmount;
    private final int getPIN;
    private final String processPayment;

    public Gpay(int getAmount, int getPIN, String processPayment) {
        this.getAmount = getAmount;
        this.getPIN = getPIN;
        this.processPayment = processPayment;
    }

    @Override
    public int getAmount() {
        return getAmount;
    }

    @Override
    public int getPIN() {
        return getPIN;
    }

    @Override
    public String processPayment() {
        return processPayment;
    }

}
