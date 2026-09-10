package exercise1.entity;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // construtor padrão
    public Product() {
    }

    // construtor com 2 args
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // sobrecarga com 3 args
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
