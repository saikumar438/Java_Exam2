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
public class Staff extends Employee{
	
	private String title;
	
	
	
	public Staff(String name, String address, long phone, String email, 
                String office, double salary, Date dateHired,
			String title) {
		super(name, address, phone, email, office, salary, dateHired);
		this.title = title;
	}


	@Override
	public String toString() {
		return "Staff [name=" + getName() + "]";
	}

}
