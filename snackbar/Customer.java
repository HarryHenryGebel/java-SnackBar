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
}
