/*
 * File: Salesman.java
 * Author: Carrie Miles
 * Date: 03/12/18
 * Purpose: Subclass to Employee superclass
 * 		Constructs and defines Salesman objects
 */
package EmployeeData;

public class Salesman extends Employee {

	private int annualSales;
	private int baseSalary;
	private int yearSalary;
	private int addComm;

	public Salesman(String name, int salary, int annualSales) {
		super(name, salary);
		this.annualSales = annualSales;

	}

	public Salesman() {

		this.annualSales = 0;

	}

	// toString method including superclass data
	@Override
	public String toString() {
		return super.toString() + "\nAnnual Sales: " + annualSales;
	}

	@Override
	public int annualSalary() {
		// Uses get salary to get salary and multiply for yearly salary
		baseSalary = this.getSalary() * 12;
		// Calculate Commission
		addComm = (int) (annualSales * 0.02);
		if (addComm < 20000) { // MAX Commission is $20000
			yearSalary = baseSalary + addComm;
		} else {
			yearSalary = baseSalary + 20000;
		}
		return yearSalary;
	}

	// getter methods
	public int getAnnualSales() {
		return annualSales;
	}

	// setter methods
	public void setAnnualSales(int sales) {
		this.annualSales = sales;
	}

	// TEST display
	public void display() {
		System.out.println("Salesman \n" + this + "\n");
	}
}// end class
