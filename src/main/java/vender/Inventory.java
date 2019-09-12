package vender;

import java.util.Map;

public class Inventory {
    Map<Output, Integer> tracker;
    void add(Output output){
        int count = tracker.get(output);
        tracker.put(output, count + 1);
    }

    public int getQuantity(Output output) {
        Integer value = tracker.get(output);
        int i = value == null ? 0 : value;
        return i;
    }
}
