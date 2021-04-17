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


public class Faculty extends Employee{

	private double officeHours;
	private int noOfSubjects;
	
	
	
	public Faculty(String name, String address, long phone, String email,
                String office, double salary, Date dateHired,
			double officeHours, int noOfSubjects) {
		super(name, address, phone, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.noOfSubjects = noOfSubjects;
	}



	@Override
	public String toString() {
		return "Faculty [name=" + getName() + "]";
	}
}
