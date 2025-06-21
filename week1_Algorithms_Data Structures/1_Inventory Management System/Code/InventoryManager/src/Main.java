public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        inventory.addProduct(new Product(1, "Laptop", 10, 999.99));
        inventory.addProduct(new Product(2, "Smartphone", 20, 499.99));
        inventory.addProduct(new Product(3, "Tablet", 15, 299.99));

        // Displaying all products
        System.out.println("All Products:");
        inventory.displayAll();

        // Updating a product
        inventory.updateProduct(2, 18, 479.99);
        System.out.println("\nAfter updating product 2:");
        inventory.displayAll();

        // Deleting a product
        inventory.deleteProduct(1);
        System.out.println("\nAfter deleting product 1:");
        inventory.displayAll();

    }
}