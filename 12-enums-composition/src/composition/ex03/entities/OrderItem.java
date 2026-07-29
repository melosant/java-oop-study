package composition.ex03.entities;

public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = subTotal();
    }

    public double subTotal() {
        return quantity * product.getPrice();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(product.getName() + ", ");
        sb.append("Quantity: " + quantity);
        sb.append(", Subtotal: $" + String.format("%.2f", price));
        return sb.toString();
    }
}
