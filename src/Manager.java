import java.util.List;

public class Manager {
    private int managerId;
    private String name;
    private String email;
    private Supermarket supermarket;

    public Manager(int managerId, String name, String email, Supermarket supermarket) {
        this.managerId = managerId;
        this.name = name;
        this.email = email;
        this.supermarket = supermarket;
    }

    public int getManagerId() {
        return managerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Supermarket getSupermarket() {
        return supermarket;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSupermarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    // Add item in supermarket storage space
    public void addItemInStorageSpace(Item item, int storageSpaceShellIndex) {
        List<Shelf> storageSpaceShelves = supermarket.getStorageSpace();
        Shelf storageSpaceShelf = storageSpaceShelves.get(storageSpaceShellIndex);    // get storage space shelf by index
        storageSpaceShelf.setItem(item);    // set item in that shelf (of storage space shelves)
    }

    // Add item in supermarket customer space
    public void addItemInCustomerSpace(Item item, int customerSpaceShelfIndex) {
        List<Shelf> customerSpaceShelves = supermarket.getCustomerSpace();
        Shelf customerSpaceShelf = customerSpaceShelves.get(customerSpaceShelfIndex);   // get customer space shelf by index
        customerSpaceShelf.setItem(item);   // set item in that shelf (of customer space shelves)
    }

    public void removeItemInStorageSpace(int storageSpaceShelfIndex) {
        List<Shelf> storageSpaceShelves = supermarket.getStorageSpace();
        Shelf storageSpaceShelf = storageSpaceShelves.get(storageSpaceShelfIndex);  // get storage space shelf by index
        storageSpaceShelf.deleteItem();     // delete item from shelf
    }

    public void removeItemInCustomerSpace(int customerSpaceShelfIndex) {
        List<Shelf> customerSpaceShelves = supermarket.getCustomerSpace();
        Shelf customerSpaceShelf = customerSpaceShelves.get(customerSpaceShelfIndex);   // get customer space shelf by index
        customerSpaceShelf.deleteItem();    // delete item from shelf
    }

    // Replace item in desired shelf
    public void replaceItem(Item newItem, String shelfType, int shelfIndex) {
        // If item is for storage space
        if (shelfType.equals("storage")) {
            supermarket
                    .getStorageSpace()
                    .get(shelfIndex)
                    .setItem(newItem);  // replace with new item
        }

        // If item is for customer space
        if (shelfType.equals("customer")) {
            supermarket
                    .getCustomerSpace()
                    .get(shelfIndex)
                    .setItem(newItem);  // replace with new item
        } else {
            System.out.println("Sorry required shelf not found.");
        }
    }

    // Check alerts
    public List<Alert> checkAlert() {
        return supermarket.getAlerts();
    }
}
