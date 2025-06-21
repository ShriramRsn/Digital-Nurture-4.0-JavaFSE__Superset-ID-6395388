public class WebApp implements Observer{
    private String stock;
    @Override
    public void update(String stock) {
        this.stock = stock;
        display();
    }

    private void display(){
        System.out.println("WebApp View : Stock Market is " + stock);
    }
}
