package vender;

import java.util.ArrayList;
import java.util.List;

class VendingMachine {
    Inventory inventory;
    List<Output> takeOrder(Order order){
        List<Output> outputs = new ArrayList<>();
        outputs.add(order);
        return outputs;
    }

    double remainingPrice(){
    Output output = new Output();
        return output.getRemainingChange();
    }
}