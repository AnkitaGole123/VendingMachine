package vender;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Coins> coins = new ArrayList<>();
        coins.add(Coins.QUARTER);
        Order order = new Order(Product.COKE,coins,1);

    }
}
