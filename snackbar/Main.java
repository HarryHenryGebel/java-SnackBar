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
    Snack chips = new Snack("Chips", 36, 1.75, foodMachine.getId());
    Snack chocolateBar =
      new Snack("Chocolate Bar", 36, 2.5, foodMachine.getId());
    Snack pretzels = new Snack("Pretzel", 30, 2, foodMachine.getId());
    Snack sodas = new Snack("Soda", 24, 2.50, drinkMachine.getId());
    Snack waters = new Snack("Water", 20, 2.75, drinkMachine.getId());
}
