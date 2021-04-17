package Question4;


import Question4.Phone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public class PhoneDriver {
    
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Output for Question 4 by Saikumar Mylavarapu");
		Phone obj = new Samsung(); // This is called polymorphic substituion or polymorphism
		obj.calling(); // Late binding polymorphism  and the process of going it to the 
		//super class because the method phone is not there in the samsung class this is called Inheritance
		obj.messging();

	}

    
}
