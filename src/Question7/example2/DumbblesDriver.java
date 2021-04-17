package Question7.example2;


import Question7.example2.Dumbbles;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saikumar Mylavarapu
 */
public class DumbblesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		Scanner sc = new Scanner(System.in);
                        System.out.println("Output for Question 7 by Saikumar Mylavarapu");
		System.out.println("Please select a product number to display the Weight \n 1.First Dumbble \n 2.Second Dumbble \n 3.Third Dumbble \n 4.Display weights of all the prices");
		int num = sc.nextInt();
		while(num<1 && num>4)
		{
			System.out.println("select a number from the given list ");
			num = sc.nextInt();
		}
		String s = "";
		switch(num)
		{
		case 1: s = "one";
				break;

		case 2: s = "two";
				break;

		case 3: s = "three";
				break;
		}
		
		if(num == 1 || num == 2 || num == 3)
		{
			System.out.println("Weight of "+s+" is: "+Dumbbles.valueOf(s.toUpperCase()).getWeight()+"Kgs");
		}
		else {
			for(Dumbbles iterator : Dumbbles.values())
			{
				System.out.println(iterator.name()+ " is  :"+iterator.getWeight()+" Kgs");
			}
		}
		
    }
    
}
