package snackbar;

public class VendingMachine {
	private static int maximumId = 0;
	private int id;
	private String name;

	public VendingMachine(String name) {
		maximumId++;
		id = maximumId;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
