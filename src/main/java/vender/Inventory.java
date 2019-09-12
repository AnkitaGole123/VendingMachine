package vender;

import java.util.Map;

public class Inventory {
    Map<Output, Integer> tracker;
    void add(Output output){
        int count = tracker.get(output);
        tracker.put(output, count + 1);
    }
}
