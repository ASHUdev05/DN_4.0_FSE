public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileClient = new MobileApp("Alice");
        Observer webClient = new WebApp("Bob");

        market.register(mobileClient);
        market.register(webClient);

        market.notify(100.5);
        market.notify(102.75);

        market.deregister(mobileClient);

        market.notify(98.6);
    }
}