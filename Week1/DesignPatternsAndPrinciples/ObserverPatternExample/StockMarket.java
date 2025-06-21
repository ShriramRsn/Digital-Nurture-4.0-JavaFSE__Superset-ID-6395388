import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    private final List<Observer> observers = new ArrayList<>();
    private String stock;
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
        for(Observer observer : observers){
            observer.update(stock);
        }
    }

    public void setStock(String stock){
        this.stock = stock;
        Notify();
    }

}
