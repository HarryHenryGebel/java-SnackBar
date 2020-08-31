package snackbar;

public class Snack {
	private static int maximumId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineID) {
		maximumId++;
		id = maximumId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
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

	public int getVendingMachineId() {
		return vendingMachineId;
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

	public void setVendingMachineId(VendingMachine vendingMachine) {
		this.vendingMachineId = vendingMachine.getId();
	}

	public void sellSnacks(int number) {
		this.quantity = quantity - number;
	}

  public void stockSnacks(int number) {
		this.quantity = quantity + number;
	}
}
