class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
    }

    // Business rule: price must be positive
    public void setPrice(double price) {
        if (price > 0) this.price = price;
        else System.out.println("Invalid price.");
    }

    public double getPrice() { return price; }
    public String getProductId() { return productId; }
    public String getName() { return name; }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Product product = new Product("P101", "Laptop", 75000);
        System.out.println("Product: " + product.getName() + ", Price: ₹" + product.getPrice());

        product.setPrice(-200); // Invalid attempt
        product.setPrice(72000); // Valid update
        System.out.println("Updated Price: ₹" + product.getPrice());
    }
}
