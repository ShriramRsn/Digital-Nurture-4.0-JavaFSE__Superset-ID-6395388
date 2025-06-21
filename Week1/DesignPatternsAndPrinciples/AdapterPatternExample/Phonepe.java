public class Phonepe{

    private final int amount;
    private final int pin;
    private final String process;

    public Phonepe(int amount,int pin,String process) {
        this.amount = amount;
        this.pin = pin;
        this.process = process;
    }

    public int getamount(){
        return amount;
    }

    public int getPin() {
        return pin;
    }

    public String getprocess() {
        return process;
    }

}