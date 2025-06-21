public class AmazonPay {
    private final int payAmount;
    private final int payPin;
    private final String payProcess;

    public AmazonPay(int payAmount, int payPin, String payProcess) {
        this.payAmount = payAmount;
        this.payPin = payPin;
        this.payProcess = payProcess;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public int getPayPin() {
        return payPin;
    }


    public String getPayProcess() {
        return payProcess;
    }

}
