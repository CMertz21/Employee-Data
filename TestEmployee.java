package EmployeeData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {

	
	
	

	public static void main(String[] args) {
		
	int sum=0;
	int year;
	int salary;
	int sales =0;;
	int stockPrice;
	String type;
	String name;
	int [] year1Avg = new int[10];
	int [] year2Avg = new int [10];
	
	
	
	//Create Array
	ArrayList <Employee> year1 = new ArrayList(10);
	ArrayList <Employee> year2 = new ArrayList(10);
	
	
	//try/catch/finally
	try {
		Scanner inputFile = new Scanner (new File("Employee.txt"));
	
		//Read one line at a time
		do
		{
				year = Integer.parseInt(inputFile.next());
				type = inputFile.next();
				name = inputFile.next();
				salary = Integer.parseInt(inputFile.next());
				
				//if type Employee create employee object
			if (type.equalsIgnoreCase("Employee")) {
				Employee employee = new Employee();
				employee.setName(name);
				employee.setSalary(salary);
				if (year==2014) {
					year1.add(employee);
				}else {
					year2.add(employee);
				}
			}//end if Employee
			
			//if Salesman create Salesman object
			if (type.equalsIgnoreCase("Salesman")) {
				Salesman salesman = new Salesman();
				salesman.setName(name);
				salesman.setSalary(salary);
				sales = Integer.parseInt(inputFile.next());
				salesman.setAnnualSales(sales);
				if (year ==2014) {
					year1.add(salesman);
					} else {
						year2.add(salesman);
					}
			}//end if Salesman
			
			//if Executive create executive object
			if (type.equalsIgnoreCase("Executive")) {
				Executive executive = new Executive();
				executive.setName(name);
				executive.setSalary(salary);
				stockPrice = Integer.parseInt(inputFile.next());
				executive.setStockPrice(stockPrice);
				if (year == 2014) {
					year1.add(executive);
				}else {
					year2.add(executive);
				}
			}//end if Executive
		
		}
		while (inputFile.hasNext()==true);

		//Print Employee Data for all years
		int i=0;
		System.out.println("\n************Employee Data for 2014*********** \n");
		for (i=0; i<year1.size();i++) {
			Employee one = year1.get(i);
			one.display();
		//get average salary for 2014
			//get numbers
			int avg1 = one.annualSalary();
			year1Avg[i]= avg1;
			sum =sum +year1Avg[i];
			}
			//get average
			int average1 = sum/i;
			System.out.println("\nThe average of all salaries in 2014 are:");
			System.out.print("$" + average1 + "\n");
			
			
		sum =0;	
		//Print Employee Data for 2015
		System.out.println("\n************Employee Data for 2015*********** \n");
		//reset i
		i=0;
		for (i=0; i<year2.size();i++) {
			Employee two = year2.get(i);
			two.display();
			//get average salary for 2015
				//get numbers
				int avg2 = two.annualSalary();
				year2Avg[i]= avg2;
				sum =sum +year2Avg[i];
				}
				//get average
				int average2 = sum/i;
				System.out.println("\nThe average of all salaries in 2015 are:");
				System.out.print("$" + average2 + "\n");
		
		inputFile.close();
	}catch(FileNotFoundException e){
		System.out.println("File not Found");
	} 
	
	}//end main
	
}//end class


