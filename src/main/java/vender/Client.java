package vender;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Coin> coins = new ArrayList<>();
        coins.add(Coin.QUARTER);
        Order order = new Order(Product.COKE,coins,1);
        System.out.println(vendingMachine.takeOrder(order));
    }
}
