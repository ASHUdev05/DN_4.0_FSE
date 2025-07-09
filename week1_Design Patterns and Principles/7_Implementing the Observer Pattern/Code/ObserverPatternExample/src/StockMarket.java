import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer deregistered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notify(double stockPrice) {
        for(Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}
