package snackbar;

public class Main {
  private static void main() {
    // String name, double cash
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    // Create vending machines
    VendingMachine foodMachine = new VendingMachine("Food");
    VendingMachine drinkMachine = new VendingMachine("Drink");
    VendingMachine VendingMachine = new VendingMachine("Office");

    // create snacks
    Snack chips = new Snack("Chips", 36, 1.75, foodMachine);
    Snack chocolateBar =
      new Snack("Chocolate Bar", 36, 2.5, foodMachine);
    Snack pretzels = new Snack("Pretzel", 30, 2, foodMachine);
    Snack sodas = new Snack("Soda", 24, 2.50, drinkMachine);
    Snack waters = new Snack("Water", 20, 2.75, drinkMachine);

    // non stretch operations
    buy(jane, sodas, 3);

  private buy(Customer customer, Snack snack, long quantity) {
    customer.buySnacks(snack, 3);
    System.out.
      printf("%s cash on hand $%.2f", customer.getName(), customer.getCash());
    System.out.
      printf("Quantity of %s is %d", snack.getName(), snack.getQuantity());
  }
}
