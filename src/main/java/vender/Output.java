package vender;

public class Output {

    private String product;
    private double remainingChange;

    public String getProduct() {
        return product;
    }

    public double getRemainingChange(double actualAmount, double amount) {
        return amount - actualAmount;
    }
}
