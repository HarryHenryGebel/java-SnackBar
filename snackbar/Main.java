package snackbar;

public class Main {

  public static void main(String[] args) {
    // String name, double cash
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    // Create vending machines
    VendingMachine foodMachine = new VendingMachine("Food");
    VendingMachine drinkMachine = new VendingMachine("Drink");
    VendingMachine officeMachine = new VendingMachine("Office");

    // create snacks
    Snack chips = new Snack("Chips", 36, 1.75, foodMachine);
    Snack chocolateBars = new Snack("Chocolate Bar", 36, 2.5, foodMachine);
    Snack pretzels = new Snack("Pretzel", 30, 2, foodMachine);
    Snack sodas = new Snack("Soda", 24, 2.50, drinkMachine);
    Snack waters = new Snack("Water", 20, 2.75, drinkMachine);

    // non stretch operations
    buy(jane, sodas, 3);
    buy(jane, pretzels, 1);
    buy(bob, sodas, 2);
    topUp(jane, 10);
    buy(jane, chocolateBars, 1);
    stock(pretzels, 12);
    buy(bob, pretzels, 3);

    // stretch operations
    inventory(chips);
  }

  private static void buy(Customer customer, Snack snack, int quantity) {
    customer.buySnacks(snack, 3);
    System.out.printf(
      "%s cash on hand $%,.2f%n",
      customer.getName(),
      customer.getCash()
    );
    System.out.printf(
      "Quantity of %s is %d%n%n",
      snack.getName(),
      snack.getQuantity()
    );
  }

  private static void inventory(Snack snack) {
    System.out.printf("Snack: %s%n", snack.getName());
    System.out.printf(
      "Vending Machine: %s%n",
      snack.getVendingMachine().getName()
    );
    System.out.printf("Quantity: %d%n", snack.getQuantity());
    System.out.printf("Total Cost: $%,.2f%n%n", snack.getTotalCost());
  }

  private static void stock(Snack snack, int quantity) {
    snack.stockSnacks(quantity);
    System.out.printf(
      "Quantity of %s is %d%n%n",
      snack.getName(),
      snack.getQuantity()
    );
  }

  private static void topUp(Customer customer, int cash) {
    customer.addCash(cash);
    System.out.printf(
      "%s cash on hand $%,.2f%n%n",
      customer.getName(),
      customer.getCash()
    );
  }
}
