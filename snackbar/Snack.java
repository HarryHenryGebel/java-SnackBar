package snackbar;

public class Snack {
	private static long maximumId = 0;
	private long id;
	private String name;
	private long quantity;
	private double cost;
	private long vendingMachineId;

	public Snack(String name, long quantity, double cost, long vendingMachineID) {
		maximumId++;
		id = maximumId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getQuantity() {
		return quantity;
	}

	public double getCost() {
		return cost;
	}

	public long getVendingMachineId() {
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
