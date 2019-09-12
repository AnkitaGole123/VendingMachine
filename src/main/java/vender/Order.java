package vender;

public class Order {
    private Product name;
    private Coins price;
    double quantity;
    public Order(Product name, Coins price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product getName() {
        return name;
    }

    public Coins getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}
