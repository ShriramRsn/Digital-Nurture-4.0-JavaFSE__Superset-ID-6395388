public class StockUpdate {
    public static void main(String[] args) {
        StockMarket sm = new StockMarket();
        Observer[] observers = { new MobileApp(), new WebApp() };

        for (Observer observer : observers){
            sm.register(observer);
        }

        sm.deregister(observers[1]);


        sm.setStock("going up");
    }
}
