public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 1500.0),
                new Order(2, "Bob", 2500.0),
                new Order(3, "Charlie", 500.0),
                new Order(4, "Dave", 3000.0)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        Sorter.bubbleSort(orders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        for (Order o : orders) System.out.println(o);

        orders = new Order[]{
                new Order(1, "Alice", 1500.0),
                new Order(2, "Bob", 2500.0),
                new Order(3, "Charlie", 500.0),
                new Order(4, "Dave", 3000.0)
        };

        Sorter.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        for (Order o : orders) System.out.println(o);
    }
}