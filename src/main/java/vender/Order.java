package vender;
import java.util.List;

public class Order extends Output {
    private Product name;
    private List<Coin> coins;
    private double quantity;

    public Order(Product name, List<Coin> coins, double quantity) {
        this.name = name;
        this.coins = coins;
        this.quantity = quantity;
    }

    public Product getName() {
        return name;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public double getQuantity() {
        return quantity;
    }
}
