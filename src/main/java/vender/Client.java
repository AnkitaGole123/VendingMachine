package vender;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Output output = new Output();
        List<Coin> coins = new ArrayList<>();
        coins.add(Coin.QUARTER);
        Order order = new Order(Product.COKE,coins);
        System.out.println(vendingMachine.takeOrder(order));
    }
}
