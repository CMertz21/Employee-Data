/*
 * File: Employee.java
 * Author: Carrie Miles
 * Date: 03/12/18
 * Purpose: Employee superclass to Salesman and Executive class
 * 		Constructs and defines Employee objects
 */

package EmployeeData;

public class Employee {
	// initialize data fields
	private String name;
	private int salary;

	// constructor that allows the name and monthly salary
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = (salary);
	}

	// default constructor
	public Employee() {
		this.name = "";
		this.salary = 0;
	}

	// method that returns the salary for a whole year
	public int annualSalary() {
		int yearSalary = 0;
		yearSalary = salary * 12;
		return yearSalary;
	}

	// toString method
	public String toString() {
		return "Name: " + name + "\nMonthly Salary: " + getSalary() + "\nAnnual Salary: " + annualSalary();
	}

	// Display test methods
	public void display() {
		System.out.println("Employee \n" + this + "\n");
	}

	// getter methods
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	// setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Average of all salaries
	public int average(int[] data) {
		int sum = 0;
		int average = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
			average = sum / data.length;
		}
		return average;
	}
}// end class
