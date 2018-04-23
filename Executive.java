package EmployeeData;

public class Executive extends Employee {

	private int stockPrice;
	private int yearSalary;

	// default constructor
	public Executive() {
		this.stockPrice = 0;
	}

	// parameterized constructor
	public Executive(String name, int monthlySalary, int stockPrice) {
		super(name, monthlySalary);
		this.stockPrice = stockPrice;
	}

	public int annualSalary() {
		// Uses get salary to get salary and multiply for yearly salary
		yearSalary = this.getSalary() * 12;
		// Calculate Bonus
		if (stockPrice > 50) { // Add Bonus if stockPrice is >50
			yearSalary = yearSalary + 30000;
		}
		return yearSalary;
	}

	// toString method including superclass data
	public String toString() {
		return super.toString() + "\nStock Price: " + stockPrice;
	}

	// TEST display
	public void display() {
		System.out.println("Executive \n" + this + "\n");
	}
	// getter methods

	public int getStockPrice() {
		return stockPrice;
	}
	// setter methods

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
}
