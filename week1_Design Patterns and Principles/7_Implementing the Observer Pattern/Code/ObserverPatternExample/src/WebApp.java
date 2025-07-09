public class WebApp implements Observer {
    private final String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " (Web) received stock price update: $" + price);
    }
}
