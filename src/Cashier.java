import java.util.List;

public class Cashier {
    private int cashierId;
    private String cashierName;
    private int counterNumber;

    public Cashier(int cashierId, String cashierName, int counterNumber) {
        this.cashierId = cashierId;
        this.cashierName = cashierName;
        this.counterNumber = counterNumber;
    }

    public Cashier() {
    }

    public int getCashierId() {
        return cashierId;
    }

    public String getCashierName() {
        return cashierName;
    }

    public int getCounterNumber() {
        return counterNumber;
    }

    public void setCashierId(int cashierId) {
        this.cashierId = cashierId;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public void setCounterNumber(int counterNumber) {
        this.counterNumber = counterNumber;
    }

    // Scan each item
    public double scanItem(Item item) {
        return item.getPrice();
    }

    // Calculate sum of all items
    public double sumUp(List<Item> items) {
        // Calculating sum using streams
        double sum = items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
        return sum;
    }

    public double openPurchasedOrder() {
        return 0.f;
    }
}
