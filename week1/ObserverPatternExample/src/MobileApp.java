public class MobileApp implements Observer {
    private final String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " (Mobile) received stock price update: $" + price);
    }
}
