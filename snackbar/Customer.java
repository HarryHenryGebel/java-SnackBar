package snackbar;

public class Customer {
	// fields
	private static long maxId = 0;
	private long id;
	private String name;
	private double cash;

	// constructor
	public Customer(String name, double cash) {
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	public long getId() {
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

	public void addCash(double number) {
		this.cash = cash + number;
	}

	public void buySnacks(Snack snack, long number) {
    // remove snacks from machine
    snack.sellSnacks(number);
    this.cash -= number * snack.getCost();
	}
}
