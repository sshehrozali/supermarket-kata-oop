public class Customer {

    private int customerId;
    private String mobileNumber;

    public Customer() {
    }

    public Customer(int customerId, String mobileNumber) {
        this.customerId = customerId;
        this.mobileNumber = mobileNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void buy() {
        System.out.println("Customer is buying...");
    }

    public void returnItem() {
        System.out.println("Customer is returning...");
    }

    public void cancel() {
        System.out.println("Customer is cancelling...");
    }

    public void selectItem() {
        System.out.println("Customer is selecting an item...");
    }
}
