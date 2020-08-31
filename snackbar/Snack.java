package snackbar;

public class Snack {
	private static int maximumId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;

  // If this were a database join, the spec would be right. But it's not.
  private VendingMachine vendingMachine;

	public
    Snack(String name, int quantity, double cost, VendingMachine vendingMachine) {
		maximumId++;
		id = maximumId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachine = vendingMachine;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getCost() {
		return cost;
	}

	public VendingMachine getVendingMachine() {
		return vendingMachine;
	}

	public double getTotalCost(){
		return quantity * cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setVendingMachine(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	public void sellSnacks(int number) {
		this.quantity -= number;
	}

  public void stockSnacks(int number) {
		this.quantity += number;
	}
}
