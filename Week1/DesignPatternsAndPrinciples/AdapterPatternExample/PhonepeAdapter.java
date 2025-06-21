public class PhonepeAdapter implements PaymentProcessor{
    Phonepe phonepe;

    public PhonepeAdapter(Phonepe phonepe){
        this.phonepe = phonepe;
    }
    @Override
    public int getAmount() {
        return phonepe.getamount();
    }

    @Override
    public int getPIN() {
        return phonepe.getPin();
    }

    @Override
    public String processPayment() {
        return phonepe.getprocess();
    }

}
