package vender;

public enum Product {
    COKE(25), PEPSI(35), SODA(45);
    double amount;

    Product(double amount) {
    }

    public double getCoins() {
        return amount;
    }
}
