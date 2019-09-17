package vender;

import java.util.ArrayList;
import java.util.List;

class VendingMachine {
    List<Product> coins = new ArrayList<>();
    Product currentProduct;
    double currentBalance;
    List<Output> takeOrder(Order order){
        List<Output> outputs = new ArrayList<>();
        outputs.add(order);
        return outputs;
    }

   double remainingPrice() {
        double remaining = currentProduct.getCoins() - currentBalance;
        return remaining;
   }
}