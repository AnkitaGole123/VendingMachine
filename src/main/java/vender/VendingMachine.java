package vender;

import java.util.ArrayList;
import java.util.List;

class VendingMachine {
    private Product currentProduct;

    List<Output> takeOrder(Order order){
        List<Output> outputs = new ArrayList<>();
        outputs.add(order);
        return outputs;
    }
   double remainingPrice(double price) {
       return price - currentProduct.getAmount();

   }
}