package Question5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public class Person {
	
	private String name;
	private String address;
	private long phone;
	private String email;
	
	
	
	public Person(String name, String address, long phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + getName() + "]";
	}
	
	
	
	

}
