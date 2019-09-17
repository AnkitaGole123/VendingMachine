package vender;
import java.util.List;

public class Order extends Output {
    private Product name;
    private List<Coin> coins;


    public Order(Product name, List<Coin> coins) {
        this.name = name;
        this.coins = coins;
    }
;
    public List<Coin> getCoins() {
        return coins;
    }
}
