import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AwesomeMart!");

        Supermarket supermarket = new Supermarket(
                "Planet Earth",
                777,
                "Manager-Jack",
                "jack@awesomemart.com");

        // Adding customers in supermarket
        supermarket.setCustomers(List.of(
                new Customer(1, "999888777"),
                new Customer(2, "111222333"),
                new Customer(3, "444555666")
        ));

        // Currently Storage shelves are empty
        supermarket.setStorageSpace(List.of(
                new Shelf(),
                new Shelf(),
                new Shelf()
        ));

        // Currently Customer shelves are empty
        supermarket.setCustomerSpace(List.of(
                new Shelf(),
                new Shelf(),
                new Shelf()
        ));


        Manager manager = supermarket.getManager();

        // Now manager adding items in Storage space (in shelf 1,2 and 3)
        manager.addItemInStorageSpace(new Item("iPhone 14", 3499.f), 0);
        manager.addItemInStorageSpace(new Item("Macbook", 87699.f), 1);
        manager.addItemInStorageSpace(new Item("Apple Watch", 1000.f), 2);

        // Now manager adding items in Customer space (in shelf 1,2 and 3)
        manager.addItemInCustomerSpace(new Item("Blanket", 90.f), 0);
        manager.addItemInCustomerSpace(new Item("Jacket", 6.f), 1);
        manager.addItemInCustomerSpace(new Item("Sneakers", 15.f), 2);

        System.out.println("\nManager: ");
        System.out.printf("Name: %s,    id: %s,     email: %s",
                supermarket.getManager().getName(),
                supermarket.getManager().getManagerId(),
                supermarket.getManager().getEmail());

        System.out.println("\n\nAll Cashiers: ");
        supermarket.getCashiers()
                .forEach(cashier -> System.out.printf("Name: %s     id: %s      counter: %s\n",
                        cashier.getCashierName(),
                        cashier.getCashierName(),
                        cashier.getCounterNumber()));

        System.out.println("\nStorage Space: ");
        supermarket.getStorageSpace()
                .forEach(space -> System.out.printf("Item: %s   price: %s\n",
                        space.getItem().getName(),
                        space.getItem().getPrice()));

        System.out.println("\nCustomer Space: ");
        supermarket.getCustomerSpace()
                .forEach(space -> System.out.printf("Item: %s   price: %s\n",
                        space.getItem().getName(),
                        space.getItem().getPrice()));
    }
}