package Question7;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542300
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                System.out.println("Output for Question 7 by Saikumar Mylavarapu");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select a product number to display the price \n 1.Google Pixel \n 2.Iphone 12 \n 3.Lumia 950 \n 4.Display prices of all the phones");
		int num = sc.nextInt();
		while(num<1 && num>4)
		{
			System.out.println("select a number from the given list ");
			num = sc.nextInt();
		}
		String s = "";
		switch(num)
		{
		case 1: s = "Google_pixel";
				break;

		case 2: s = "Iphone_12";
				break;

		case 3: s = "Lumia_950";
				break;
		}
		
		if(num == 1 || num == 2 || num == 3)
		{
			System.out.println("Price of "+s+" is: "+Phone.valueOf(s.toUpperCase()).getPrice()+"$");
		}
		else {
			for(Phone iterator : Phone.values())
			{
				System.out.println(iterator.name()+ " is  :"+iterator.getPrice());
			}
		}
		
		
		
	}

}

