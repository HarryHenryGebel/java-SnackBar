package snackbar;

public class Customer {
	// fields
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	// constructor
	public Customer(String name, double cash) {
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCash() {
		return cash;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCash(double num) {
		this.cash = cash + num;
	}

	public void buySnacks(int num) {
		this.cash = cash - num;
	}
}
