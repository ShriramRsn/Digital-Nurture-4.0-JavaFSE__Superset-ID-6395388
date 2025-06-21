public class MobileApp implements Observer{
    private String stock;
    @Override
    public void update(String stock) {
        this.stock = stock;
        display();
    }

    private void display(){
        System.out.println("MobileView: Stock Market is " + stock);
    }

}
