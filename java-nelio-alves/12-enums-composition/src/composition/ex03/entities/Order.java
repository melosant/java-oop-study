package composition.ex03.entities;

import composition.ex03.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(OrderStatus status, Date moment, Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment : " + moment + "\n");
        sb.append("Order status : " + status + "\n");
        sb.append("Client : " + client + "\n");
        sb.append("Order items : \n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price : $" + String.format("%.2f", total()));

        return sb.toString();
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
