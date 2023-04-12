import java.util.Date;
import java.util.List;

public class Shelf {
    private int shelfId;
    private Date expiryDate;
    private Item item;
    private int quantity;
    private int threshold;
    private List<Alert> alerts;

    public Shelf(int shelfId, Date expiryDate, Item item, int quantity, int threshold, List<Alert> alerts) {
        this.shelfId = shelfId;
        this.expiryDate = expiryDate;
        this.item = item;
        this.quantity = quantity;
        this.threshold = threshold;
        this.alerts = alerts;
    }

    public Shelf() {
    }

    public int getShelfId() {
        return shelfId;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    // Check shelf expiry date
    public Date checkExpiryDate() {
        return getExpiryDate();
    }

    // Check shelf threshold
    public int checkThreshold() {
        return getThreshold();
    }

    // Takes which alert to get location?
    public String checkLocation(Alert alert) {
        return alert.getLocation();
    }

    // Method to delete Item from shelf
    public void deleteItem() {
        this.item = null;   // Make Item null
    }
}
