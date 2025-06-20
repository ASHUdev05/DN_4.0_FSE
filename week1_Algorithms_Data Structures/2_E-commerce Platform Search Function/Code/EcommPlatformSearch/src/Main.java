public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(103, "Smartphone", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Book", "Education"),
                new Product(104, "Tablet", "Electronics")
        };

        int searchId = 104;

        System.out.println("=== Linear Search ===");
        Product linearResult = LinearSearch.search(products, searchId);
        if (linearResult != null)
            System.out.println("Found: " + linearResult.productId);
        else
            System.out.println("Product not found");

        System.out.println("\nSorting products for binary search...");
        BinarySearch.sortById(products);

        System.out.println("=== Binary Search ===");
        Product binaryResult = BinarySearch.search(products, searchId);
        if (binaryResult != null)
            System.out.println("Found: " + binaryResult.productId);
        else
            System.out.println("Product not found");
    }
}