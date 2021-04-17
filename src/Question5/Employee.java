package Question5;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */

public class Employee extends Person{

	private String office;
	private double salary;
	private Date dateHired;
	
	
	public Employee(String name, String address, long phone, String email,
                String office, double salary,
			Date dateHired) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}


	@Override
	public String toString() {
		return "Employee [name=" + getName() + "]";
	}
}
