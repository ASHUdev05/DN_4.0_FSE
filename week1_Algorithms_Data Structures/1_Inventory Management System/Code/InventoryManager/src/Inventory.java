import java.util.HashMap;

class Inventory {
    private final HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.productId, product);
    }

    public void updateProduct(int productId, int newQty, double newPrice) {
        if (products.containsKey(productId)) {
            Product p = products.get(productId);
            p.quantity = newQty;
            p.price = newPrice;
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        products.remove(productId);
    }

    public void displayAll() {
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}
