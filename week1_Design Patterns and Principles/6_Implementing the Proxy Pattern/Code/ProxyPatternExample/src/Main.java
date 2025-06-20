public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");

        System.out.println("First call to display():");
        image1.display();

        System.out.println("\nSecond call to display():");
        image1.display();

        System.out.println("\nCreating and displaying another image:");
        Image image2 = new ProxyImage("sunset.jpg");
        image2.display();
    }
}