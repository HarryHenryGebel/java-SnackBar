package snackbar;

public class VendingMachine {
	private static long maximumId = 0;
	private long id;
	private String name;

	public VendingMachine(String name) {
		maximumId++;
		id = maximumId;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
