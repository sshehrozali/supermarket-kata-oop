import java.util.Date;
import java.util.List;

public class Alert {
    private String location;
    private Date expiryDate;
    private int threshold;

    public Alert(String location, Date expiryDate, int threshold) {
        this.location = location;
        this.expiryDate = expiryDate;
        this.threshold = threshold;
    }

    public Alert() {
    }

    public String getLocation() {
        return location;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}
