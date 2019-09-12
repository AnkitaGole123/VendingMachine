package vender;

import java.util.Arrays;
import java.util.List;

class VendingMachine {
    int capcity;
    Inventory inventory;
    Output takeOrder(Order order){
        List<Output> outputs = Arrays.asList();
        outputs.add(order);
        return (Output) outputs;
    }
}