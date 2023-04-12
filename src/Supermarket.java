import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private String location;
    private List<Shelf> customerSpace;
    private List<Shelf> storageSpace;
    private List<Cashier> cashiers;
    private List<Customer> customers;
    private Manager manager;
    private List<Alert> alerts;
    private Enter enter;

    public Supermarket(String location,
                       int supermarketManagerId,
                       String supermarketManagerName,
                       String supermarketManagerEmail) {
        this.location = location;

        this.customerSpace = new ArrayList<>();
        this.storageSpace = new ArrayList<>();

        this.cashiers = new ArrayList<>();
        // By default, or at time of instantiation -> add at least 1 Cashier
        cashiers.add(new Cashier(999, "Cashier-Joe", 10));

        this.customers = new ArrayList<>();
        this.alerts = new ArrayList<>();

        // Supermarket will have 1 Manager (1..1)
        this.manager = new Manager(supermarketManagerId, supermarketManagerName, supermarketManagerEmail, this);

        this.enter = new Enter(this);
    }

    public String getLocation() {
        return location;
    }

    public List<Shelf> getCustomerSpace() {
        return customerSpace;
    }

    public List<Shelf> getStorageSpace() {
        return storageSpace;
    }

    public List<Cashier> getCashiers() {
        return cashiers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Manager getManager() {
        return manager;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCustomerSpace(List<Shelf> customerSpace) {
        this.customerSpace = customerSpace;
    }

    public void setStorageSpace(List<Shelf> storageSpace) {
        this.storageSpace = storageSpace;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    // Adds new Cashier in Supermarket
    public void addCashier(Cashier newCashier) {
        cashiers.add(newCashier);
    }
}
