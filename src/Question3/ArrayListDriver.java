package Question3;


import java.util.ArrayList;
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
public class ArrayListDriver {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> objectList = new ArrayList<>();
            System.out.println("Output for Question 3 by Saikumar Mylavarapu");
		
		Loan l = new Loan(1500000,9.2,16);
		Date d = new Date();
		String s = new String("Saikumar");
		Circle c = new Circle(5,79);
		objectList.add(l);
		objectList.add(d);
		objectList.add(s);
		objectList.add(c);

		for(Object iterator : objectList)
		{
			System.out.println(iterator);
		}
		
	}

    
}
